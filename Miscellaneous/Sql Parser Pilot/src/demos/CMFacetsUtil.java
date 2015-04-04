package demos;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CMFacetsUtil {

	String facetsModelFilepath = null;
	Set<String> CMFacetsColumns = new HashSet<String>();
	public CMFacetsUtil(String facetsModelFilepath) {
		this.facetsModelFilepath = facetsModelFilepath;
		this.CMFacetsColumns = constructColumnList(facetsModelFilepath);
	}
	 public static Set<String> constructColumnList(String facetsModelFilepath) {
		 List<String> linesList = TextFileReader.getFileLinesAsList(facetsModelFilepath);
		 Set<String> CMFacetsColumns = new HashSet<String>();
		 //i starting from 1 to ignore the header in CMFacets datamodel csv.
		 for(int i =1 ; i<linesList.size() ; i++) {
			 String[] singleRowColumns = linesList.get(i).split(",");
			 String fullyQualifiedCMFacetsColumn = singleRowColumns[0].trim() + "." + singleRowColumns[1].trim();
			 CMFacetsColumns.add(fullyQualifiedCMFacetsColumn);
		 }
		 return CMFacetsColumns;
	 }
	 
	 public boolean isAvailableInCMFacets(String givenColumnName) {
		 boolean isAvailable = false;
		 for(String CMColumnName : CMFacetsColumns) {
			 if(givenColumnName.equalsIgnoreCase(CMColumnName)) {
				 isAvailable = true;
				 break;
			 }
		 }
		 return isAvailable;
	 }
}
