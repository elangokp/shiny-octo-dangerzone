package com.cybermint.contentSyndicator.platforms.shopify.utils;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList; 

import com.cybermint.contentSyndicator.platforms.shopify.objects.ShopifyProduct;
import com.cybermint.contentSyndicator.platforms.shopify.objects.ShopifySite;
import com.cybermint.db.CampaignStatsDBConnectionPool;
import com.microsoft.sqlserver.jdbc.SQLServerCallableStatement;
import com.microsoft.sqlserver.jdbc.SQLServerDataTable;
import com.microsoft.sqlserver.jdbc.SQLServerException;

public class ShopifyDBUtils {
	
	public List<ShopifySite> getNextActiveSitesForCrawl(int noOfSitesNeeded) {
		List<ShopifySite> sites = new ArrayList<ShopifySite>();		
		Connection connection = null;
		CallableStatement stmt = null;
		ResultSet rs = null;
		try {
			connection = CampaignStatsDBConnectionPool.getInstance().getConnection();
			stmt = connection.prepareCall("{call [GetNextActiveSitesForCrawl] (?)}");
			stmt.setInt(1, noOfSitesNeeded);
			stmt.execute();
			rs = stmt.getResultSet();
			while (rs.next()) {
				ShopifySite aShopifySite = new ShopifySite();
				aShopifySite.setCrawlHeaderID(rs.getInt("CrawlHeaderId"));
				aShopifySite.setSiteID(rs.getInt("SiteID"));
				aShopifySite.setStoreURL(rs.getString("StoreURL"));
				sites.add(aShopifySite);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return sites;
	}
	
	public List<ShopifySite> getNextSitesForTechDetermination(int noOfSitesNeeded) {
		List<ShopifySite> sites = new ArrayList<ShopifySite>();		
		Connection connection = null;
		CallableStatement stmt = null;
		ResultSet rs = null;
		try {
			//System.out.println("Before Connection");
			connection = CampaignStatsDBConnectionPool.getInstance().getConnection();
			//System.out.println("After Connection");
			stmt = connection.prepareCall("{call [GetNextSitesForTechDetermination] (?)}");
			//System.out.println("After Prepare Call");
			stmt.setInt(1, noOfSitesNeeded);
			//System.out.println("After Setting Parameter");
			stmt.execute();
			//System.out.println("After Executing");
			rs = stmt.getResultSet();
			//System.out.println("After Retreiving result set");
			while (rs.next()) {
				//System.out.println("Inside WHile");
				ShopifySite aShopifySite = new ShopifySite();
				aShopifySite.setSiteID(rs.getInt("SiteID"));
				aShopifySite.setStoreURL(rs.getString("StoreURL"));
				aShopifySite.setTechDeterminationStatus(ShopifySite.STATUS_INPROGRESS);
				sites.add(aShopifySite);
				//System.out.println(aShopifySite.getSiteID()+","+aShopifySite.getStoreURL());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return sites;
	}
	
	public List<ShopifyProduct> getNextActiveProductsForCrawl(int noOfProductsNeeded) {
		List<ShopifyProduct> products = new ArrayList<ShopifyProduct>();
		Connection connection = null;
		CallableStatement stmt = null;
		ResultSet rs = null;
		try {
			connection = CampaignStatsDBConnectionPool.getInstance().getConnection();
			stmt = connection.prepareCall("{call [GetNextActiveProductsForCrawl] (?)}");
			stmt.setInt(1, noOfProductsNeeded);
			stmt.execute();
			rs = stmt.getResultSet();
			while (rs.next()) {
				ShopifyProduct aShopifyProduct = new ShopifyProduct();
				aShopifyProduct.setProductID(rs.getInt("ProductId"));
				aShopifyProduct.setProductURL(rs.getString("ProductURL"));
				products.add(aShopifyProduct);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return products;
	}
	
	private SQLServerDataTable getProductsAsDataTable(List<ShopifyProduct> products) throws SQLServerException {
		SQLServerDataTable shopifyProductDetailsTable = new SQLServerDataTable();
		shopifyProductDetailsTable.addColumnMetadata("ProductId" ,java.sql.Types.INTEGER);   
		shopifyProductDetailsTable.addColumnMetadata("ProductTitle" ,java.sql.Types.NVARCHAR); 
		shopifyProductDetailsTable.addColumnMetadata("ProductPrice" ,java.sql.Types.DOUBLE);
		shopifyProductDetailsTable.addColumnMetadata("ProductCurrency" ,java.sql.Types.NVARCHAR); 
		shopifyProductDetailsTable.addColumnMetadata("ProductDesc" ,java.sql.Types.NVARCHAR); 
		shopifyProductDetailsTable.addColumnMetadata("PublishedOn" ,java.sql.Types.DATE); 
		shopifyProductDetailsTable.addColumnMetadata("CrawlHeaderId" ,java.sql.Types.INTEGER);   
		shopifyProductDetailsTable.addColumnMetadata("SiteId" ,java.sql.Types.INTEGER); 
		shopifyProductDetailsTable.addColumnMetadata("ProductURL" ,java.sql.Types.NVARCHAR);
		shopifyProductDetailsTable.addColumnMetadata("BestSellerRank" ,java.sql.Types.INTEGER);
		shopifyProductDetailsTable.addColumnMetadata("IsSiteCrawlDone" ,java.sql.Types.INTEGER);
					
		for(ShopifyProduct product : products) {
			int productId = null == product.getProductID() ? 0 : product.getProductID();
			String productTitle = null == product.getProductTitle() ? "" : product.getProductTitle();
			double productPrice = null == product.getProductPrice() ? 0 : product.getProductPrice();
			String productCurrency = null == product.getProductCurrency() ? "" : product.getProductCurrency();
			String productDesc = null == product.getProductDesc() ? "" : product.getProductDesc();
			String publishedOn = null == product.getPublishedOn() ? "" : product.getPublishedOn().toString();
			int crawlHeaderId = null == product.getCrawlHeaderID() ? 0 : product.getCrawlHeaderID();
			int siteId = null == product.getSiteID() ? 0 : product.getSiteID();
			String productURL = null == product.getProductURL() ? "" : product.getProductURL();
			int bestSellerRank = null == product.getBestSellerRank() ? 0 : product.getBestSellerRank();
			int isSiteCrawlDone = null == product.getIsSiteCrawlComplete() ? -1 : product.getIsSiteCrawlComplete();
			
			shopifyProductDetailsTable.addRow(productId, productTitle, productPrice
					, productCurrency, productDesc, publishedOn
					,crawlHeaderId, siteId, productURL, bestSellerRank, isSiteCrawlDone);
		}
		
		return shopifyProductDetailsTable;
	}
	
	private SQLServerDataTable getSitesAsDataTable(List<ShopifySite> sites) throws SQLServerException {
		SQLServerDataTable shopifySiteDetailsTable = new SQLServerDataTable();
		shopifySiteDetailsTable.addColumnMetadata("SiteId" ,java.sql.Types.INTEGER);
		shopifySiteDetailsTable.addColumnMetadata("TechDeterminationStatus" ,java.sql.Types.INTEGER);
		shopifySiteDetailsTable.addColumnMetadata("useTrackify" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("usePixelPerfect" ,java.sql.Types.BIT); 
		shopifySiteDetailsTable.addColumnMetadata("useHextomShippingBar" ,java.sql.Types.BIT); 
		shopifySiteDetailsTable.addColumnMetadata("useKlaviyo" ,java.sql.Types.BIT); 
		shopifySiteDetailsTable.addColumnMetadata("useWheelio" ,java.sql.Types.BIT);   
		shopifySiteDetailsTable.addColumnMetadata("useTrust" ,java.sql.Types.BIT); 
		shopifySiteDetailsTable.addColumnMetadata("useCartHook" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useCriteo" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useHurrify" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useBestCurrencyConverter" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useFomo" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useBeketing" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useHextomMCC" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useRetargetApp" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("usePersonalizerLimespot" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useCoin" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useRecart" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useOneClickUpsell" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useZipifyPages" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useAdroll" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useQuantityBreaks" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useSimplifiProgrammatic" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useCurrencyConverterPlus" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useHextomQuickAnnouncement" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useLastSecondCoupon" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useTrustHero" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useExpressReviews" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useAliReviews" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useWeglot" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useLooxReviews" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useSmar7BundleUpsell" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useAutoCurrencySwitcher" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useSmar7CountdownTimer" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useFrequentlyBoughtTogether" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useAlsoBought" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useBoldUpsell" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useBoldBrain" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useBoldMultiCurrency" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useBoldSalesMotivator" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useBoldProductBundles" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useShopifyProductReviews" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useBoosterDiscountedUpsells" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("useBoosterBundleUpsell" ,java.sql.Types.BIT);
		shopifySiteDetailsTable.addColumnMetadata("html" ,java.sql.Types.NVARCHAR);
		shopifySiteDetailsTable.addColumnMetadata("useInCartUpsell" ,java.sql.Types.BIT);
					
		for(ShopifySite site : sites) {
			int siteID = null == site.getSiteID() ? 0 : site.getSiteID();
			int techDeterminationStatus = site.getTechDeterminationStatus();
			boolean useTrackify = site.isUseTrackify();
			boolean usePixelPerfect = site.isUsePixelPerfect();
			boolean useHextomShippingBar = site.isUseHextomShippingBar();
			boolean useKlaviyo = site.isUseKlaviyo();
			boolean useWheelio = site.isUseWheelio();
			boolean useTrust = site.isUseTrust();
			boolean useCartHook = site.isUseCartHook();
			boolean useCriteo = site.isUseCriteo();
			boolean useHurrify = site.isUseHurrify();
			boolean useBestCurrencyConverter = site.isUseBestCurrencyConverter();
			boolean useFomo = site.isUseFomo();
			boolean useBeketing = site.isUseBeeketing();
			boolean useHextomMCC = site.isUseHextomMCC();
			boolean useRetargetApp = site.isUseRetargetApp();
			boolean usePersonalizerLimespot = site.isUsePersonalizerLimespot();
			boolean useCoin = site.isUseCoin();
			boolean useRecart = site.isUseRecart();
			boolean useOneClickUpsell = site.isUseOneClickUpsell();
			boolean useZipifyPages = site.isUseZipifyPages();
			boolean useAdroll = site.isUseAdroll();
			boolean useQuantityBreaks = site.isUseQuantityBreaks();
			boolean useSimplifiProgrammatic = site.isUseSimplifiProgrammatic();
			boolean useCurrencyConverterPlus = site.isUseCurrencyConverterPlus();
			boolean useHextomQuickAnnouncement = site.isUseHextomQuickAnnouncement();
			boolean useLastSecondCoupon = site.isUseLastSecondCoupon();
			boolean useTrustHero = site.isUseTrustHero();
			boolean useExpressReviews = site.isUseExpressReviews();
			boolean useAliReviews = site.isUseAliReviews();
			boolean useWeglot = site.isUseWeglot();
			boolean useLooxReviews = site.isUseLooxReviews();
			boolean useSmar7BundleUpsell = site.isUseSmar7BundleUpsell();
			boolean useAutoCurrencySwitcher = site.isUseAutoCurrencySwitcher();
			boolean useSmar7CountdownTimer = site.isUseSmar7CountdownTimer();
			boolean useFrequentlyBoughtTogether = site.isUseFrequentlyBoughtTogether();
			boolean useAlsoBought = site.isUseAlsoBought();
			boolean useBoldUpsell = site.isUseBoldUpsell();
			boolean useBoldBrain = site.isUseBoldBrain();
			boolean useBoldMultiCurrency = site.isUseBoldMultiCurrency();
			boolean useBoldSalesMotivator = site.isUseBoldSalesMotivator();
			boolean useBoldProductBundles = site.isUseBoldProductBundles();
			boolean useShopifyProductReviews = site.isUseShopifyProductReviews();
			boolean useBoosterDiscountedUpsells = site.isUseBoosterDiscountedUpsells();
			boolean useBoosterBundleUpsell = site.isUseBoosterBundleUpsell();
			String html = site.getHtml();
			boolean useInCartUpsell = site.isUseInCartUpsell();
			
			shopifySiteDetailsTable.addRow(siteID,techDeterminationStatus,useTrackify,usePixelPerfect,useHextomShippingBar,useKlaviyo,useWheelio,useTrust,useCartHook,useCriteo,useHurrify,
					useBestCurrencyConverter,useFomo,useBeketing,useHextomMCC,useRetargetApp,usePersonalizerLimespot,
					useCoin,useRecart,useOneClickUpsell,useZipifyPages,useAdroll,useQuantityBreaks,useSimplifiProgrammatic,
					useCurrencyConverterPlus,useHextomQuickAnnouncement,useLastSecondCoupon,useTrustHero,useExpressReviews,
					useAliReviews,useWeglot,useLooxReviews,useSmar7BundleUpsell,useAutoCurrencySwitcher,useSmar7CountdownTimer,
					useFrequentlyBoughtTogether,useAlsoBought,useBoldUpsell,useBoldBrain,useBoldMultiCurrency,useBoldSalesMotivator,
					useBoldProductBundles,useShopifyProductReviews,useBoosterDiscountedUpsells,useBoosterBundleUpsell,html,
					useInCartUpsell);
		}
		
		return shopifySiteDetailsTable;
	}
	
	public void insertProductRankings(List<ShopifyProduct> products) {
		Connection connection = null;
		SQLServerCallableStatement stmt = null;
		try {			
			SQLServerDataTable shopifyProductDetailsTable = this.getProductsAsDataTable(products);			
			connection = CampaignStatsDBConnectionPool.getInstance().getConnection();
			stmt = connection.prepareCall("{call [InsertProductRanking] (?)}").unwrap(SQLServerCallableStatement.class);
			stmt.setStructured(1, "dbo.ShopifyProductTableType", shopifyProductDetailsTable);
			stmt.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public void markSiteCrawlAsDone(ShopifySite aShopifySite) {
		Connection connection = null;
		CallableStatement stmt = null;
		try {
			connection = CampaignStatsDBConnectionPool.getInstance().getConnection();
			stmt = connection.prepareCall("{call [MarkSiteCrawlAsDone] (?, ?)}");
			stmt.setInt(1, aShopifySite.getCrawlHeaderID());
			stmt.setInt(2, aShopifySite.getSiteID());
			stmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public void updateProductDetails(List<ShopifyProduct> products) {
		Connection connection = null;
		SQLServerCallableStatement stmt = null;		
		try {
			SQLServerDataTable shopifyProductDetailsTable = this.getProductsAsDataTable(products);
			connection = CampaignStatsDBConnectionPool.getInstance().getConnection();
			stmt = connection.prepareCall("{call [UpdateProductDetails] (?)}").unwrap(SQLServerCallableStatement.class);
			stmt.setStructured(1, "dbo.ShopifyProductTableType", shopifyProductDetailsTable);
			stmt.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public void updateSiteTechDetails(List<ShopifySite> sites) {
		Connection connection = null;
		SQLServerCallableStatement stmt = null;		
		try {
			SQLServerDataTable shopifySiteDetailsTable = this.getSitesAsDataTable(sites);
			connection = CampaignStatsDBConnectionPool.getInstance().getConnection();
			stmt = connection.prepareCall("{call [UpdateShopifySitesTechDetermination] (?)}").unwrap(SQLServerCallableStatement.class);
			stmt.setStructured(1, "dbo.ShopifySiteTableType", shopifySiteDetailsTable);
			stmt.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String args[]) {
		ShopifyDBUtils dbutils = new ShopifyDBUtils();
		dbutils.getNextActiveSitesForCrawl(1);
	}
	
}
