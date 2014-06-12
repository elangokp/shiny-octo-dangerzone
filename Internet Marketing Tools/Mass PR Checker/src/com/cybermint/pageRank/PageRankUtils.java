package com.cybermint.pageRank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.cybermint.utils.TextFileReaderUtils;

public class PageRankUtils {

	public static void savePRToDB(String urlAndPrLocation, String prType) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/serp", "root", "mysql");
		Statement stmt = conn.createStatement();
		List<String> urlandPrList = TextFileReaderUtils.readLinesAsList(urlAndPrLocation,true);
		Integer queryCount=0;
		for(String urlAndPr : urlandPrList) {
			System.out.println(urlAndPr);
			String[] urlPrArray = urlAndPr.split("[|]");
			String url = urlPrArray[0].trim();
			String prAsString = urlPrArray[1].trim();
			Integer pr = 0;
			System.out.println(url);
			System.out.println(prAsString);
			if("N/A".equalsIgnoreCase(prAsString)) {
				pr = -1;
			} else {
				pr = Integer.parseInt(prAsString);
			}
			String updateQuery = null;
			if("url".equalsIgnoreCase(prType)) {
				updateQuery = "update serp.urls set url_pr = " + pr + " where url = '" + url + "'";
			} else if("domain".equalsIgnoreCase(prType)) {
				updateQuery = "update serp.urls set domain_pr = " + pr + " where domain = '" + url + "'";
			}
			System.out.println(updateQuery);
			stmt.addBatch(updateQuery);
			queryCount++;
			if(queryCount%10==0) {
				System.out.println("Executing Batch Update");
				stmt.executeBatch();
				System.out.println("Batch Update Complete");
				stmt.clearBatch();
				System.out.println("Batch Cleared");
			}			
		}
		System.out.println("Executing Batch Update - outside Loop");
		stmt.executeBatch();
		System.out.println("Batch Update Complete - outside Loop");
		stmt.close();
	}
	
	public static void main(String args[]) {
		try {
			PageRankUtils.savePRToDB("F:/My Dropbox/Website Campaigns/01.Cure Tinnitus/Keyword Research/New Methodology/urls and pr.txt", "url");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
