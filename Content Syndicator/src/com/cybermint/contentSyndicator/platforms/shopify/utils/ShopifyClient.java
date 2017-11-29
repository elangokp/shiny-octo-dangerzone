package com.cybermint.contentSyndicator.platforms.shopify.utils;

import java.net.URL;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Future;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.Realm;
import org.asynchttpclient.proxy.ProxyServer;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.cybermint.contentSyndicator.platforms.shopify.objects.ShopifyProduct;
import com.cybermint.contentSyndicator.platforms.shopify.objects.ShopifySite;
import com.cybermint.http.URLConnectionPool;
import com.cybermint.utils.custom.WebScraperUtils;

public class ShopifyClient {
	
	public static final String SORT_BY_BEST_SELLING = "best-selling";
	public static final String SORT_BY_CREATED_DESCENDING = "created-descending";
	public static final String SORT_BY_CREATED_ASCENDING = "created-ascending";

	public List<ShopifyProduct> getProductLinks(int crawlHeaderId, int siteId, String storeURL, String sortBy, int noOfpages) throws Exception {
		List<ShopifyProduct> products = new ArrayList<ShopifyProduct>();
		LinkedHashSet<String> productLinks = new LinkedHashSet<String>();
		try {
			//System.out.println(new Date());
			String url = "http://"+storeURL+"/collections/all?sort_by=best-selling";
			URL storeBaseURL = new URL("https://"+storeURL);
			int noOfEmptyProductPages = 0;
			for(int i = 1; i<=noOfpages && noOfEmptyProductPages<2; i++) {		
				int noOfProductsBefore = productLinks.size();
				//System.out.println("Page : " + i);
				String pageurl = url+"&page="+i;
				Document doc = Jsoup.parse(this.getContentFromUrl(pageurl).get().getResponseBody());
				Elements productURLs = doc.select("a");
				for(Element productURL : productURLs) {	
					//System.out.println(productURL.attr("href"));				
					if(productURL.attr("href").contains("products/")) {
						URL productURLasURL = new URL(storeBaseURL, productURL.attr("href").trim());
						//URL productURLasURL = new URL(productURL.attr("href"));
						if(productURLasURL.getHost().equalsIgnoreCase(storeURL)) {
							String productLink = productURLasURL.getProtocol()+"://"+productURLasURL.getHost()+productURLasURL.getPath();
							//System.out.println(productLink);
							productLinks.add(productLink);
						}
						
					}
				}			
				//System.out.println(doc.html());			
				int noOfProductsAfter = productLinks.size();
				//System.out.println(noOfProductsAfter);
				if(noOfProductsAfter == noOfProductsBefore) {
					noOfEmptyProductPages++;
				} else {
					noOfEmptyProductPages = 0;
				}
			}
			//System.out.println(new Date());
			
			int bestSellerRank = 1;
			for(String productLink : productLinks) {
				ShopifyProduct aShopifyProduct = new ShopifyProduct();
				aShopifyProduct.setCrawlHeaderID(crawlHeaderId);
				aShopifyProduct.setSiteID(siteId);
				aShopifyProduct.setStoreURL(storeURL);
				aShopifyProduct.setProductURL(productLink);
				aShopifyProduct.setBestSellerRank(bestSellerRank);
				products.add(aShopifyProduct);
				bestSellerRank++;
			}
			if(products.size()>0) {
				products.get(products.size()-1).setIsSiteCrawlComplete(ShopifySite.STATUS_COMPLETED);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return products;
	}
	
	public ShopifyProduct getProductContent(ShopifyProduct givenProduct) {
		String productURL = givenProduct.getProductURL();
		//System.out.println("Initiating request for : " + productURL);
		try {
			if(!productURL.isEmpty()) {
				//System.out.println("Not Empty : " + productURL);
				//String html = this.getContentFromUrl(productURL);
				givenProduct.setFutureResponse(this.getContentFromUrl(productURL));
				//System.out.println(html);				
			}
		} catch (Exception e) {
			//e.printStackTrace();
		}
		
		return givenProduct;
	}
	
	public ShopifyProduct processProduct(ShopifyProduct givenProduct) {
		try {
			if(null != givenProduct.getFutureResponse()) {
				//System.out.println("Not Empty : " + productURL);
				String html = givenProduct.getFutureResponse().get().getResponseBody();
				//System.out.println(html);				
				Instant currentInstant = ZonedDateTime.now(ZoneOffset.UTC).toInstant();
				Instant publishedAtInstant = currentInstant;
				Pattern publishedAtPattern = Pattern.compile("(&quot;|\")published_at(&quot;|\"):(&quot;|\").+?(&quot;|\")");
		        Matcher publishedAtMatcher = publishedAtPattern.matcher(html);
		        while(publishedAtMatcher.find()) {		        	
		        	String publishedAt = publishedAtMatcher.group().split("(&quot;|\"):(&quot;|\")")[1].replaceAll("(&quot;|\")", "");	        	
		        	Instant foundInstant = ZonedDateTime.parse(publishedAt).toInstant();
		        	//System.out.println(foundInstant);
		        	publishedAtInstant = publishedAtInstant.isAfter(foundInstant)?foundInstant:publishedAtInstant;
		        	//System.out.println(publishedAtInstant);
		        }
		        if(!publishedAtInstant.equals(currentInstant)) {
		        	givenProduct.setPublishedOn(publishedAtInstant);
		        }
		        /*
		        Instant createdAtInstant = currentInstant;
				Pattern createdAtPattern = Pattern.compile("(&quot;|\")created_at(&quot;|\"):(&quot;|\").+?(&quot;|\")");
		        Matcher createdAtMatcher = createdAtPattern.matcher(html);
		        while(createdAtMatcher.find()) {		        	
		        	String createdAt = createdAtMatcher.group().split("(&quot;|\"):(&quot;|\")")[1].replaceAll("(&quot;|\")", "");	        	
		        	Instant foundInstant = ZonedDateTime.parse(createdAt).toInstant();
		        	//System.out.println(foundInstant);
		        	createdAtInstant = createdAtInstant.isAfter(foundInstant)?foundInstant:createdAtInstant;
		        	//System.out.println(publishedAtInstant);
		        }
		        if(!createdAtInstant.equals(currentInstant)) {
		        	givenProduct.setCreatedOn(createdAtInstant);
		        }
		        */
		        
		        
				Document doc = Jsoup.parse(html);
				givenProduct.setProductTitle(doc.select("meta[property=\"og:title\"]").get(0).attr("content"));
				givenProduct.setProductDesc(doc.select("meta[property=\"og:description\"]").get(0).attr("content"));
				givenProduct.setProductPrice(Double.parseDouble(doc.select("meta[property=\"og:price:amount\"]").get(0).attr("content").replaceAll(",", "").trim()));
				givenProduct.setProductCurrency(doc.select("meta[property=\"og:price:currency\"]").get(0).attr("content"));
			}
		} catch (Exception e) {
			//e.printStackTrace();
		}
		
		return givenProduct;
	}
	
	public ShopifySite getSiteContent(ShopifySite givenSite) {
		String storeURL = givenSite.getStoreURL();
		//System.out.println("Initiating request for : " + productURL);
		try {
			if(null!=storeURL && !storeURL.isEmpty()) {
				//System.out.println("Not Empty : " + productURL);
				//String html = this.getContentFromUrl(productURL);
				String url = "http://"+storeURL;
				givenSite.setFutureResponse(this.getContentFromUrl(url));
				//System.out.println(html);				
			}
		} catch (Exception e) {
			//e.printStackTrace();
		}
		
		return givenSite;
	}
	
	
	public ShopifySite processSite(ShopifySite givenSite) {
		try {
			if(null != givenSite.getFutureResponse()) {
				//System.out.println("Not Empty : " + productURL);
				String html = givenSite.getFutureResponse().get().getResponseBody();
				//System.out.println(html);	       
		        
				Document doc = Jsoup.parse(html);
			}
		} catch (Exception e) {
			//e.printStackTrace();
		}
		
		return givenSite;
	}

	
	public Future<org.asynchttpclient.Response> getContentFromUrl(String url) {
		Future<org.asynchttpclient.Response>  response = null;
		try {
			AsyncHttpClient asyncHttpClient = URLConnectionPool.getInstance().getClient();	
			int sessionId = new Random().nextInt(1000000);
			ProxyServer ps = new ProxyServer.Builder("servercountry-US.zproxy.luminati.io", 22225)
					.setRealm(new Realm.Builder("lum-customer-hl_8226f349-zone-zone1-country-US-session-glob_rand"+sessionId, "40or5h2qxicw")
					.setScheme(Realm.AuthScheme.BASIC))
					.build();	
			
			response = asyncHttpClient
														.prepareGet(url)
														.addHeader("accept", "text/html,application/xhtml+xml,application/xml")
														.addHeader("accept-language", "en-US,en;")
														.addHeader("cache-control", "max-age=0")
														.addHeader("referer", "https://www.facebook.com/")
														.addHeader("User-Agent", WebScraperUtils.getInstance().getRandomUserAgentString())
														.setProxyServer(ps)
														.setFollowRedirect(true)
														.execute();
			//org.asynchttpclient.Response r = f.get();
			//System.out.println("Response " + r.getStatusCode() + " : " + url);
			/*
			for(Entry<String, String> header : r.getHeaders().entries()) {
				System.out.println(header.getKey() + " , " + header.getValue());
			}
			*/
			//System.out.println(r.getResponseBody());
			//response = r.getResponseBody();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return response;
		
	}
	
	public static void main(String[] args) throws Exception {
		
		ShopifyClient aClient = new ShopifyClient();
		
		List<ShopifyProduct> products = aClient.getProductLinks(1
				, 1, "littleplayland.com"
				, ShopifyClient.SORT_BY_BEST_SELLING, 1000);
		for(ShopifyProduct aProduct : products) {
			System.out.println(aProduct.getProductURL()+","+aProduct.getBestSellerRank());
		}
		
		/*
		ShopifyProduct aProduct = new ShopifyProduct();
		aProduct.setProductURL("https://www.foreverpassion.us/products/2017-baby-english-alphabet-jersey-puff-skirt");
		//aProduct.setProductURL("http://whatismyipaddress.com/");
		aClient.getProductDetails(aProduct);
		System.out.println(aProduct.getProductTitle());
		System.out.println(aProduct.getProductDesc());
		System.out.println(aProduct.getProductPrice());
		System.out.println(aProduct.getProductCurrency());
		System.out.println(aProduct.getPublishedOn());
		*/
		/*
		HttpHost proxy = new HttpHost("zproxy.luminati.io", 22225);
        String res = Executor.newInstance()
            .auth(proxy, "lum-customer-hl_8226f349-zone-static", "2pdb1req4gb4")
            .execute(Request.Get("http://lumtest.com/myip.json").viaProxy(proxy))
            .returnContent().asString();
        System.out.println(res);
        */
	}

}
