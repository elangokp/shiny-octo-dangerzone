package demos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.List;

public class QueryUtils {

	public static void main( String[] args ) {
		List<String> customTables = TextFileReader.getFileLinesAsList("D:/Elango/SBI/Sample Data dump/custom tables list.txt");
		//for(String customTable : customTables) {
		String customTable = "fawlpdv2rptg.dbo.wlpt_prpr_prad_dtls";
			StringBuilder resultString = new StringBuilder();
		    try {
		       // Using Sybase jConnect 4.2 
		       //Class.forName("com.sybase.jdbc.SybDriver");

		       // Using Sybase jConnect 5.2
		       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		       Connection conn = DriverManager.getConnection("jdbc:sqlserver://63.78.177.20:1433;DatabaseName=fawlpdv2rptg;user=syac58075;password=Facets600;");
		       Statement stmt = conn.createStatement( );
		       ResultSet rs = stmt.executeQuery( "SELECT * FROM " + customTable);
		       
		       // Get result set meta data
		       ResultSetMetaData rsmd = rs.getMetaData();
		       int numColumns = rsmd.getColumnCount();

		       // Get the column names; column indices start from 1
		       for (int i=1; i<numColumns+1; i++) {
		           String columnName = rsmd.getColumnName(i);
		           resultString.append(columnName);
		           if(i<numColumns) {
		        	   resultString.append("|");
		           }
		           // Get the name of the column's table name
		           //String tableName = rsmd.getTableName(i);
		       }
		       resultString.append(System.getProperty("line.separator"));

		       while ( rs.next( ) ) {
		    	   for (int i=1; i<numColumns+1; i++) {
			           resultString.append(rs.getString( i ));
			           if(i<numColumns) {
			        	   resultString.append("|");
			           }
			       }
		    	   resultString.append(System.getProperty("line.separator"));
		       }
		     } catch ( Exception e ) {
		       System.out.println( "An exception occurred." + e );
		     }
		     System.out.println(resultString.toString());
		     try{
		    	  // Create file 
		    	  File aFile = new File("D:/Visa/output.txt");
		    	  aFile.createNewFile();
		    	  FileWriter fstream = new FileWriter(aFile);
		    	  BufferedWriter out = new BufferedWriter(fstream);
		    	  out.write(resultString.toString());
		    	  //Close the output stream
		    	  out.close();
		    	  }catch (Exception e){//Catch exception if any
		    	  System.err.println("Error: " + e.getMessage());
		    	  }
		//}
		


	  } // end of main


}
