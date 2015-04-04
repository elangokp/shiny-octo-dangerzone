package demos;

import gudusoft.gsqlparser.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * The logic to find all tables and columns in SQL script is quite simple like
 * this:
 *<p>
 * 1. Iterate all statements via {@link TGSqlParser#sqlstatements} and
 * {@link gudusoft.gsqlparser.TCustomSqlStatement#getStatements()}
 *<p>
 * 2. Once a statement was found, get all tables belong to this statement via
 * {@link TCustomSqlStatement#tables}
 *<p>
 * 3. Once a table was found, get all columns belong to this table via
 * {@link gudusoft.gsqlparser.nodes.TTable#getObjectNameReferences()}
 */

public class GetTableColumns {

	public static void main(String args[]) {
		String queriesFilePath = args[0];
		String allColumnsCsvFilepath = args[1];
		String CMFacetsCsvFilePath = args[2];
		String deltaColumnsCsvFilepath = args[3];
		String queriesAndColumnsFilepath = args[4];
		String detectedSPCallsFilepath = args[5];
		String inputQueriesFileType = args[6];
		EDbVendor dbVendor = EDbVendor.dbvsybase;
		SqlAnalyzer sa = new SqlAnalyzer(dbVendor);
		CMFacetsUtil aCMFacetsUtil = new CMFacetsUtil(CMFacetsCsvFilePath);
		//Set<String> queries = TextFileReader.getFileLinesAsSet("D:/SBI-workspace/GetmemPcpdetails-console query.txt");
		Set<String> queries = new HashSet<String> ();
		if(inputQueriesFileType.equalsIgnoreCase("newLineSeparatedStatements")) {
			System.out.println("Inside newLineSeparatedStatements");
			queries = TextFileReader.getFileLinesAsSet(queriesFilePath);
		} else if(inputQueriesFileType.equalsIgnoreCase("separatorSeparatedStatements")) {
			System.out.println("Inside separatorSeparatedStatements");
			queries = TextFileReader.getFileContentAsSet(queriesFilePath, "\\*\\*\\*\\*SEPARATOR\\*\\*\\*\\*");
		} else if(inputQueriesFileType.equalsIgnoreCase("p6spyLogFile")) {
			System.out.println("Inside p6spyLogFile");
			queries = P6SpyLogFileReader.getUniqueStatements(queriesFilePath);
		}		
		Map<String, List<String>> allQueriesColumnTableMap = new TreeMap<String, List<String>>();
		StringBuffer detectedSPCalls = new StringBuffer();
		StringBuffer queriesAndColumns = new StringBuffer();
		StringBuffer columnsTable = new StringBuffer();		
		columnsTable.append("Table,Column,Table Determined");
		columnsTable.append(System.getProperty("line.separator"));
		StringBuffer deltaColumnsTable = new StringBuffer();
		deltaColumnsTable.append("Table,Column,Table Determined");
		deltaColumnsTable.append(System.getProperty("line.separator"));
		for(String query : queries) {
			query = query.replaceAll("\\?", "0");
			//query = query.replaceAll("\\r\\n|\\r|\\n", " ").replaceAll(" +"," ");
			System.out.println(query);
			if(query.contains("call")||query.contains("exec")) {
				detectedSPCalls.append(query);
				detectedSPCalls.append(System.getProperty("line.separator"));
				detectedSPCalls.append(System.getProperty("line.separator"));
			}
			sa.setSqlStatement(query);
			Map<String, List<String>> columnTableMap = sa.getColumnsAsMap();
			allQueriesColumnTableMap.putAll(columnTableMap);
			queriesAndColumns.append(query);
			queriesAndColumns.append(System.getProperty("line.separator"));
			queriesAndColumns.append(System.getProperty("line.separator"));
			queriesAndColumns.append(System.getProperty("line.separator"));
			queriesAndColumns.append("Columns : ");
			queriesAndColumns.append(System.getProperty("line.separator"));
			queriesAndColumns.append(System.getProperty("line.separator"));
			for (String column : columnTableMap.keySet()) {
				List<String> columnProperties = columnTableMap.get(column);
				queriesAndColumns.append(columnProperties.get(1)).append(",");
				queriesAndColumns.append(columnProperties.get(2));
				queriesAndColumns.append(System.getProperty("line.separator"));
			}
			queriesAndColumns.append(System.getProperty("line.separator"));
			queriesAndColumns.append(System.getProperty("line.separator"));
			queriesAndColumns.append("*******************************************************************");
			queriesAndColumns.append(System.getProperty("line.separator"));
			queriesAndColumns.append(System.getProperty("line.separator"));
			queriesAndColumns.append(System.getProperty("line.separator"));			
		}
		for (String column : allQueriesColumnTableMap.keySet()) {
			List<String> columnProperties = allQueriesColumnTableMap.get(column);
			columnsTable.append(columnProperties.get(0)).append(",");
			columnsTable.append(columnProperties.get(1)).append(",");
			columnsTable.append(columnProperties.get(2));
			columnsTable.append(System.getProperty("line.separator"));
			if(!aCMFacetsUtil.isAvailableInCMFacets(columnProperties.get(1))) {
				deltaColumnsTable.append(columnProperties.get(0)).append(",");
				deltaColumnsTable.append(columnProperties.get(1)).append(",");
				deltaColumnsTable.append(columnProperties.get(2));
				deltaColumnsTable.append(System.getProperty("line.separator"));
			}
		}
		//System.out.println(columnsTable.toString());
		//File outputFile = new File("D:/SBI-workspace/columns.csv");
		File outputFile = new File(allColumnsCsvFilepath);
		File deltaOutputFile = new File(deltaColumnsCsvFilepath);
		File queriesAndColumnsFile = new File(queriesAndColumnsFilepath);
		File detectedSPCallsFile = new File(detectedSPCallsFilepath);
		outputFile.getParentFile().mkdirs();
		deltaOutputFile.getParentFile().mkdirs();
		queriesAndColumnsFile.getParentFile().mkdirs();
		detectedSPCallsFile.getParentFile().mkdirs();
		try {
			Writer out = new OutputStreamWriter(new FileOutputStream(outputFile));
			out.write(columnsTable.toString());
			out.close();
			out = new OutputStreamWriter(new FileOutputStream(deltaOutputFile));
			out.write(deltaColumnsTable.toString());
			out.close();
			out = new OutputStreamWriter(new FileOutputStream(queriesAndColumnsFile));
			out.write(queriesAndColumns.toString());
			out.close();
			out = new OutputStreamWriter(new FileOutputStream(detectedSPCallsFile));
			out.write(detectedSPCalls.toString());
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
