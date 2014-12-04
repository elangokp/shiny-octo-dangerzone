/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.serpScraper.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Elango
 */
public class H2Utils {

    	public static void main(String args[]) {
		try {
			Class.forName("org.h2.Driver");
			Connection conn = DriverManager.getConnection("jdbc:h2:serpscrap", "sa","");
			Statement stmt = conn.createStatement();
			String dropTable = "drop table if exists EVENTS";
			stmt.addBatch(dropTable);
			String createTable = "create table if not exists EVENTS (EVENT_ID INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT, " +
									"EVENT_DATE TIMESTAMP, EVENT_TITLE VARCHAR(20))";
			stmt.addBatch(createTable);
			String insertRecord = "insert into EVENTS (EVENT_ID, EVENT_DATE, EVENT_TITLE) " +
									"values(1, '2010-09-11', 'Sample Event')";
			stmt.addBatch(insertRecord);
			stmt.executeBatch();
			String selectQuery = "select * from Events";
			ResultSet rs = stmt.executeQuery(selectQuery);
			while(rs.next()) {
				System.out.println("Event Id : " + rs.getInt("EVENT_ID")
									+ "\tEvent Date : " + rs.getDate("EVENT_DATE")
									+ "\tEvent Title : " + rs.getString("EVENT_TITLE") + "\n");
			}
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
