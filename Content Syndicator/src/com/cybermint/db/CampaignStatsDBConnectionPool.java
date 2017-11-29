package com.cybermint.db;

import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class CampaignStatsDBConnectionPool {

	private static CampaignStatsDBConnectionPool instance = null;
    private HikariDataSource ds;

    private CampaignStatsDBConnectionPool(){
    	String connectionString = "jdbc:sqlserver://cybermint.database.windows.net:1433;"
							    	+ "database=CampaignStats;"
									+ "encrypt=true;trustServerCertificate=false;"
									+ "hostNameInCertificate=*.database.windows.net;"
									+ "loginTimeout=30;";
        HikariConfig config = new HikariConfig(); 
        config.setJdbcUrl(connectionString);
        config.setDataSourceClassName("com.microsoft.sqlserver.jdbc.SQLServerDataSource");
		//config.setUsername("ca@cybermint");
		//config.setPassword("123CyberAdmin!@#");
		config.addDataSourceProperty("serverName", "cybermint.database.windows.net");
	    //config.addDataSourceProperty("port", 1433);
	    config.addDataSourceProperty("databaseName", "CampaignStats");
	    config.addDataSourceProperty("user", "ca@cybermint");
	    config.addDataSourceProperty("password", "123CyberAdmin!@#");
		//config.addDataSourceProperty("cachePrepStmts", "true");
		//config.addDataSourceProperty("prepStmtCacheSize", "250");
		//config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

		ds = new HikariDataSource(config);
    }

    public static CampaignStatsDBConnectionPool getInstance()  
    {  
    	if (instance == null) {
    		instance = new CampaignStatsDBConnectionPool();
    	}
        return instance;  
    }  

    public Connection getConnection()  throws SQLException  
    {  
        return ds.getConnection();  
    }
}
