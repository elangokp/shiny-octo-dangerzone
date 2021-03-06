package com.cybermint.serpScraper.hibernate;
// Generated May 28, 2011 5:31:02 PM by Hibernate Tools 3.2.1.GA



/**
 * Urls generated by hbm2java
 */
public class Urls  implements java.io.Serializable {


     private Integer urlId;
     private Keywords keywords;
     private Projects projects;
     private String url;
     private int rank;

    public Urls() {
    }

    public Urls(Keywords keywords, Projects projects, String url, int rank) {
       this.keywords = keywords;
       this.projects = projects;
       this.url = url;
       this.rank = rank;
    }
   
    public Integer getUrlId() {
        return this.urlId;
    }
    
    public void setUrlId(Integer urlId) {
        this.urlId = urlId;
    }
    public Keywords getKeywords() {
        return this.keywords;
    }
    
    public void setKeywords(Keywords keywords) {
        this.keywords = keywords;
    }
    public Projects getProjects() {
        return this.projects;
    }
    
    public void setProjects(Projects projects) {
        this.projects = projects;
    }
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    public int getRank() {
        return this.rank;
    }
    
    public void setRank(int rank) {
        this.rank = rank;
    }




}


