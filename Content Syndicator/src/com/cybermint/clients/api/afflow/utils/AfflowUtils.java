package com.cybermint.clients.api.afflow.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AfflowUtils {

	public AfflowUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static Connection getCampaignStatsSQLConnection () throws ClassNotFoundException, SQLException {
		String connectionString = "jdbc:sqlserver://cybermint.database.windows.net:1433;"
				+ "database=CampaignStats;user=ca@cybermint;password=123CyberAdmin!@#;"
				+ "encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;"
				+ "loginTimeout=30;";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection connection = DriverManager.getConnection(connectionString);
		return connection;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
