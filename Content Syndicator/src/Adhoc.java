import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.pool.impl.GenericObjectPool;
import org.asynchttpclient.*;
import org.asynchttpclient.proxy.ProxyServer;
import org.asynchttpclient.proxy.ProxyServer.Builder;
/*
import org.apache.commons.pool.impl.GenericObjectPool;
import org.apache.http.HttpHost;
import org.apache.http.client.fluent.Executor;
import org.apache.http.client.fluent.Request;
*/
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cybermint.factories.webdrivers.PoolableWebDriverFactory;
import com.cybermint.utils.TextFileReaderUtils;
import com.cybermint.utils.TextFileWriterUtils;
import com.cybermint.utils.custom.WebScraperUtils;

import io.netty.channel.Channel;
import okhttp3.Authenticator;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import org.openqa.selenium.WebElement;


public class Adhoc {

/*	public static void main(String[] args) throws Exception {
		TextFileReaderUtils tr = new TextFileReaderUtils();
		List<String> links = tr.readLinesAsList("c:\\report-links.txt", true);
		PoolableWebDriverFactory aPoolableWebDriverFactory = new PoolableWebDriverFactory("chrome", "", "C:\\custom\\ChromeDriver\\chromedriver.exe");
		GenericObjectPool driverPool = new GenericObjectPool(aPoolableWebDriverFactory);
		driverPool.setWhenExhaustedAction(GenericObjectPool.WHEN_EXHAUSTED_BLOCK);
		driverPool.setMaxActive(1);
		driverPool.setLifo(false); //To make it behave a FIFO
		driverPool.setMaxWait(45000);
		WebDriver driver = null;
		driver = (WebDriver) driverPool.borrowObject();
		for(String link : links) {
			System.out.println(link);			
			driver.get(link);			
		}

	}
*/

	public static void main(String[] args) throws Exception {

		PoolableWebDriverFactory aPoolableWebDriverFactory = new PoolableWebDriverFactory("chrome", "", "C:\\custom\\ChromeDriver\\chromedriver.exe");
		GenericObjectPool driverPool = new GenericObjectPool(aPoolableWebDriverFactory);
		driverPool.setWhenExhaustedAction(GenericObjectPool.WHEN_EXHAUSTED_BLOCK);
		driverPool.setMaxActive(1);
		driverPool.setLifo(false); //To make it behave a FIFO
		driverPool.setMaxWait(45000);
		WebDriver driver = null;
		driver = (WebDriver) driverPool.borrowObject();
		int rank = 1;
		for(int page = 1; page<= 130; page++) {
			driver.get("https://apps.shopify.com/browse?page="+page);
			List<WebElement> appContainers = driver.findElements(By.cssSelector(".ui-app-card__container"));
			for(WebElement appContainer : appContainers) {
				StringBuffer appDetails = new StringBuffer();
				String appName = appContainer.findElement(By.cssSelector(".ui-app-card__name")).getText();
				String appDesc = appContainer.findElement(By.cssSelector(".ui-app-card__details")).getText();
				String appRating = "0";
				String appReviewCount = "0";
				try {
					appRating = appContainer.findElement(By.cssSelector(".ui-star-rating__rating")).getText().substring(0,3);
					appReviewCount = appContainer.findElement(By.cssSelector(".ui-review-count-summary")).getText()
							.replaceAll("\\(", "").replaceAll("\\)","")
							.replaceAll("\\s+","").replaceAll("reviews","");
				} catch(Exception e) {

				}
				appDetails.append("\"").append(appName).append("\",\"").append(appDesc).append("\",\"")
						.append(appRating).append("\",\"").append(appReviewCount).append("\",")
						.append(rank++);
				System.out.println(appDetails.toString());
				TextFileWriterUtils.writeString(appDetails.toString(), "C:\\custom\\shopify-apps.csv", Boolean.TRUE, Boolean.TRUE);
			}
		}


		//DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
		/*
		String publishedAt = "2017-02-24";
		if(publishedAt.length()==10) {
			publishedAt = publishedAt+"T00:00:00-00:00";
		}else if(publishedAt.length()==19) {
			publishedAt = publishedAt+"-00:00";
		}
		Instant foundInstant = ZonedDateTime.parse(publishedAt).toInstant();
		*/
		//int sessionId = new Random().nextInt(1000000);
		//System.out.println(sessionId);
		/*
		System.out.println("To enable your free eval account and get "
	            +"CUSTOMER, YOURZONE and YOURPASS, please contact "
	            +"sales@luminati.io");
	        HttpHost proxy = new HttpHost("servercountry-US.zproxy.luminati.io", 22225);
	        String res = Executor.newInstance()
	            .auth(proxy, "lum-customer-hl_8226f349-zone-zone1-country-US-session-glob_rand"+sessionId, "40or5h2qxicw")
	            .execute(Request.Get("https://www.similarweb.com/website/dudesgadget.com").viaProxy(proxy))
	            .returnContent().asString();
	        System.out.println(res);
	      */  
		
		/*
	        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("servercountry-US.zproxy.luminati.io", 22225));
	        OkHttpClient client = new OkHttpClient.Builder()
					.readTimeout(60, TimeUnit.SECONDS)
					.proxy(proxy)
					.proxyAuthenticator(new Authenticator() {
						@Override
						public Request authenticate(Route route, Response response) throws IOException {
							String credential = Credentials.basic("lum-customer-hl_8226f349-zone-zone1-country-US-session-glob_rand"+sessionId, "40or5h2qxicw");
			                return response.request().newBuilder()
			                        .header("Proxy-Authorization", credential)
			                        .build();    
						}
			        })
			        
					.build();
	        Request request = new Request.Builder()
			        .url("https://www.similarweb.com/website/dudesgadget.com")
			        .addHeader("accept", "text/html")
			        //.addHeader("accept-encoding", "gzip")
			        .addHeader("accept-language", "en-US,en;q=0.8,ta;q=0.6")
			        .addHeader("cache-control", "max-age=0")
			        .addHeader("referer", "https://www.facebook.com/")
			        .addHeader("User-Agent", WebScraperUtils.getInstance().getRandomUserAgentString())
			        .build();
			Response response = client.newCall(request).execute();	
			System.out.println(response.body().string());
			System.out.println(response.headers().toString());
			*/
		/*
		File techMatrixFile = new File("C:\\Users\\elangokp\\Downloads\\shopify-topalexarank-live-matrix.csv");
		Scanner fileScanner = new Scanner(techMatrixFile);
		fileScanner.nextLine();
		FileWriter fileStream = new FileWriter("C:\\Users\\elangokp\\Downloads\\shopify-topalexarank-live-matrix1.csv");
		BufferedWriter out = new BufferedWriter(fileStream);
		String headers = fileScanner.nextLine();
		Pattern p = Pattern.compile("Browser-Update");
		Matcher m = p.matcher(headers);
		StringBuffer sb = new StringBuffer();
		int i = 1;
		while (m.find()) {
		    m.appendReplacement(sb, m.group()+i++);
		}
		m.appendTail(sb);

		String resultHeaders = sb.toString();
		out.write(resultHeaders);
		out.newLine();
		while(fileScanner.hasNextLine()) {
		    String next = fileScanner.nextLine();
		    if(next.equals("\n")) 
		       out.newLine();
		    else 
		       out.write(next);
		    out.newLine();   
		}
		out.close();
		fileScanner.close();
		*/
		
		/*
		Reader in = new FileReader("C:\\Users\\elangokp\\Downloads\\shopify-topalexarank-live-matrix.csv");
		//Iterable<CSVRecord> recordsNoHeader = CSVFormat.EXCEL.parse(in);
		//System.out.println(recordsNoHeader.iterator().next());
		Iterable<CSVRecord> records = CSVFormat.EXCEL.withFirstRecordAsHeader().parse(in);
		
		//System.out.println(Instant.now());
		//records.
		String headers = "Domain,GoogleAnalytics,GoogleUniversalAnalytics,FacebookSignal,Beeketing,GoogleAnalyticsEnhancedEcommerce,FacebookPixel,GoogleAnalyticsClassic,GoogleConversionTracking,Conversio,Hotjar,BoldCommerce,Soundest,NewRelic,Improvely,Klaviyo,GoogleAnalyticswithAdTracking,TwitterAnalytics,MailMunch,Rapleaf,LiveRamp,SwellRewards,FacebookDomainInsights,Gator,Secomapp,Recart,BingUniversalEventTracking,LuckyOrange,GoogleAnalyticsEventTracking,Lexity,GoogleAnalyticsEnhancedLinkAttribution,CrazyEgg,FacebookPixelViewContent,LeadDyno,FacebookTagAPI,TwitterConversionTracking,Hubspot,Affiliatly,LoyaltyLion,LimeSpot,Optimizely,QuantcastMeasurement,FacebookConversionTracking,comScore,Mixpanel,Refersion,MarinSoftware,Smartlook,VisualWebsiteOptimizer,OptiMonk,TwitterWebsiteUniversalTag,GoogleOptimize360,Loggly,StatCounter,Riskified,LotameCrowdControl,Mouseflow,Findify,HubspotForms,Wheelio,AlexaMetrics,AlexaCertifiedSiteMetrics,Inspectlet,Trustpilot,Snowplow,YahooDot,YahooWebAnalytics,DoubleClickFloodlight,Clicky,EverestTechnologies,Nosto,TyntTracer,MediaMath,Listrak,MailerLite,Datalogix,PiwikWebAnalytics,Segment,MailiteLite,Pmetrics,ActiveCampaign,aWeber,Drip,Heap,Gleam,CommerceSciences,Fastly,PicReel,KruxDigital,LinkedInInsights,YandexMetrika,EfficientFrontier,GoogleAnalyticsEcommerce,CartsGuru,GoogleAnalyticsIPAnonymization,Infusionsoft,SiftScience,FullStory,Sellebrity,Dynatrace,Survicate,Springbot,Chartbeat,KISSmetrics,Signal,VantageAnalytics,Airbrake,OmnitureSiteCatalyst,ClickFunnels,Amplitude,OwnerIQ,VeInteractive,AgileCRM,PingdomRUM,GoSquared,Woopra,Autopilot,Cedexis,SteelHouse,AdobeDynamicTagManagement,HeatmapIT,CallTrackingMetrics,Soldsie,inSparq,GrooveJar,LeadForensics,Sidecar,ConvertKit,ChannelAdvisor,AdobeMarketingCloud,Satellite,Bronto,Pardot,CueConnect,Bazaarvoice,Proof,Zarget,Receiptful,Salesforce,AvantMetrics,Convert,ShopifyConversions,ShopifyBasic,ShopifyUSDollar,ShopifyProductReviews,ShopifyProfessional,ShopifyDormant,Hextom,ShopifyBritishPound,ShopifyCanadianDollar,ShopifyAustralianDollar,ShopifyEuro,ShopifyUnlimited,ShopifyCustom,Codeblackbelt,Loox,ShopifyNewZealandDollar,ShopifyPlus,ShopifyStarter,WooCommerce,ShopPad,Beetailer,Shappify,ShopifyBuyButton,ShopifyBusiness,WooCommerceCheckout,Magento,WixStores,ShopifyNPO,WooCommerceAddToCart,Apptuse,SquarespaceCommerce,CartFunctionality,BigCommerce,OpenCart,BigCartel,Volusion,PatternbyEtsy,ShopGate,MagentoEnterprise,Ecwid,Lightspeed,GoDaddyQuickShoppingCart,a3DCart,XCart,MivaMerchant,GetShopped,Demandware,CSCart,InSales,Thinkific,Ejunkie,SEOshop,NetSuiteeCommerce,GoDaddyOnlineStore,KartRocket,SparkPay,ekmPowershop,NetworkSolutionsCommerce,Spree,ePages,LojaIntegrada,HikaShop,MagentoGo,PinnacleCart,SocialShopWave,ShopGo,Globale,Shopware,Cart66,DoubleClickNet,FacebookCustomAudiences,GoogleRemarketing,AdRoll,AppNexus,DoubleClickBidManager,RubiconProject,TwitterAds,Pubmatic,YahooSmallBusiness,IponWebBidSwitch,RetargetApp,GoogleAdsense,IndexExchange,HitsAnalytics,Advertisingcom,GoogleAdsenseAsynchronous,Taboola,AppNexusSegmentPixel,AmazonAssociates,BoostSuite,Criteo,PerfectAudience,CriteoOneTag,TheTradeDesk,GoogleAdsenseforDomains,Crosswise,BlueKai,BlueKaiDMP,SpotXchange,DemDex,ONEbyAOL,AdobeAudienceManagerSync,Tapad,Simplifi,AdapTV,eXelate,GooglePublisherTag,Turn,AggregateKnowledge,ContextWeb,Drawbridge,RocketFuel,Eyeota,MediaInnovationGroup,Atlas,AmazonAdSystem,LinkedInAds,adingo,Bizo,ImproveDigital,TripleLift,Teads,SiteScout,PayPalAdvertising,StickyAdsTV,Hivewyre,RadiumOne,Omnitag,BurstMedia,LinkShare,Marchex,ReferralCandy,Rontar,StackAdapt,Mediaplex,SkimLinks,RUNAds,GoogleInteactiveMediaAds,PostAffiliatePro,Datonics,CommissionJunction,adaplo,AdBlockAcceptableAds,YahooAdSync,ShareASale,Dstillery,IntegralAdScience,Geniee,GumGum,Woobox,NeustarAdAdvisor,VigLink,XPlusOne,Prebid,Vdopia,GoogleConsumerSurveys,AppleAutoLinkMaker,GoogleAdSenseCustomSearchAds,VINDICO,Medianet,ClickBank,Narrative,Semasio,eBayPartnerNetwork,BounceExchange,MailChimp,Zotabox,Stamped,MailChimpSPF,GoogleCloudDNS,ZohoMail,SmileIO,Tidio,GoogleMapsforWork,Zopim,YoastSEOPremium,NamecheapPrivateEmail,CovetPics,LifterApps,JustUno,BackinStock,ZendeskEmbeddables,Fomo,RackspaceEmailHosting,Olark,Chatra,Mandrill,Searchanise,Mailgun,Zendesk,NetworkSolutionsEmailHosting,LiveChat,Sentry,Firebase,SLoyalty,CampaignMonitorWidget,HelloBar,Foursixty,YahooBusinessEmail,Wistia,MagicToolbox,JotForm,OptinMonster,Sendgrid,NSONE,ConstantContact,StoreLocator,Signifyd,Orankl,Authorizenet,GetSocial,AddShoppers,Stripe,Algolia,MailChannels,GravityForms";
		List<String> headerList = new ArrayList<String>();
		headerList.add(headers);
		TextFileWriterUtils.writeListAsLines(headerList, "C:\\Users\\elangokp\\Downloads\\shopify-topalexarank-live-matrix-limited.csv", true);
		for (CSVRecord record : records) {
			//System.out.println(record.toString());
			String Domain = record.get("Domain");
			String GoogleAnalytics = record.get("Google Analytics");
			String GoogleUniversalAnalytics = record.get("Google Universal Analytics");
			String FacebookSignal = record.get("Facebook Signal");
			String Beeketing = record.get("Beeketing");
			String GoogleAnalyticsEnhancedEcommerce = record.get("Google Analytics Enhanced Ecommerce");
			String FacebookPixel = record.get("Facebook Pixel");
			String GoogleAnalyticsClassic = record.get("Google Analytics Classic");
			String GoogleConversionTracking = record.get("Google Conversion Tracking");
			String Conversio = record.get("Conversio");
			String Hotjar = record.get("Hotjar");
			String BoldCommerce = record.get("Bold Commerce");
			String Soundest = record.get("Soundest");
			String NewRelic = record.get("New Relic");
			String Improvely = record.get("Improvely");
			String Klaviyo = record.get("Klaviyo");
			String GoogleAnalyticswithAdTracking = record.get("Google Analytics with Ad Tracking");
			String TwitterAnalytics = record.get("Twitter Analytics");
			String MailMunch = record.get("MailMunch");
			String Rapleaf = record.get("Rapleaf");
			String LiveRamp = record.get("LiveRamp");
			String SwellRewards = record.get("Swell Rewards");
			String FacebookDomainInsights = record.get("Facebook Domain Insights");
			String Gator = record.get("Gator");
			String Secomapp = record.get("Secomapp");
			String Recart = record.get("Recart");
			String BingUniversalEventTracking = record.get("Bing Universal Event Tracking");
			String LuckyOrange = record.get("Lucky Orange");
			String GoogleAnalyticsEventTracking = record.get("Google Analytics Event Tracking");
			String Lexity = record.get("Lexity");
			String GoogleAnalyticsEnhancedLinkAttribution = record.get("Google Analytics Enhanced Link Attribution");
			String CrazyEgg = record.get("CrazyEgg");
			String FacebookPixelViewContent = record.get("Facebook Pixel View Content");
			String LeadDyno = record.get("LeadDyno");
			String FacebookTagAPI = record.get("Facebook Tag API");
			String TwitterConversionTracking = record.get("Twitter Conversion Tracking");
			String Hubspot = record.get("Hubspot");
			String Affiliatly = record.get("Affiliatly");
			String LoyaltyLion = record.get("LoyaltyLion");
			String LimeSpot = record.get("LimeSpot");
			String Optimizely = record.get("Optimizely");
			String QuantcastMeasurement = record.get("Quantcast Measurement");
			String FacebookConversionTracking = record.get("Facebook Conversion Tracking");
			String comScore = record.get("comScore");
			String Mixpanel = record.get("Mixpanel");
			String Refersion = record.get("Refersion");
			String MarinSoftware = record.get("Marin Software");
			String Smartlook = record.get("Smartlook");
			String VisualWebsiteOptimizer = record.get("Visual Website Optimizer");
			String OptiMonk = record.get("OptiMonk");
			String TwitterWebsiteUniversalTag = record.get("Twitter Website Universal Tag");
			String GoogleOptimize360 = record.get("Google Optimize 360");
			String Loggly = record.get("Loggly");
			String StatCounter = record.get("StatCounter");
			String Riskified = record.get("Riskified");
			String LotameCrowdControl = record.get("Lotame Crowd Control");
			String Mouseflow = record.get("Mouseflow");
			String Findify = record.get("Findify");
			String HubspotForms = record.get("Hubspot Forms");
			String Wheelio = record.get("Wheelio");
			String AlexaMetrics = record.get("Alexa Metrics");
			String AlexaCertifiedSiteMetrics = record.get("Alexa Certified Site Metrics");
			String Inspectlet = record.get("Inspectlet");
			String Trustpilot = record.get("Trustpilot");
			String Snowplow = record.get("Snowplow");
			String YahooDot = record.get("Yahoo Dot");
			String YahooWebAnalytics = record.get("Yahoo Web Analytics");
			String DoubleClickFloodlight = record.get("DoubleClick Floodlight");
			String Clicky = record.get("Clicky");
			String EverestTechnologies = record.get("Everest Technologies");
			String Nosto = record.get("Nosto");
			String TyntTracer = record.get("Tynt Tracer");
			String MediaMath = record.get("MediaMath");
			String Listrak = record.get("Listrak");
			String MailerLite = record.get("MailerLite");
			String Datalogix = record.get("Datalogix");
			String PiwikWebAnalytics = record.get("Piwik Web Analytics");
			String Segment = record.get("Segment");
			String MailiteLite = record.get("Mailite Lite");
			String Pmetrics = record.get("Pmetrics");
			String ActiveCampaign = record.get("Active Campaign");
			String aWeber = record.get("aWeber");
			String Drip = record.get("Drip");
			String Heap = record.get("Heap");
			String Gleam = record.get("Gleam");
			String CommerceSciences = record.get("Commerce Sciences");
			String Fastly = record.get("Fastly");
			String PicReel = record.get("PicReel");
			String KruxDigital = record.get("Krux Digital");
			String LinkedInInsights = record.get("LinkedIn Insights");
			String YandexMetrika = record.get("Yandex Metrika");
			String EfficientFrontier = record.get("Efficient Frontier");
			String GoogleAnalyticsEcommerce = record.get("Google Analytics Ecommerce");
			String CartsGuru = record.get("Carts Guru");
			String GoogleAnalyticsIPAnonymization = record.get("Google Analytics IP Anonymization");
			String Infusionsoft = record.get("Infusionsoft");
			String SiftScience = record.get("Sift Science");
			String FullStory = record.get("FullStory");
			String Sellebrity = record.get("Sellebrity");
			String Dynatrace = record.get("Dynatrace");
			String Survicate = record.get("Survicate");
			String Springbot = record.get("Springbot");
			String Chartbeat = record.get("Chartbeat");
			String KISSmetrics = record.get("KISSmetrics");
			String Signal = record.get("Signal");
			String VantageAnalytics = record.get("Vantage Analytics");
			String Airbrake = record.get("Airbrake");
			String OmnitureSiteCatalyst = record.get("Omniture SiteCatalyst");
			String ClickFunnels = record.get("ClickFunnels");
			String Amplitude = record.get("Amplitude");
			String OwnerIQ = record.get("OwnerIQ");
			String VeInteractive = record.get("Ve Interactive");
			String AgileCRM = record.get("Agile CRM");
			String PingdomRUM = record.get("Pingdom RUM");
			String GoSquared = record.get("GoSquared");
			String Woopra = record.get("Woopra");
			String Autopilot = record.get("Autopilot");
			String Cedexis = record.get("Cedexis");
			String SteelHouse = record.get("SteelHouse");
			String AdobeDynamicTagManagement = record.get("Adobe Dynamic Tag Management");
			String HeatmapIT = record.get("Heatmap IT");
			String CallTrackingMetrics = record.get("CallTrackingMetrics");
			String Soldsie = record.get("Soldsie");
			String inSparq = record.get("inSparq");
			String GrooveJar = record.get("GrooveJar");
			String LeadForensics = record.get("Lead Forensics");
			String Sidecar = record.get("Sidecar");
			String ConvertKit = record.get("ConvertKit");
			String ChannelAdvisor = record.get("ChannelAdvisor");
			String AdobeMarketingCloud = record.get("Adobe Marketing Cloud");
			String Satellite = record.get("Satellite");
			String Bronto = record.get("Bronto");
			String Pardot = record.get("Pardot");
			String CueConnect = record.get("Cue Connect");
			String Bazaarvoice = record.get("Bazaarvoice");
			String Proof = record.get("Proof");
			String Zarget = record.get("Zarget");
			//String Receiptful = record.get("Receiptful");
			String Salesforce = record.get("Salesforce");
			String AvantMetrics = record.get("AvantMetrics");
			String Convert = record.get("Convert");
			String ShopifyConversions = record.get("Shopify Conversions");
			String ShopifyBasic = record.get("Shopify Basic");
			String ShopifyUSDollar = record.get("Shopify US Dollar");
			String ShopifyProductReviews = record.get("Shopify Product Reviews");
			String ShopifyProfessional = record.get("Shopify Professional");
			String ShopifyDormant = record.get("Shopify Dormant");
			String Hextom = record.get("Hextom");
			String ShopifyBritishPound = record.get("Shopify British Pound");
			String ShopifyCanadianDollar = record.get("Shopify Canadian Dollar");
			String ShopifyAustralianDollar = record.get("Shopify Australian Dollar");
			String ShopifyEuro = record.get("Shopify Euro");
			String ShopifyUnlimited = record.get("Shopify Unlimited");
			String ShopifyCustom = record.get("Shopify Custom");
			String Codeblackbelt = record.get("Codeblackbelt");
			String Loox = record.get("Loox");
			String ShopifyNewZealandDollar = record.get("Shopify New Zealand Dollar");
			String ShopifyPlus = record.get("Shopify Plus");
			String ShopifyStarter = record.get("Shopify Starter");
			String WooCommerce = record.get("WooCommerce");
			String ShopPad = record.get("ShopPad");
			String Beetailer = record.get("Beetailer");
			String Shappify = record.get("Shappify");
			String ShopifyBuyButton = record.get("Shopify Buy Button");
			String ShopifyBusiness = record.get("Shopify Business");
			String WooCommerceCheckout = record.get("WooCommerce Checkout");
			String Magento = record.get("Magento");
			String WixStores = record.get("Wix Stores");
			String ShopifyNPO = record.get("Shopify NPO");
			String WooCommerceAddToCart = record.get("WooCommerce Add To Cart");
			String Apptuse = record.get("Apptuse");
			String SquarespaceCommerce = record.get("Squarespace Commerce");
			String CartFunctionality = record.get("Cart Functionality");
			String BigCommerce = record.get("BigCommerce");
			String OpenCart = record.get("OpenCart");
			String BigCartel = record.get("Big Cartel");
			String Volusion = record.get("Volusion");
			//String PatternbyEtsy = record.get("Pattern by Etsy");
			String ShopGate = record.get("ShopGate");
			String MagentoEnterprise = record.get("Magento Enterprise");
			String Ecwid = record.get("Ecwid");
			String Lightspeed = record.get("Lightspeed");
			//String GoDaddyQuickShoppingCart = record.get("GoDaddy Quick Shopping Cart");
			//String a3DCart = record.get("3D Cart");
			String XCart = record.get("X-Cart");
			String MivaMerchant = record.get("Miva Merchant");
			String GetShopped = record.get("GetShopped");
			String Demandware = record.get("Demandware");
			String CSCart = record.get("CS Cart");
			String InSales = record.get("InSales");
			String Thinkific = record.get("Thinkific");
			String Ejunkie = record.get("E-junkie");
			String SEOshop = record.get("SEOshop");
			String NetSuiteeCommerce = record.get("NetSuite eCommerce");
			//String GoDaddyOnlineStore = record.get("GoDaddy Online Store");
			String KartRocket = record.get("KartRocket");
			String SparkPay = record.get("Spark Pay");
			String ekmPowershop = record.get("ekmPowershop");
			String NetworkSolutionsCommerce = record.get("Network Solutions Commerce");
			String Spree = record.get("Spree");
			//String ePages = record.get("ePages");
			String LojaIntegrada = record.get("Loja Integrada");
			String HikaShop = record.get("HikaShop");
			//String MagentoGo = record.get("Magento Go");
			//String PinnacleCart = record.get("Pinnacle Cart");
			//String SocialShopWave = record.get("Social Shop Wave");
			String ShopGo = record.get("ShopGo");
			//String Globale = record.get("Global-e");
			String Shopware = record.get("Shopware");
			//String Cart66 = record.get("Cart66");
			String DoubleClickNet = record.get("DoubleClick.Net");
			String FacebookCustomAudiences = record.get("Facebook Custom Audiences");
			String GoogleRemarketing = record.get("Google Remarketing");
			String AdRoll = record.get("AdRoll");
			String AppNexus = record.get("AppNexus");
			String DoubleClickBidManager = record.get("DoubleClick Bid Manager");
			String RubiconProject = record.get("Rubicon Project");
			String TwitterAds = record.get("Twitter Ads");
			String Pubmatic = record.get("Pubmatic");
			String YahooSmallBusiness = record.get("Yahoo Small Business");
			String IponWebBidSwitch = record.get("IponWeb BidSwitch");
			String RetargetApp = record.get("RetargetApp");
			String GoogleAdsense = record.get("Google Adsense");
			String IndexExchange = record.get("Index Exchange");
			String HitsAnalytics = record.get("Hits Analytics");
			String Advertisingcom = record.get("Advertising.com");
			String GoogleAdsenseAsynchronous = record.get("Google Adsense Asynchronous");
			String Taboola = record.get("Taboola");
			String AppNexusSegmentPixel = record.get("AppNexus Segment Pixel");
			String AmazonAssociates = record.get("Amazon Associates");
			String BoostSuite = record.get("BoostSuite");
			String Criteo = record.get("Criteo");
			String PerfectAudience = record.get("Perfect Audience");
			String CriteoOneTag = record.get("Criteo OneTag");
			String TheTradeDesk = record.get("The Trade Desk");
			String GoogleAdsenseforDomains = record.get("Google Adsense for Domains");
			String Crosswise = record.get("Crosswise");
			String BlueKai = record.get("BlueKai");
			String BlueKaiDMP = record.get("BlueKai DMP");
			String SpotXchange = record.get("SpotXchange");
			String DemDex = record.get("DemDex");
			String ONEbyAOL = record.get("ONE by AOL");
			String AdobeAudienceManagerSync = record.get("Adobe Audience Manager Sync");
			String Tapad = record.get("Tapad");
			String Simplifi = record.get("Simpli.fi");
			String AdapTV = record.get("Adap.TV");
			String eXelate = record.get("eXelate");
			String GooglePublisherTag = record.get("Google Publisher Tag");
			String Turn = record.get("Turn");
			String AggregateKnowledge = record.get("Aggregate Knowledge");
			String ContextWeb = record.get("ContextWeb");
			String Drawbridge = record.get("Drawbridge");
			String RocketFuel = record.get("Rocket Fuel");
			String Eyeota = record.get("Eyeota");
			String MediaInnovationGroup = record.get("Media Innovation Group");
			String Atlas = record.get("Atlas");
			String AmazonAdSystem = record.get("Amazon Ad System");
			String LinkedInAds = record.get("LinkedIn Ads");
			String adingo = record.get("adingo");
			String Bizo = record.get("Bizo");
			String ImproveDigital = record.get("Improve Digital");
			String TripleLift = record.get("TripleLift");
			String Teads = record.get("Teads");
			String SiteScout = record.get("SiteScout");
			String PayPalAdvertising = record.get("PayPal Advertising");
			String StickyAdsTV = record.get("StickyAds TV");
			String Hivewyre = record.get("Hivewyre");
			String RadiumOne = record.get("RadiumOne");
			String Omnitag = record.get("Omnitag");
			String BurstMedia = record.get("Burst Media");
			String LinkShare = record.get("Link Share");
			String Marchex = record.get("Marchex");
			String ReferralCandy = record.get("Referral Candy");
			String Rontar = record.get("Rontar");
			String StackAdapt = record.get("StackAdapt");
			String Mediaplex = record.get("Mediaplex");
			String SkimLinks = record.get("SkimLinks");
			String RUNAds = record.get("RUN Ads");
			String GoogleInteactiveMediaAds = record.get("Google Inteactive Media Ads");
			String PostAffiliatePro = record.get("Post Affiliate Pro");
			String Datonics = record.get("Datonics");
			String CommissionJunction = record.get("Commission Junction");
			String adaplo = record.get("adaplo");
			//String AdBlockAcceptableAds = record.get("AdBlock Acceptable Ads");
			String YahooAdSync = record.get("Yahoo Ad Sync");
			String ShareASale = record.get("ShareASale");
			String Dstillery = record.get("Dstillery");
			String IntegralAdScience = record.get("Integral Ad Science");
			String Geniee = record.get("Geniee");
			String GumGum = record.get("GumGum");
			String Woobox = record.get("Woobox");
			String NeustarAdAdvisor = record.get("Neustar AdAdvisor");
			String VigLink = record.get("VigLink");
			String XPlusOne = record.get("X Plus One");
			String Prebid = record.get("Prebid");
			//String Vdopia = record.get("Vdopia");
			String GoogleConsumerSurveys = record.get("Google Consumer Surveys");
			String AppleAutoLinkMaker = record.get("Apple Auto Link Maker");
			String GoogleAdSenseCustomSearchAds = record.get("Google AdSense Custom Search Ads");
			String VINDICO = record.get("VINDICO");
			String Medianet = record.get("Media.net");
			String ClickBank = record.get("ClickBank");
			String Narrative = record.get("Narrative");
			String Semasio = record.get("Semasio");
			String eBayPartnerNetwork = record.get("eBay Partner Network");
			String BounceExchange = record.get("Bounce Exchange");
			String MailChimp = record.get("MailChimp");
			String Zotabox = record.get("Zotabox");
			String Stamped = record.get("Stamped");
			String MailChimpSPF = record.get("MailChimp SPF");
			String GoogleCloudDNS = record.get("Google Cloud DNS");
			String ZohoMail = record.get("Zoho Mail");
			String SmileIO = record.get("Smile IO");
			String Tidio = record.get("Tidio");
			String GoogleMapsforWork = record.get("Google Maps for Work");
			String Zopim = record.get("Zopim");
			String YoastSEOPremium = record.get("Yoast SEO Premium");
			String NamecheapPrivateEmail = record.get("Namecheap Private Email");
			String CovetPics = record.get("Covet Pics");
			String LifterApps = record.get("Lifter Apps");
			String JustUno = record.get("JustUno");
			String BackinStock = record.get("Back in Stock");
			String ZendeskEmbeddables = record.get("Zendesk Embeddables");
			String Fomo = record.get("Fomo");
			String RackspaceEmailHosting = record.get("Rackspace Email Hosting");
			String Olark = record.get("Olark");
			String Chatra = record.get("Chatra");
			String Mandrill = record.get("Mandrill");
			String Searchanise = record.get("Searchanise");
			String Mailgun = record.get("Mailgun");
			String Zendesk = record.get("Zendesk");
			String NetworkSolutionsEmailHosting = record.get("Network Solutions Email Hosting");
			String LiveChat = record.get("LiveChat");
			String Sentry = record.get("Sentry");
			String Firebase = record.get("Firebase");
			String SLoyalty = record.get("S Loyalty");
			String CampaignMonitorWidget = record.get("Campaign Monitor Widget");
			String HelloBar = record.get("Hello Bar");
			String Foursixty = record.get("Foursixty");
			String YahooBusinessEmail = record.get("Yahoo! Business Email");
			String Wistia = record.get("Wistia");
			String MagicToolbox = record.get("Magic Toolbox");
			String JotForm = record.get("JotForm");
			String OptinMonster = record.get("OptinMonster");
			String Sendgrid = record.get("Sendgrid");
			String NSONE = record.get("NSONE");
			String ConstantContact = record.get("Constant Contact");
			String StoreLocator = record.get("Store Locator");
			String Signifyd = record.get("Signifyd");
			String Orankl = record.get("Orankl");
			String Authorizenet = record.get("Authorize.net");
			String GetSocial = record.get("GetSocial");
			String AddShoppers = record.get("AddShoppers");
			String Stripe = record.get("Stripe");
			String Algolia = record.get("Algolia");
			String MailChannels = record.get("MailChannels");
			String GravityForms = record.get("Gravity Forms");
			String row = Domain+","+GoogleAnalytics+","+GoogleUniversalAnalytics+","+FacebookSignal+","+Beeketing+","+GoogleAnalyticsEnhancedEcommerce+","+FacebookPixel+","+GoogleAnalyticsClassic+","+GoogleConversionTracking+","+Conversio+","+Hotjar+","+BoldCommerce+","+Soundest+","+NewRelic+","+Improvely+","+Klaviyo+","+GoogleAnalyticswithAdTracking+","+TwitterAnalytics+","+MailMunch+","+Rapleaf+","+LiveRamp+","+SwellRewards+","+FacebookDomainInsights+","+Gator+","+Secomapp+","+Recart+","+BingUniversalEventTracking+","+LuckyOrange+","+GoogleAnalyticsEventTracking+","+Lexity+","+GoogleAnalyticsEnhancedLinkAttribution+","+CrazyEgg+","+FacebookPixelViewContent+","+LeadDyno+","+FacebookTagAPI+","+TwitterConversionTracking+","+Hubspot+","+Affiliatly+","+LoyaltyLion+","+LimeSpot+","+Optimizely+","+QuantcastMeasurement+","+FacebookConversionTracking+","+comScore+","+Mixpanel+","+Refersion+","+MarinSoftware+","+Smartlook+","+VisualWebsiteOptimizer+","+OptiMonk+","+TwitterWebsiteUniversalTag+","+GoogleOptimize360+","+Loggly+","+StatCounter+","+Riskified+","+LotameCrowdControl+","+Mouseflow+","+Findify+","+HubspotForms+","+Wheelio+","+AlexaMetrics+","+AlexaCertifiedSiteMetrics+","+Inspectlet+","+Trustpilot+","+Snowplow+","+YahooDot+","+YahooWebAnalytics+","+DoubleClickFloodlight+","+Clicky+","+EverestTechnologies+","+Nosto+","+TyntTracer+","+MediaMath+","+Listrak+","+MailerLite+","+Datalogix+","+PiwikWebAnalytics+","+Segment+","+MailiteLite+","+Pmetrics+","+ActiveCampaign+","+aWeber+","+Drip+","+Heap+","+Gleam+","+CommerceSciences+","+Fastly+","+PicReel+","+KruxDigital+","+LinkedInInsights+","+YandexMetrika+","+EfficientFrontier+","+GoogleAnalyticsEcommerce+","+CartsGuru+","+GoogleAnalyticsIPAnonymization+","+Infusionsoft+","+SiftScience+","+FullStory+","+Sellebrity+","+Dynatrace+","+Survicate+","+Springbot+","+Chartbeat+","+KISSmetrics+","+Signal+","+VantageAnalytics+","+Airbrake+","+OmnitureSiteCatalyst+","+ClickFunnels+","+Amplitude+","+OwnerIQ+","+VeInteractive+","+AgileCRM+","+PingdomRUM+","+GoSquared+","+Woopra+","+Autopilot+","+Cedexis+","+SteelHouse+","+AdobeDynamicTagManagement+","+HeatmapIT+","+CallTrackingMetrics+","+Soldsie+","+inSparq+","+GrooveJar+","+LeadForensics+","+Sidecar+","+ConvertKit+","+ChannelAdvisor+","+AdobeMarketingCloud+","+Satellite+","+Bronto+","+Pardot+","+CueConnect+","+Bazaarvoice+","+Proof+","+Zarget
					//+","+Receiptful
					+","+Salesforce+","+AvantMetrics+","+Convert+","+ShopifyConversions+","+ShopifyBasic+","+ShopifyUSDollar+","+ShopifyProductReviews+","+ShopifyProfessional+","+ShopifyDormant+","+Hextom+","+ShopifyBritishPound+","+ShopifyCanadianDollar+","+ShopifyAustralianDollar+","+ShopifyEuro+","+ShopifyUnlimited+","+ShopifyCustom+","+Codeblackbelt+","+Loox+","+ShopifyNewZealandDollar+","+ShopifyPlus+","+ShopifyStarter+","+WooCommerce+","+ShopPad+","+Beetailer+","+Shappify+","+ShopifyBuyButton+","+ShopifyBusiness+","+WooCommerceCheckout+","+Magento+","+WixStores+","+ShopifyNPO+","+WooCommerceAddToCart+","+Apptuse+","+SquarespaceCommerce+","+CartFunctionality+","+BigCommerce+","+OpenCart+","+BigCartel+","+Volusion
					//+","+PatternbyEtsy
					+","+ShopGate+","+MagentoEnterprise+","+Ecwid+","+Lightspeed
					//+","+GoDaddyQuickShoppingCart
					//+","+a3DCart
					+","+XCart+","+MivaMerchant+","+GetShopped+","+Demandware+","+CSCart+","+InSales+","+Thinkific+","+Ejunkie+","+SEOshop+","+NetSuiteeCommerce
					//+","+GoDaddyOnlineStore
					+","+KartRocket+","+SparkPay+","+ekmPowershop+","+NetworkSolutionsCommerce+","+Spree
					//+","+ePages
					+","+LojaIntegrada+","+HikaShop
					//+","+MagentoGo
					//+","+PinnacleCart
					//+","+SocialShopWave
					+","+ShopGo
					//+","+Globale
					+","+Shopware
					//+","+Cart66
					+","+DoubleClickNet+","+FacebookCustomAudiences+","+GoogleRemarketing+","+AdRoll+","+AppNexus+","+DoubleClickBidManager+","+RubiconProject+","+TwitterAds+","+Pubmatic+","+YahooSmallBusiness+","+IponWebBidSwitch+","+RetargetApp+","+GoogleAdsense+","+IndexExchange+","+HitsAnalytics+","+Advertisingcom+","+GoogleAdsenseAsynchronous+","+Taboola+","+AppNexusSegmentPixel+","+AmazonAssociates+","+BoostSuite+","+Criteo+","+PerfectAudience+","+CriteoOneTag+","+TheTradeDesk+","+GoogleAdsenseforDomains+","+Crosswise+","+BlueKai+","+BlueKaiDMP+","+SpotXchange+","+DemDex+","+ONEbyAOL+","+AdobeAudienceManagerSync+","+Tapad+","+Simplifi+","+AdapTV+","+eXelate+","+GooglePublisherTag+","+Turn+","+AggregateKnowledge+","+ContextWeb+","+Drawbridge+","+RocketFuel+","+Eyeota+","+MediaInnovationGroup+","+Atlas+","+AmazonAdSystem+","+LinkedInAds+","+adingo+","+Bizo+","+ImproveDigital+","+TripleLift+","+Teads+","+SiteScout+","+PayPalAdvertising+","+StickyAdsTV+","+Hivewyre+","+RadiumOne+","+Omnitag+","+BurstMedia+","+LinkShare+","+Marchex+","+ReferralCandy+","+Rontar+","+StackAdapt+","+Mediaplex+","+SkimLinks+","+RUNAds+","+GoogleInteactiveMediaAds+","+PostAffiliatePro+","+Datonics+","+CommissionJunction+","+adaplo
					//+","+AdBlockAcceptableAds
					+","+YahooAdSync+","+ShareASale+","+Dstillery+","+IntegralAdScience+","+Geniee+","+GumGum+","+Woobox+","+NeustarAdAdvisor+","+VigLink+","+XPlusOne+","+Prebid
					//+","+Vdopia
					+","+GoogleConsumerSurveys+","+AppleAutoLinkMaker+","+GoogleAdSenseCustomSearchAds+","+VINDICO+","+Medianet+","+ClickBank+","+Narrative+","+Semasio+","+eBayPartnerNetwork+","+BounceExchange+","+MailChimp+","+Zotabox+","+Stamped+","+MailChimpSPF+","+GoogleCloudDNS+","+ZohoMail+","+SmileIO+","+Tidio+","+GoogleMapsforWork+","+Zopim+","+YoastSEOPremium+","+NamecheapPrivateEmail+","+CovetPics+","+LifterApps+","+JustUno+","+BackinStock+","+ZendeskEmbeddables+","+Fomo+","+RackspaceEmailHosting+","+Olark+","+Chatra+","+Mandrill+","+Searchanise+","+Mailgun+","+Zendesk+","+NetworkSolutionsEmailHosting+","+LiveChat+","+Sentry+","+Firebase+","+SLoyalty+","+CampaignMonitorWidget+","+HelloBar+","+Foursixty+","+YahooBusinessEmail+","+Wistia+","+MagicToolbox+","+JotForm+","+OptinMonster+","+Sendgrid+","+NSONE+","+ConstantContact+","+StoreLocator+","+Signifyd+","+Orankl+","+Authorizenet+","+GetSocial+","+AddShoppers+","+Stripe+","+Algolia+","+MailChannels+","+GravityForms;
			List<String> sites = new ArrayList<String>();
			sites.add(row);
			TextFileWriterUtils.writeListAsLines(sites, "C:\\Users\\elangokp\\Downloads\\shopify-topalexarank-live-matrix-limited.csv", true);
			
		    //System.out.println();
		}
		
		*/
		
			
	}

}
