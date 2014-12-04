package com.cybermint.siteDetector;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

import org.jsoup.Jsoup;
import org.jsoup.Connection.Response;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.cybermint.pageRank.PageRankChecker;
import com.cybermint.utils.GeneralUtils;
import com.cybermint.utils.TextFileReaderUtils;
import com.cybermint.utils.URLUtils;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;

public class PhpFoxDetector implements Callable {

	private String url;
	private URL urlObject;
	private Boolean isPhpFoxDetected = false;
	private List<String> registerUrlSuffixes = Arrays.asList(
			"index.php?do=/user/register/", "user/register/");
	private List<String> loginUrlSuffixes = Arrays.asList(
			"index.php?do=/user/login/", "user/login/");

	public PhpFoxDetector(String url) {
		this.url = url;
	}

	public Map<String, String> isPhpFox(String url) {
		Map<String, String> urlProperties = new TreeMap<String, String>();
		try {
			this.urlObject = new URL(url);
			urlProperties.put("url", url);
			urlProperties.put("isPhpFox", "false");
			Document doc = Jsoup.connect(url).timeout(20000).get();
			Elements authorElements = doc.select("meta[content=phpFox]");
			for (Element authorElement : authorElements) {
				urlProperties.put("isPhpFox", "true");
				this.isPhpFoxDetected = true;
				break;
			}

			if (this.isPhpFoxDetected) {
				Elements faviconElements = doc
						.select("link[rel=shortcut icon]");
				for (Element faviconElement : faviconElements) {
					String faviconUrl = faviconElement.attr("href");
					if (faviconUrl.contains("favicon.ico")) {
						String phpFoxHome = faviconUrl.replaceAll(
								"favicon\\.ico.*", "");
						urlProperties.put("phpFoxHome", phpFoxHome);
					}
				}

				Integer registerStatusCode = 0;
				Boolean registerUrlFound = false;
				for (String registerUrlSuffix : registerUrlSuffixes) {
					if (!registerUrlFound) {
						Response response = null;
						String registerUrl = null;
						try {
							registerUrl = urlProperties.get("phpFoxHome")
									+ registerUrlSuffix;
							// System.out.println("Checking for : " +
							// registerUrl);
							response = Jsoup.connect(registerUrl)
									.timeout(20000).execute();
							registerStatusCode = response.statusCode();
							// System.out.println("Status Code for : " +
							// registerUrl + " is " + statusCode);
						} catch (Exception e) {
							// e.printStackTrace();
						}
						if (registerStatusCode.equals(200)) {
							urlProperties.put("registerUrlAvailable",
									registerUrl);
							// System.out.println("Added : " + registerUrl);
							try {
								Document registerDoc = response.parse();
								registerUrlFound = true;
								Elements securityTokenElements = registerDoc
										.select("input[name=core[security_token]]");
								if (!securityTokenElements.isEmpty()) {
									urlProperties.put("registerFormAvailable",
											"true");
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
					for (String potentialPhpFoxHome : listOfAllFolderUrls) {
						if (!registerUrlFound) {
							for (String registerUrlSuffix : registerUrlSuffixes) {
								if (!registerUrlFound) {
									Response response = null;
									String registerUrl = null;
									try {
										registerUrl = potentialPhpFoxHome
												+ registerUrlSuffix;
										//System.out.println("Checking for : " + registerUrl);
										response = Jsoup.connect(registerUrl)
												.timeout(20000).execute();
										registerStatusCode = response.statusCode();
										//System.out.println("Status Code for : " + registerUrl + " is " + statusCode);
									} catch (Exception e) {
										//System.out.println(e.getMessage());
									}
									if (registerStatusCode.equals(200)) {
										urlProperties.put("registerUrlAvailable",
												registerUrl);
										urlProperties.put("phpFoxHome", potentialPhpFoxHome);
										//System.out.println("Added : " + registerUrl);
										try {
											Document registerDoc = response.parse();
											registerUrlFound = true;
											Elements securityTokenElements = registerDoc
													.select("input[name=core[security_token]]");
											if (!securityTokenElements.isEmpty()) {
												urlProperties
														.put("registerFormAvailable",
																"true");
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
				
				Integer loginStatusCode = 0;
				Boolean loginUrlFound = false;
				if(registerUrlFound) {
					for (String loginUrlSuffix : loginUrlSuffixes) {
						if (!loginUrlFound) {
							Response response = null;
							String loginUrl = null;
							try {
								loginUrl = urlProperties.get("phpFoxHome")
										+ loginUrlSuffix;
								//System.out.println("Checking for : " + registerUrl);
								response = Jsoup.connect(loginUrl)
										.timeout(20000).execute();
								loginStatusCode = response.statusCode();
								//System.out.println("Status Code for : " + registerUrl + " is " + statusCode);
							} catch (Exception e) {
								//System.out.println(e.getMessage());
							}
							if (loginStatusCode.equals(200)) {
								urlProperties.put("loginUrlAvailable",
										loginUrl);
								//System.out.println("Added : " + registerUrl);
								try {
									Document loginDoc = response.parse();
									loginUrlFound = true;
									Elements securityTokenElements = loginDoc
											.select("input[name=core[security_token]]");
									if (!securityTokenElements.isEmpty()) {
										urlProperties
												.put("loginFormAvailable",
														"true");
									}
								} catch (IOException e) {
									// e.printStackTrace();
								}
							}
						}

					}
				}
			}

		} catch (Exception e) {
			urlProperties.put("exception", e.getMessage());
			//e.printStackTrace();
		}

		return urlProperties;
	}

	@Override
	public Map<String, String> call() throws Exception {
		Map<String, String> urlProperties = isPhpFox(this.url);
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
	
	public static void main(String[] args) {
		List<String> urls = TextFileReaderUtils.readLinesAsList(
				"G:/Google Drive/phpfox-sites-with-register-form.txt", true);
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
	 */
	public static void main1(String[] args) {
		List<String> urls = TextFileReaderUtils.readLinesAsList(
				"G:/Google Drive/phpfox-keyword list1-unique domain.txt", true);
		System.out
				.println("Url*isPhpFox*PhpFox Home*Register Url Available*Register Form Available*Login Url Available*Login Form Available*exception");
		// ThreadPoolExecutor es = new
		// ThreadPoolExecutor(5,20,20,TimeUnit.SECONDS,new
		// LinkedBlockingQueue<Runnable>());
		ListeningExecutorService service = MoreExecutors
				.listeningDecorator(Executors.newFixedThreadPool(1));
		for (String url : urls) {
			PhpFoxDetector anPhpFoxDetector = new PhpFoxDetector(url);
			ListenableFuture<Map<String, String>> urlPropertiesFuture = service
					.submit(anPhpFoxDetector);
			Futures.addCallback(urlPropertiesFuture,
					new FutureCallback<Map<String, String>>() {
						public void onSuccess(Map<String, String> urlProperties) {
							StringBuilder urlPropertiesBuilder = new StringBuilder();
							if (null != urlProperties) {
								urlPropertiesBuilder.append(
										urlProperties.get("url")).append("*");
								urlPropertiesBuilder.append(
										urlProperties.get("isPhpFox"))
										.append("*");
								urlPropertiesBuilder.append(
										urlProperties.get("phpFoxHome")).append(
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
										urlProperties.get("loginUrlAvailable"))
										.append("*");
								urlPropertiesBuilder.append(
										urlProperties.get("loginFormAvailable"))
										.append("*");
								urlPropertiesBuilder.append(urlProperties
										.get("exception"));
							}
							System.out.println(urlPropertiesBuilder.toString());
						}

						public void onFailure(Throwable thrown) {
							thrown.printStackTrace();
						}
					});

		}
	}

}
