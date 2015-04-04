package com.cybermint.siteDetector;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.cybermint.pageRank.PageRankChecker;
import com.cybermint.utils.GeneralUtils;
import com.cybermint.utils.TextFileReaderUtils;
import com.cybermint.utils.TextFileWriterUtils;
import com.cybermint.utils.URLUtils;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;

public class ElggDetector implements Callable {

	private String url;
	private URL urlObject;
	private Boolean isElggDetected = false;
	private List<String> registerUrlSuffixes = Arrays.asList("register",
			"account/register.php", "pg/register/");

	public ElggDetector(String url) {
		this.url = url;
	}

	@Override
	public Map<String, String> call() {
		Map<String, String> urlProperties = isElgg(this.url);
		return urlProperties;

	}

	public Map<String, String> isElgg(String url) {
		Map<String, String> urlProperties = new TreeMap<String, String>();
		try {
			this.urlObject = new URL(url);
			urlProperties.put("url", url);
			urlProperties.put("isElgg", "false");
			urlProperties.put("registerUrlAvailable", "false");
			urlProperties.put("registerFormAvailable", "false");
			// urlProperties.put("ElggRelease", "");
			// urlProperties.put("ElggVersion", "");
			// urlProperties.put("scripts", "");
			// urlProperties.put("links", "");
			// urlProperties.put("exception", "");
			Document doc = Jsoup.connect(url).timeout(20000).get();
			Elements elggReleaseElements = doc.select("meta[name=ElggRelease]");
			Elements elggVersionElements = doc.select("meta[name=ElggVersion]");
			Elements scriptElements = doc.select("script[src]");
			Elements linkElements = doc.select("link[href]");
			for (Element elggReleaseElement : elggReleaseElements) {
				urlProperties.put("ElggRelease",
						elggReleaseElement.attr("content"));
				this.isElggDetected = true;
				break;
			}
			for (Element elggVersionElement : elggVersionElements) {
				urlProperties.put("ElggVersion",
						elggVersionElement.attr("content"));
				this.isElggDetected = true;
				break;
			}
			for (Element scriptElement : scriptElements) {
				String scriptSrc = scriptElement.attr("src");
				if (null != scriptSrc) {
					if (scriptSrc.contains("elgg")) {
						urlProperties.put("scripts", scriptElement.attr("src"));
						this.isElggDetected = true;
					}
					if (scriptSrc.contains("vendors/jquery")) {
						String elggHome = scriptElement.attr("src").replaceAll(
								"vendors/jquery.*", "");
						if (elggHome.isEmpty()
								|| elggHome.equalsIgnoreCase("/")) {
							elggHome = urlObject.getProtocol() + "://"
									+ urlObject.getHost() + "/";
						}
						urlProperties.put("elggHome", elggHome);
						this.isElggDetected = true;
					}
				}
			}
			for (Element linkElement : linkElements) {
				String linkHref = linkElement.attr("href");
				if (null != linkHref) {
					if (linkHref.contains("elgg")) {
						urlProperties.put("links", linkElement.attr("href"));
						this.isElggDetected = true;
						break;
					}
				}
			}
		} catch (Exception e) {
			urlProperties.put("exception", e.getMessage());
			// e.printStackTrace();
		} finally {
			if (this.isElggDetected) {
				urlProperties.put("isElgg", "true");
			}
		}

		if (urlProperties.get("isElgg").equalsIgnoreCase("true")) {
			Integer statusCode = 0;
			Boolean registerUrlFound = false;
			for (String registerUrlSuffix : registerUrlSuffixes) {
				if (!registerUrlFound) {
					Response response = null;
					String registerUrl = null;
					try {
						registerUrl = urlProperties.get("elggHome")
								+ registerUrlSuffix;
						//System.out.println("Checking for : " + registerUrl);
						response = Jsoup.connect(registerUrl).timeout(20000)
								.execute();
						statusCode = response.statusCode();
						//System.out.println("Status Code for : " + registerUrl + " is " + statusCode);
					} catch (Exception e) {
						// e.printStackTrace();
					}
					if (statusCode.equals(200)) {
						urlProperties.put("registerUrlAvailable", registerUrl);
						//System.out.println("Added : " + registerUrl);
						try {
							Document registerDoc = response.parse();
							urlProperties.put("registerUrlAvailable",
									registerUrl);
							registerUrlFound = true;
							Elements registerFormElements = registerDoc.select("form[action*=register]");
							for(Element registerFormElement : registerFormElements) {
								Elements elggTokenElements = registerFormElement.select("input[name=__elgg_token]");
								if (!elggTokenElements.isEmpty()) {
									urlProperties
											.put("registerFormAvailable",
													"true");
									break;
								}
							}
						} catch (IOException e) {
							// e.printStackTrace();
						}
					}
				}

			}

			if (!registerUrlFound) {
				List<String> listOfAllFolderUrls = URLUtils
						.getAllFolderUrls(url);
				for (String potentialElggHome : listOfAllFolderUrls) {
					if (!registerUrlFound) {
						for (String registerUrlSuffix : registerUrlSuffixes) {
							if (!registerUrlFound) {
								Response response = null;
								String registerUrl = null;
								try {
									registerUrl = potentialElggHome
											+ registerUrlSuffix;
									//System.out.println("Checking for : " + registerUrl);
									response = Jsoup.connect(registerUrl)
											.timeout(20000).execute();
									statusCode = response.statusCode();
									//System.out.println("Status Code for : " + registerUrl + " is " + statusCode);
								} catch (Exception e) {
									//System.out.println(e.getMessage());
								}
								if (statusCode.equals(200)) {
									//System.out.println("Added : " + registerUrl);
									try {
										Document registerDoc = response.parse();
										urlProperties.put("registerUrlAvailable",
												registerUrl);
										urlProperties.put("elggHome", potentialElggHome);
										registerUrlFound = true;
										Elements registerFormElements = registerDoc.select("form[action*=register]");
										for(Element registerFormElement : registerFormElements) {
											Elements elggTokenElements = registerFormElement.select("input[name=__elgg_token]");
											if (!elggTokenElements.isEmpty()) {
												urlProperties
														.put("registerFormAvailable",
																"true");
												break;
											}
										}
									} catch (IOException e) {
										// e.printStackTrace();
									}
								}
							}

						}
						
					}
				}
			}

		}
		
		/*if(urlProperties.get("registerFormAvailable").equalsIgnoreCase("true")) {
			urlProperties.put("registerFormElements", getFormElements(urlProperties.get(url)));
		}*/
		return urlProperties;
	}
	
	public static List<String> getFormElements(String url) {
		Response response = null;
		Integer statusCode = 0;
		List<String> formElementsAsString = new ArrayList<String> ();
		try {
			//System.out.println("Checking for : " + registerUrl);
			response = Jsoup.connect(url)
					.timeout(20000).execute();
			statusCode = response.statusCode();
			//System.out.println("Status Code for : " + registerUrl + " is " + statusCode);
		} catch (Exception e) {
			//System.out.println(e.getMessage());
		}
		if (statusCode.equals(200)) {
			//System.out.println("Added : " + registerUrl);
			try {
				Document registerDoc = response.parse();
				Elements registerFormElements = registerDoc.select("form[action*=register]");
				Elements formInputElements = new Elements ();
				for(Element registerFormElement : registerFormElements) {
					formInputElements.addAll(registerFormElement.select("input:not([type~=hidden|submit])"));
				}				
				for(Element formInputElement : formInputElements) {
					StringBuilder nameAndType = new StringBuilder();
					nameAndType.append("name=").append(formInputElement.attr("name"));
					nameAndType.append(" AND ");
					nameAndType.append("type=").append(formInputElement.attr("type"));
					formElementsAsString.add(nameAndType.toString());
				}
			} catch (IOException e) {
				// e.printStackTrace();
			}
		}
		return formElementsAsString;
	}
	
	public static void main1(String[] args) {
		List<String> urls = TextFileReaderUtils.readLinesAsList(
				"G:/Google Drive/elgg-sites-with-register-form-test.txt", true);
		Map<String, List<String>> sitesWithAFormElement = new TreeMap<String, List<String>> ();
		for(String url : urls) {
			List<String> formElementsAsString = getFormElements(url);
			for(String formElementAsString : formElementsAsString) {
				if(null != sitesWithAFormElement.get(formElementAsString)) {
					sitesWithAFormElement.get(formElementAsString).add(url);
				} else {
					List<String> urlsWithThisElement = new ArrayList<String> ();
					urlsWithThisElement.add(url);
					sitesWithAFormElement.put(formElementAsString, urlsWithThisElement);
				}
			}
		}
		
		SortedSet<Entry<String,List<String>>> sortedSitesWithAFormElement = GeneralUtils.entriesSortedByListSizeInValues(sitesWithAFormElement);
		System.out.print("URL,Domain PR,");
		for(Entry<String,List<String>> formElementWithUrls : sortedSitesWithAFormElement) {
			System.out.print(formElementWithUrls.getKey()+",");
		}
		System.out.println();
		for(String url : urls) {
			System.out.print(url+",");
			System.out.print(PageRankChecker.getDomainPageRank(url)+",");
			for(Entry<String,List<String>> formElementWithUrls : sortedSitesWithAFormElement) {
				List<String> urlsWithThisElement = sitesWithAFormElement.get(formElementWithUrls.getKey());
				System.out.print(urlsWithThisElement.contains(url)+",");
			}
			System.out.println();
		}
	}

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		List<String> urls = TextFileReaderUtils.readLinesAsList(
				"G:/Google Drive/elgg-sites.txt", true);
		TextFileWriterUtils atextFileWriter = new TextFileWriterUtils("G:/Google Drive/detected-elgg-sites2.txt");
		atextFileWriter.writeContentToFile("Url*isElgg*Elgg Home*Register Url Available*Register Form Available*ElggRelease*ElggVersion*scripts*links*exception");
		atextFileWriter.closeWriter();
		System.out
				.println("Url*isElgg*Elgg Home*Register Url Available*Register Form Available*ElggRelease*ElggVersion*scripts*links*exception");
		// ThreadPoolExecutor es = new
		// ThreadPoolExecutor(5,20,20,TimeUnit.SECONDS,new
		// LinkedBlockingQueue<Runnable>());
		ListeningExecutorService service = MoreExecutors
				.listeningDecorator(Executors.newFixedThreadPool(10));
		for (String url : urls) {
			ElggDetector anElggDetector = new ElggDetector(url);
			ListenableFuture<Map<String, String>> urlPropertiesFuture = service
					.submit(anElggDetector);
			Futures.addCallback(urlPropertiesFuture,
					new FutureCallback<Map<String, String>>() {
						public void onSuccess(Map<String, String> urlProperties) {
							StringBuilder urlPropertiesBuilder = new StringBuilder();
							if (null != urlProperties) {
								urlPropertiesBuilder.append(
										urlProperties.get("url")).append("*");
								urlPropertiesBuilder.append(
										urlProperties.get("isElgg"))
										.append("*");
								urlPropertiesBuilder.append(
										urlProperties.get("elggHome")).append(
										"*");
								urlPropertiesBuilder.append(
										urlProperties
												.get("registerUrlAvailable"))
										.append("*");
								urlPropertiesBuilder.append(
										urlProperties
												.get("registerFormAvailable"))
										.append("*");
								urlPropertiesBuilder.append(
										urlProperties.get("ElggRelease"))
										.append("*");
								urlPropertiesBuilder.append(
										urlProperties.get("ElggVersion"))
										.append("*");
								urlPropertiesBuilder.append(
										urlProperties.get("scripts")).append(
										"*");
								urlPropertiesBuilder.append(
										urlProperties.get("links")).append("*");
								urlPropertiesBuilder.append(urlProperties
										.get("exception"));
							}
							if(urlProperties.get("registerFormAvailable").equalsIgnoreCase("true")) {
								try {
									TextFileWriterUtils atextFileWriter = new TextFileWriterUtils("G:/Google Drive/detected-elgg-sites2.txt");
									atextFileWriter.writeContentToFile(urlPropertiesBuilder.toString());
									atextFileWriter.closeWriter();
								} catch (IOException e) {
									e.printStackTrace();
								}
							}							
							System.out.println(urlPropertiesBuilder.toString());
						}

						public void onFailure(Throwable thrown) {
							thrown.printStackTrace();
						}
					});

		}
		// System.out.println(anElggDetector.isElgg("http://www.sdpio.net/elgg/pages/view/1421/are-you-experiencing-head-sweating"));
		// System.out.println(anElggDetector.isElgg("http://socialcmsbuzz.com/7-social-network-websites-powered-by-elgg-15-23042009/"));
		/*
		 * Document doc = Jsoup.connect("http://jsoup.org").get(); Elements
		 * elements = doc.select("meta[name=keywords]"); for(Element element :
		 * elements) { System.out.println(element); }
		 */
	}

}
