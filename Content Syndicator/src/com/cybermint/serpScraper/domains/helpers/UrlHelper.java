/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.serpScraper.domains.helpers;

import com.cybermint.contentSyndicator.pojo.UrlProperties;
import com.cybermint.serpScraper.domains.Keyword;
import com.cybermint.serpScraper.domains.Url;
import com.cybermint.serpScraper.hibernate.HibernateUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * 
 * @author 309680
 */
public class UrlHelper {

	static Session session;

	static {
		session = HibernateUtil.getSessionFactory().getCurrentSession();
	}
	
	public UrlHelper() {
		this.session = HibernateUtil.getSessionFactory().getCurrentSession();
	}

	public Url getUrlById(Integer urlId) {
		this.session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Url aUrl = (Url) session.createQuery(
				"from Url url where url.urlId=" + urlId).uniqueResult();
		session.close();
		return aUrl;
	}
	
	public static synchronized List<String> getUrlsWherePrIsNull(Integer noOfUrls) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		List<String> urls = new ArrayList<String>();
		Transaction t = session.beginTransaction();
		t.begin();
		urls.addAll(session
						.createSQLQuery(
								"select distinct(url) from urls where url_pr is null")
						.setMaxResults(noOfUrls).list());
		for (String aUrl : urls) {
			session
					.createSQLQuery(
							"update urls set url_pr=-256 " + 
							"where url='" + aUrl + "'").executeUpdate();
		}
		t.commit();
		return urls;
	}
	
	public static synchronized void setUrlPrForUrls(List<UrlProperties> urlPropertiesList) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		System.out.println("Inside setUrlPrForUrls : urlPropertiesList size is : " + urlPropertiesList.size());
		Transaction t = session.beginTransaction();
		t.begin();
		for (UrlProperties aUrlProperties : urlPropertiesList) {
			session
			.createSQLQuery(
					"update urls set url_pr=" + aUrlProperties.getPr() + " " +
					"where url='" + aUrlProperties.getUrl() + "'").executeUpdate();
		}
		t.commit();
	}

	public static synchronized List<String> getDomainsWherePrIsNull(Integer noOfUrls) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		List<String> urls = new ArrayList<String>();
		Transaction t = session.beginTransaction();
		t.begin();
		urls.addAll(session
						.createSQLQuery(
								"select distinct(domain) from urls where domain_pr is null")
						.setMaxResults(noOfUrls).list());
		for (String aUrl : urls) {
			session
					.createSQLQuery(
							"update urls set domain_pr=-256 " + 
							"where domain='" + aUrl + "'").executeUpdate();
		}
		t.commit();
		return urls;
	}
	
	public static synchronized void setDomainPrForUrls(List<UrlProperties> urlPropertiesList) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		System.out.println("Inside setDomainPrForUrls : urlPropertiesList size is : " + urlPropertiesList.size());
		Transaction t = session.beginTransaction();
		t.begin();
		for (UrlProperties aUrlProperties : urlPropertiesList) {
			session
			.createSQLQuery(
					"update urls set domain_pr=" + aUrlProperties.getPr() + " " +
					"where domain='" + aUrlProperties.getUrl() + "'").executeUpdate();
		}
		t.commit();
	}
	
	public static synchronized List<String> getUrlsWhereMajesticseoIsNull(Integer noOfUrls) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		List<String> urls = new ArrayList<String>();
		Transaction t = session.beginTransaction();
		t.begin();
		urls.addAll(session
						.createSQLQuery(
								"select distinct(url) from urls where majesticseo_backlinks_status is null")
						.setMaxResults(noOfUrls).list());
		for (String aUrl : urls) {
			session
					.createSQLQuery(
							"update urls set majesticseo_backlinks_status='In Progress', " +
							"majesticseo_url_type='-256', " +
							"majesticseo_acrank=-256, " +
							"majesticseo_external_backlinks_count=-256, " +
							"majesticseo_gov_external_backlinks_count=-256, " +
							"majesticseo_edu_external_backlinks_count=-256, " +
							"majesticseo_referring_domains_count=-256, " +
							"majesticseo_gov_referring_domains_Count=-256, " +
							"majesticseo_edu_referring_domains_Count=-256, " +
							"majesticseo_ip_addresses_count=-256, " +
							"majesticseo_class_c_subnets_count=-256 " +
							"where url='" + aUrl + "'").executeUpdate();
		}
		t.commit();
		return urls;
	}
	
	public static synchronized void setMajesticseoForUrls(List<UrlProperties> urlPropertiesList) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		System.out.println("Inside setMajesticseoForUrls : urlPropertiesList size is : " + urlPropertiesList.size());
		Transaction t = session.beginTransaction();
		t.begin();
		for (UrlProperties aUrlProperties : urlPropertiesList) {
			session
			.createSQLQuery(
					"update urls set majesticseo_backlinks_status='" + aUrlProperties.getMajesticSeoBacklinksStatus() + "', " +
					"majesticseo_url_type='" + aUrlProperties.getMajesticSeoUrlType() + "', " +
					"majesticseo_acrank="+ aUrlProperties.getMajesticSeoACRank() + ", " +
					"majesticseo_external_backlinks_count=" + aUrlProperties.getMajesticSeoExternalBacklinksCount() + ", " +
					"majesticseo_gov_external_backlinks_count=" + aUrlProperties.getMajesticSeoGovExternalBacklinksCount() + ", " +
					"majesticseo_edu_external_backlinks_count=" + aUrlProperties.getMajesticSeoEduExternalBacklinksCount() + ", " +
					"majesticseo_referring_domains_count=" + aUrlProperties.getMajesticSeoReferringDomainsCount() + ", " +
					"majesticseo_gov_referring_domains_Count=" + aUrlProperties.getMajesticSeoGovReferringDomainsCount() + ", " +
					"majesticseo_edu_referring_domains_Count=" + aUrlProperties.getMajesticSeoEduReferringDomainsCount() + ", " +
					"majesticseo_ip_addresses_count=" + aUrlProperties.getMajesticSeoIPAddressesCount() + ", " +
					"majesticseo_class_c_subnets_count=" + aUrlProperties.getMajesticSeoClassCSubnetsCount() + " " +
					"where url='" + aUrlProperties.getUrl() + "'").executeUpdate();
		}
		t.commit();
	}

	public static synchronized List<String> getDomainsWhereMajesticseoToDomainIsNull(Integer noOfUrls) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		List<String> domains = new ArrayList<String>();
		Transaction t = session.beginTransaction();
		t.begin();
		domains.addAll(session
						.createSQLQuery(
								"select distinct(domain) from urls where majesticseo_backlinks_to_domain_status is null")
						.setMaxResults(noOfUrls).list());
		for (String aDomain : domains) {
			session
					.createSQLQuery(
							"update urls set majesticseo_backlinks_to_domain_status='In Progress', " +
							"majesticseo_external_backlinks_to_domain_count=-256, " +
							"majesticseo_gov_external_backlinks_to_domain_count=-256, " +
							"majesticseo_edu_external_backlinks_to_domain_count=-256, " +
							"majesticseo_referring_domains_to_domain_count=-256, " +
							"majesticseo_gov_referring_domains_to_domain_Count=-256, " +
							"majesticseo_edu_referring_domains_to_domain_Count=-256, " +
							"majesticseo_ip_addresses_to_domain_count=-256, " +
							"majesticseo_class_c_subnets_to_domain_count=-256 " +
							"where domain='" + aDomain + "'").executeUpdate();
		}
		t.commit();
		return domains;
	}
	
	public static synchronized void setMajesticseoForDomains(List<UrlProperties> urlPropertiesList) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction t = session.beginTransaction();
		t.begin();
		for (UrlProperties aUrlProperties : urlPropertiesList) {
			session
			.createSQLQuery(
					"update urls set majesticseo_backlinks_to_domain_status='" + aUrlProperties.getMajesticSeoBacklinksStatus() + "', " +
					"majesticseo_external_backlinks_to_domain_count=" + aUrlProperties.getMajesticSeoExternalBacklinksCount() + ", " +
					"majesticseo_gov_external_backlinks_to_domain_count=" + aUrlProperties.getMajesticSeoGovExternalBacklinksCount() + ", " +
					"majesticseo_edu_external_backlinks_to_domain_count=" + aUrlProperties.getMajesticSeoEduExternalBacklinksCount() + ", " +
					"majesticseo_referring_domains_to_domain_count=" + aUrlProperties.getMajesticSeoReferringDomainsCount() + ", " +
					"majesticseo_gov_referring_domains_to_domain_Count=" + aUrlProperties.getMajesticSeoGovReferringDomainsCount() + ", " +
					"majesticseo_edu_referring_domains_to_domain_Count=" + aUrlProperties.getMajesticSeoEduReferringDomainsCount() + ", " +
					"majesticseo_ip_addresses_to_domain_count=" + aUrlProperties.getMajesticSeoIPAddressesCount() + ", " +
					"majesticseo_class_c_subnets_to_domain_count=" + aUrlProperties.getMajesticSeoClassCSubnetsCount() + " " +
					"where domain='" + aUrlProperties.getUrl() + "'").executeUpdate();
		}
		t.commit();
	}

	// public BigDecimal saveNewUrl(Url aUrl,Keyword aKeyword) {
	// Url aUrl = new Url();
	// aKeyword.setKeyword(keyword);
	// aKeyword.setStatus("Pending");
	// aKeyword.setUrls(null);
	// this.session = HibernateUtil.getSessionFactory().getCurrentSession();
	// Transaction t = session.beginTransaction();
	// t.begin();
	// BigDecimal id = (BigDecimal) session.save(aKeyword);
	// t.commit();
	// return id;
	// }

	// public void updateKeyword(Keyword aKeyword) {
	// this.session = HibernateUtil.getSessionFactory().getCurrentSession();
	// Transaction t = session.beginTransaction();
	// t.begin();
	// session.update(aKeyword);
	// t.commit();
	// }

	// public void updateAndCompleteKeyword(Keyword aKeyword) {
	// this.session = HibernateUtil.getSessionFactory().getCurrentSession();
	// aKeyword.setStatus("Complete");
	// Transaction t = session.beginTransaction();
	// t.begin();
	// System.out.println("Inside begin");
	// session.update(aKeyword);
	// System.out.println("After Update");
	// t.commit();
	// System.out.println("After Commit");
	// }

	// public List<BigDecimal> saveAllNewKeywords(List<String> allKeywords) {
	// this.session = HibernateUtil.getSessionFactory().getCurrentSession();
	// Transaction t = session.beginTransaction();
	// t.begin();
	// Keyword aKeyword;
	// List<BigDecimal> keywordIds = new ArrayList<BigDecimal>();
	// for(String aKeywordPhrase:allKeywords) {
	// aKeyword = new Keyword(aKeywordPhrase,"Pending");
	// keywordIds.add((BigDecimal) session.save(aKeyword));
	// }
	// t.commit();
	// return keywordIds;
	//
	// }

	public static void main(String args[]) {
		// KeywordHelper aKeywordHelper = new KeywordHelper();
		// aKeywordHelper.getKeywordById(7);
		// System.out.println(aKeywordHelper.getKeywordById(2).getKeyword());
		// aKeywordHelper = new KeywordHelper();
		// System.out.println(aKeywordHelper.getKeywordById(1).getKeyword());
		// System.out.println(aKeywordHelper.getNextPendingKeyword().getKeyword());
		// aKeywordHelper.saveNewKeyword("Aganya");
		// aKeywordHelper.saveNewKeyword("Uma");
		// aKeywordHelper.saveNewKeyword("karthick");
		// aKeywordHelper.saveNewKeyword("Elango");

		// Url aUrl = new Url();
		// aUrl.setUrl("ssghsdh");
		// aUrl.setRank(BigDecimal.ZERO);
		// session.save(aUrl);
		// System.out.println(aKeywordHelper.getNextPendingKeyword().getKeyword());
		UrlHelper aUrlHelper = new UrlHelper();
		for (String aUrl : aUrlHelper.getUrlsWhereMajesticseoIsNull(10)) {
			System.out.println(aUrl);
		}
	}

}
