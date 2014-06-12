package demos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class JMSSQLBCP {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		String dbHost = args[0];
		String dbName = args[1];
		String userName = args[2];
		String password = args[3];
		String tableName = args[4];
		String outputFile = args[5];
		
	    try {
	    	File aFile = new File(outputFile);
			aFile.getParentFile().mkdirs();
	  	  	aFile.createNewFile();
	  	  	FileWriter fstream = new FileWriter(aFile);
	  	  	BufferedWriter out = new BufferedWriter(fstream);
	       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

	       Connection conn = DriverManager.getConnection("jdbc:sqlserver://" + dbHost + ":1433;DatabaseName=" + dbName + ";user=" + userName + ";password=" + password+ ";");
	       Statement stmt = conn.createStatement( );
	       System.out.println( "Querying...");
	       ResultSet rs = stmt.executeQuery( "SELECT * FROM " + tableName);
	       
	       // Get result set meta data
	       ResultSetMetaData rsmd = rs.getMetaData();
	       int numColumns = rsmd.getColumnCount();
	       System.out.println( "Writing to file...");

	       // Get the column names; column indices start from 1
	       for (int i=1; i<numColumns+1; i++) {
	           String columnName = rsmd.getColumnName(i);
	           out.write(columnName);
	           if(i<numColumns) {
	        	   out.write("|");
	           }
	           // Get the name of the column's table name
	           //String tableName = rsmd.getTableName(i);
	       }

	       while ( rs.next( ) ) {
	    	   for (int i=1; i<numColumns+1; i++) {
		           out.write(rs.getString( i ));
		           if(i<numColumns) {
		        	   out.write("|");
		           }
		       }
	    	   out.write(System.getProperty("line.separator"));
	       }
	       out.close();
	       System.out.println( "BCP Complete! Have a great day :)");
	     } catch ( Exception e ) {
	       System.out.println( "An exception occurred." + e );
	     }	    

	}

}
