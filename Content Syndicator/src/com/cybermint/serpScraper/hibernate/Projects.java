package com.cybermint.serpScraper.hibernate;
// Generated May 28, 2011 5:31:02 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Projects generated by hbm2java
 */
public class Projects  implements java.io.Serializable {


     private Integer projectId;
     private String projectName;
     private String projectDesc;
     private Set keywordses = new HashSet(0);
     private Set urlses = new HashSet(0);

    public Projects() {
    }

	
    public Projects(String projectName) {
        this.projectName = projectName;
    }
    public Projects(String projectName, String projectDesc, Set keywordses, Set urlses) {
       this.projectName = projectName;
       this.projectDesc = projectDesc;
       this.keywordses = keywordses;
       this.urlses = urlses;
    }
   
    public Integer getProjectId() {
        return this.projectId;
    }
    
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }
    public String getProjectName() {
        return this.projectName;
    }
    
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public String getProjectDesc() {
        return this.projectDesc;
    }
    
    public void setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
    }
    public Set getKeywordses() {
        return this.keywordses;
    }
    
    public void setKeywordses(Set keywordses) {
        this.keywordses = keywordses;
    }
    public Set getUrlses() {
        return this.urlses;
    }
    
    public void setUrlses(Set urlses) {
        this.urlses = urlses;
    }




}

