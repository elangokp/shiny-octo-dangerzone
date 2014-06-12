package demos;

import gudusoft.gsqlparser.EDbVendor;
import gudusoft.gsqlparser.TCustomSqlStatement;
import gudusoft.gsqlparser.TGSqlParser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SqlAnalyzer{

    private String sqlStatement="";

    public void setSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
    }

    Map<String,List<String>> columnTableMap = new TreeMap<String, List<String>>();
    String[] foundTables = new String[10000];
    String[] foundColumns = new String[10000];
    int foundTableCount = 0;
    int foundColumnsCount = 0;

    EDbVendor dbvendor;
    SqlAnalyzer(EDbVendor db){
        this.dbvendor = db;
      }


    public Map<String,List<String>> getColumnsAsMap(){

            TGSqlParser sqlparser = new TGSqlParser(this.dbvendor);
            foundColumnsCount = 0;
            foundTableCount = 0;
            //sqlparser.sqlfilename = sqlfile;
            sqlparser.sqltext = sqlStatement;
            List<String> columnList = new ArrayList<String>();
            columnTableMap = new TreeMap<String, List<String>>();

            // if you need a callback function to help determine
            // table and column relationship, set it here!
           //sqlparser.setMetaDatabase(new metaDB());

            int ret = sqlparser.parse();
            if (ret == 0){

               TCustomSqlStatement stmt = null;
               for (int i=0;i<sqlparser.sqlstatements.size();i++){
                   analyzeStmt(sqlparser.sqlstatements.get(i));
               }

                //String[] foundTables2 = new String[foundTableCount];
                /*for(int k1=0;k1<foundTableCount;k1++){
                        foundTables[k1] = foundTables[k1].toLowerCase();
                }*/
               /* System.arraycopy(foundTables,0,foundTables2,0,foundTableCount);
                Set set= new HashSet(Arrays.asList(foundTables2));
                Object[] foundTables3 = set.toArray();
                Arrays.sort(foundTables3);*/

                String[] foundColumns2 = new String[foundColumnsCount];
                /*for(int k1=0;k1<foundColumnsCount;k1++){
                        foundColumns[k1] = foundColumns[k1].toLowerCase();
                }*/
                System.arraycopy(foundColumns,0,foundColumns2,0,foundColumnsCount);
                //System.out.println("before sort:"+foundColumnsCount);

                Set<String> columnSet= new HashSet<String>(Arrays.asList(foundColumns2));
                columnList.addAll(columnSet);
                Collections.sort(columnList);
                //String[] foundColumns3 = (String[]) set2.toArray();
                //Arrays.sort(foundColumns3);
                //System.out.println("after sort:"+foundColumns3.length);


                /*System.out.println("Tables:");
                for(int j=0;j<foundTables3.length;j++){
                    System.out.println(foundTables3[j]);
                }

                System.out.println("\nColumns:");
                for(int j=0;j<foundColumns3.length;j++){
                    System.out.println(foundColumns3[j]);
                }*/

            }else{
                System.out.println(sqlparser.getErrormessage());
            }
            
            //return columnList;
            return columnTableMap;
        }


    protected void analyzeStmt(TCustomSqlStatement stmt){
        for(int i=0;i<stmt.tables.size();i++){
            if (stmt.tables.getTable(i).isBaseTable())
            {
                if ( (stmt.dbvendor == EDbVendor.dbvmssql)
                        &&( (stmt.tables.getTable(i).getFullName().equalsIgnoreCase("deleted"))
                            ||(stmt.tables.getTable(i).getFullName().equalsIgnoreCase("inserted"))
                           )
                  ){
                    continue;
                }

              foundTables[foundTableCount] = stmt.tables.getTable(i).getFullName();
              foundTableCount++;
              for (int j=0;j<stmt.tables.getTable(i).getObjectNameReferences().size();j++){
            	  List<String> columnProperties = new ArrayList<String>();
            	  String tableName = stmt.tables.getTable(i).getFullName();
            	  String columnName = stmt.tables.getTable(i).getFullName()+"."+stmt.tables.getTable(i).getObjectNameReferences().getObjectName(j).getColumnNameOnly();
            	  columnProperties.add(tableName);
            	  columnProperties.add(columnName);
            	  if(stmt.tables.getTable(i).getObjectNameReferences().getObjectName(j).isTableDetermined()) {
            		  columnProperties.add("true");
            	  } else {
            		  columnProperties.add("false");
            	  }
            	  columnTableMap.put(columnName + "-" + stmt.tables.getTable(i).getObjectNameReferences().getObjectName(j).isTableDetermined(), columnProperties);
                foundColumns[foundColumnsCount] = stmt.tables.getTable(i).getFullName()+"."+stmt.tables.getTable(i).getObjectNameReferences().getObjectName(j).getColumnNameOnly();
                foundColumns[foundColumnsCount] += "(table determined:"+stmt.tables.getTable(i).getObjectNameReferences().getObjectName(j).isTableDetermined()+")";
                  foundColumnsCount++;
              }
            }
            //System.out.println(stmt.tables.getTable(i).getFullName());
        }

        for (int i=0;i<stmt.getStatements().size();i++){
           analyzeStmt(stmt.getStatements().get(i));
        }
    }

}