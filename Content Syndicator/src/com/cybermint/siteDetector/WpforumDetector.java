package com.cybermint.siteDetector;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.cybermint.utils.TextFileReaderUtils;
import com.cybermint.utils.TextFileWriterUtils;
import com.cybermint.utils.URLUtils;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;

public class WpforumDetector implements Callable {

	private String url;
	private URL urlObject;
	private Boolean isWpforumDetected = false;
	private List<String> registerUrlSuffixes = Arrays.asList("register.php","wp-login.php?action=register");
	private static String scrapedUrlsFilePath = "G:/Google Drive/Platforms/vBlog/sampleList.txt";
	private static String detectedSitesFilePath = "G:/Google Drive/Platforms/vBlog/detected-vblog-log.txt";

	public WpforumDetector(String url) {
		this.url = url;
	}

	@Override
	public Map<String, String> call() {
		Map<String, String> urlProperties = isWpforum(this.url);
		return urlProperties;

	}

	public Map<String, String> isWpforum(String url) {
		Map<String, String> urlProperties = new TreeMap<String, String>();
		
			try {
				this.urlObject = new URL(url);
			} catch (MalformedURLException e1) {
				e1.printStackTrace();
			}
			urlProperties.put("url", url);
			urlProperties.put("isWpforum", "false");
			urlProperties.put("WpforumHome", "false");
			urlProperties.put("registerUrlAvailable", "false");
			urlProperties.put("registerUrl", "false");
			boolean registerUrlFound = false;
			Integer statusCode = 0;

			List<String> listOfAllFolderUrls = URLUtils
					.getAllFolderUrls(url);
			for (String potentialWpforumHome : listOfAllFolderUrls) {
				if (!registerUrlFound) {
					for (String registerUrlSuffix : registerUrlSuffixes) {
						if (!registerUrlFound) {
							Response response = null;
							String registerUrl = null;
							try {
								registerUrl = potentialWpforumHome
										+ registerUrlSuffix;
								//System.out.println("Checking for : " + registerUrl);
								response = Jsoup.connect(registerUrl).userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6")
										.timeout(60000).execute();
								statusCode = response.statusCode();
								//System.out.println("Status Code for : " + registerUrl + " is " + statusCode);
							} catch (Exception e) {
								//System.out.println(e.getMessage());
							}
							if (statusCode.equals(200)) {
								//System.out.println("Added : " + registerUrl);
								try {
									
									Document registerDoc = response.parse();
									//Elements mandatorySiteElements = registerDoc.select("meta[content*=bbpress],meta[content*=wordpress]");
									Elements registerFormElements = registerDoc.select("form[action*=reg]");
									if (null != registerFormElements && !registerFormElements.isEmpty() && registerFormElements.size()>0) {
										urlProperties.put("registerUrlAvailable",
												"true");
										urlProperties.put("registerUrl",
												registerUrl);
										urlProperties.put("isWpforum", "true");
										urlProperties.put("WpforumHome", potentialWpforumHome);
										registerUrlFound = true;
									}
									
								} catch (IOException e) {
									// e.printStackTrace();
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
	

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		List<String> urls = TextFileReaderUtils.readLinesAsList(scrapedUrlsFilePath, true);
		TextFileWriterUtils atextFileWriter = new TextFileWriterUtils(detectedSitesFilePath);
		atextFileWriter.writeContentToFile("Url*isWpforum*Wpforum Home*Register Url Available*Register Url");
		atextFileWriter.closeWriter();
		System.out
				.println("Url*isWpforum*Wpforum Home*Register Url Available*Register Url");
		// ThreadPoolExecutor es = new
		// ThreadPoolExecutor(5,20,20,TimeUnit.SECONDS,new
		// LinkedBlockingQueue<Runnable>());
		ListeningExecutorService service = MoreExecutors
				.listeningDecorator(Executors.newFixedThreadPool(1));
		for (String url : urls) {
			WpforumDetector aWpforumDetector = new WpforumDetector(url);
			ListenableFuture<Map<String, String>> urlPropertiesFuture = service
					.submit(aWpforumDetector);
			Futures.addCallback(urlPropertiesFuture,
					new FutureCallback<Map<String, String>>() {
						public void onSuccess(Map<String, String> urlProperties) {
							StringBuilder urlPropertiesBuilder = new StringBuilder();
							if (null != urlProperties) {
								urlPropertiesBuilder.append(
										urlProperties.get("url")).append("*");
								urlPropertiesBuilder.append(
										urlProperties.get("isWpforum"))
										.append("*");
								urlPropertiesBuilder.append(
										urlProperties.get("WpforumHome")).append(
										"*");
								urlPropertiesBuilder.append(
										urlProperties
												.get("registerUrlAvailable"))
												.append("*");
								urlPropertiesBuilder.append(
										urlProperties
												.get("registerUrl"));
							}
							if(urlProperties.get("registerUrlAvailable").equalsIgnoreCase("true")) {
								try {
									TextFileWriterUtils atextFileWriter = new TextFileWriterUtils(detectedSitesFilePath);
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
		service.shutdown();
		// System.out.println(anElggDetector.isElgg("http://www.sdpio.net/elgg/pages/view/1421/are-you-experiencing-head-sweating"));
		// System.out.println(anElggDetector.isElgg("http://socialcmsbuzz.com/7-social-network-websites-powered-by-elgg-15-23042009/"));
		/*
		 * Document doc = Jsoup.connect("http://jsoup.org").get(); Elements
		 * elements = doc.select("meta[name=keywords]"); for(Element element :
		 * elements) { System.out.println(element); }
		 */
	}

}
