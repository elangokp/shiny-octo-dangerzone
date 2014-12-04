/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.contentSyndicator.sites.aln.formObjects;

/**
 *
 * @author ADMIN
 */
public class ALNArticleFormObject {

    private String projectTitle;
    private String articleTitle;
    private String articleContent;
    private String articleTags;
    private String url1;
    private String keyword1;
    private Boolean isKeyword1Bold;
    private String url2;
    private String keyword2;
    private Boolean isKeyword2Bold;
    private String url3;
    private String keyword3;
    private Boolean isKeyword3Bold;
    private String youtubeUrl;
    private String scheduledDate;

    public ALNArticleFormObject() {

    }

    public ALNArticleFormObject(String projectTitle, String articleTitle, String articleContent, String articleTags, String url1, String keyword1, Boolean isKeyword1Bold, String url2, String keyword2, Boolean isKeyword2Bold, String url3, String keyword3, Boolean isKeyword3Bold, String youtubeUrl) {
        this.projectTitle = projectTitle;
        this.articleTitle = articleTitle;
        this.articleContent = articleContent;
        this.articleTags = articleTags;
        this.url1 = url1;
        this.keyword1 = keyword1;
        this.isKeyword1Bold = isKeyword1Bold;
        this.url2 = url2;
        this.keyword2 = keyword2;
        this.isKeyword2Bold = isKeyword2Bold;
        this.url3 = url3;
        this.keyword3 = keyword3;
        this.isKeyword3Bold = isKeyword3Bold;
        this.youtubeUrl = youtubeUrl;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public String getArticleTags() {
        return articleTags;
    }

    public void setArticleTags(String articleTags) {
        this.articleTags = articleTags;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public Boolean getIsKeyword1Bold() {
        return isKeyword1Bold;
    }

    public void setIsKeyword1Bold(Boolean isKeyword1Bold) {
        this.isKeyword1Bold = isKeyword1Bold;
    }

    public Boolean getIsKeyword2Bold() {
        return isKeyword2Bold;
    }

    public void setIsKeyword2Bold(Boolean isKeyword2Bold) {
        this.isKeyword2Bold = isKeyword2Bold;
    }

    public Boolean getIsKeyword3Bold() {
        return isKeyword3Bold;
    }

    public void setIsKeyword3Bold(Boolean isKeyword3Bold) {
        this.isKeyword3Bold = isKeyword3Bold;
    }

    public String getKeyword1() {
        return keyword1;
    }

    public void setKeyword1(String keyword1) {
        this.keyword1 = keyword1;
    }

    public String getKeyword2() {
        return keyword2;
    }

    public void setKeyword2(String keyword2) {
        this.keyword2 = keyword2;
    }

    public String getKeyword3() {
        return keyword3;
    }

    public void setKeyword3(String keyword3) {
        this.keyword3 = keyword3;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getUrl1() {
        return url1;
    }

    public void setUrl1(String url1) {
        this.url1 = url1;
    }

    public String getUrl2() {
        return url2;
    }

    public void setUrl2(String url2) {
        this.url2 = url2;
    }

    public String getUrl3() {
        return url3;
    }

    public void setUrl3(String url3) {
        this.url3 = url3;
    }

    public String getYoutubeUrl() {
        return youtubeUrl;
    }

    public void setYoutubeUrl(String youtubeUrl) {
        this.youtubeUrl = youtubeUrl;
    }

	/**
	 * @return the scheduledDate
	 */
	public String getScheduledDate() {
		return scheduledDate;
	}

	/**
	 * @param scheduledDate the scheduledDate to set
	 */
	public void setScheduledDate(String scheduledDate) {
		this.scheduledDate = scheduledDate;
	}

}
