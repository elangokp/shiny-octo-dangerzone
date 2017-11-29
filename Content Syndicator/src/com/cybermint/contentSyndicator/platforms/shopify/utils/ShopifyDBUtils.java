package com.cybermint.contentSyndicator.platforms.shopify.utils;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
			connection = CampaignStatsDBConnectionPool.getInstance().getConnection();
			stmt = connection.prepareCall("{call [GetNextSitesForTechDetermination] (?)}");
			stmt.setInt(1, noOfSitesNeeded);
			stmt.execute();
			rs = stmt.getResultSet();
			while (rs.next()) {
				ShopifySite aShopifySite = new ShopifySite();
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
	
	public static void main(String args[]) {
		ShopifyDBUtils dbutils = new ShopifyDBUtils();
		dbutils.getNextActiveSitesForCrawl(1);
	}
	
}
