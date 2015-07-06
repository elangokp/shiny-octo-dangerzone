/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.serpScraper.domains.helpers;

import com.cybermint.serpScraper.domains.Keyword;
import com.cybermint.serpScraper.domains.Project;
import com.cybermint.serpScraper.domains.Url;
import com.cybermint.serpScraper.hibernate.HibernateUtil;
import com.cybermint.utils.KeywordUtils;
import com.cybermint.utils.TextFileReaderUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author 309680
 */
public class KeywordHelper {

    Session session;
    private static KeywordHelper aKeywordHelper = null;
    
    public synchronized static KeywordHelper getInstance() {
    	if(aKeywordHelper == null) {
    		aKeywordHelper = new KeywordHelper();
    	}
    	return aKeywordHelper;
    }

    private KeywordHelper() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    public Keyword getKeywordById(Integer keywordId) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Keyword aKeyword = (Keyword) session.createQuery("from Keyword kwd where kwd.keywordId=" + keywordId).uniqueResult();
        //session.close();
        return aKeyword;
    }
    
    public Keyword getNextPendingKeyword() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        t.begin();
        BigInteger keywordId = (BigInteger) session.createSQLQuery("Select keyword_id from keywords where status='Pending' order by keyword_id asc").setFirstResult(0).setMaxResults(1).uniqueResult();
//        Keyword aKeyword = (Keyword) session.createQuery("from Keyword kwd where kwd.status='Pending' order by kwd.keywordId asc").setFirstResult(0).setMaxResults(1).uniqueResult();
        Keyword aKeyword = (Keyword) session.load(Keyword.class, new BigDecimal(keywordId));
        if(aKeyword!=null) {
            aKeyword.setStatus("In Progress");
            session.update(aKeyword);
        }
        t.commit();
        return aKeyword;
    }

    public Keyword getNextPendingKeyword(Project aProject) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        t.begin();
        BigInteger keywordId = (BigInteger) session.createSQLQuery("Select keyword_id from keywords where status='Pending' and project_id=" + aProject.getProjectId() + " order by keyword_id asc").setFirstResult(0).setMaxResults(1).uniqueResult();
//        Keyword aKeyword = (Keyword) session.createQuery("from Keyword kwd where kwd.status='Pending' order by kwd.keywordId asc").setFirstResult(0).setMaxResults(1).uniqueResult();
        Keyword aKeyword = (Keyword) session.load(Keyword.class, new BigDecimal(keywordId));
        if(aKeyword!=null) {
            aKeyword.setStatus("In Progress");
            session.update(aKeyword);
        }
        t.commit();
        return aKeyword;
    }

    public synchronized Keyword getNextPendingKeyword(Integer projectId) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        Keyword aKeyword = null;
        t.begin();
        BigInteger keywordId = (BigInteger) session.createSQLQuery("Select keyword_id from keywords where status='Pending' and project_id=" + projectId + " order by keyword_id asc").setFirstResult(0).setMaxResults(1).uniqueResult();
//        Keyword aKeyword = (Keyword) session.createQuery("from Keyword kwd where kwd.status='Pending' order by kwd.keywordId asc").setFirstResult(0).setMaxResults(1).uniqueResult();
        if(keywordId != null) {
        	aKeyword = (Keyword) session.load(Keyword.class, new BigDecimal(keywordId));
        	if(aKeyword!=null) {
                aKeyword.setStatus("In Progress");
                session.update(aKeyword);
            }
        }        
        t.commit();
        return aKeyword;
    }
    public BigDecimal saveNewKeyword(Project project, String keyword) {
        Keyword aKeyword = new Keyword();
        aKeyword.setProject(project);
        aKeyword.setKeyword(keyword);
        aKeyword.setStatus("Pending");
        aKeyword.setUrls(null);
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        t.begin();
        BigDecimal id = (BigDecimal) session.save(aKeyword);
        t.commit();
        return id;
    }

    public void updateKeyword(Keyword aKeyword) {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        t.begin();
        session.update(aKeyword);
        t.commit();
    }

    public void updateAndCompleteKeyword(Keyword aKeyword) {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
        aKeyword.setStatus("Complete");
        Transaction t = session.beginTransaction();
        t.begin();
        if(aKeyword.getUrls()!= null) {
            for(Url aUrl:aKeyword.getUrls()) {
                session.save(aUrl);
            }
        }
        session.update(aKeyword);
        t.commit();
    }

    public void setURLsAndCompleteKeyword(Keyword aKeyword, Set<Url> urls ) {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
        aKeyword.setStatus("Complete");
        Transaction t = session.beginTransaction();
        t.begin();
        session.flush();
        if(urls!= null) {
            for(Url aUrl:urls) {
                session.save(aUrl);
            }
        }
        session.saveOrUpdate(aKeyword);
        t.commit();
    }

    public List<BigDecimal> saveAllNewKeywords(Project aProject, List<String> allKeywords) {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        t.begin();
        Keyword aKeyword;
        List<BigDecimal> keywordIds = new ArrayList<BigDecimal>();
        for(String aKeywordPhrase:allKeywords) {
            aKeyword = new Keyword(aProject,aKeywordPhrase,"Pending");
            keywordIds.add((BigDecimal) session.save(aKeyword));
        }
        t.commit();
        return keywordIds;

    }

    public static void main(String args[]) {
        KeywordHelper aKeywordHelper = new KeywordHelper();
        ProjectHelper aProjectHelper = new ProjectHelper();
        Integer projectId = aProjectHelper.saveNewProject("Apple Pay Squareup.com Keywords", "For scraping first 1000 results of squareup.com site - Apple Pay offer in Google US");
        Project aProject = aProjectHelper.getProjectById(projectId);

//        for(Url aUrl:aKeywordHelper.getKeywordById(4).getUrls()) {
//            System.out.println(aUrl.getUrl());
//        }

        //List<String> keywords = TextFileReaderUtils.readLinesAsList("E:/Dropbox/scraping/basic english word list.txt");
        //List<String> pliggFootprints = TextFileReaderUtils.readLinesAsList("E:/Dropbox/scraping/Footprints/pligg footprints.txt");
        //List permutatedKeywords = KeywordUtils.permutateLists(keywords, pliggFootprints, Boolean.TRUE, Boolean.TRUE);
        List<String> keywords = TextFileReaderUtils.readLinesAsList("C:/Users/elangokp.AHC.000/Dropbox/Projects/PPV/Apple Pay/Squareup.com-Keywords.txt", true);
        List<BigDecimal> allID = aKeywordHelper.saveAllNewKeywords(aProject,keywords);
        //System.out.println(allID);
//        aKeywordHelper.getKeywordById(7);
//        System.out.println(aKeywordHelper.getKeywordById(2).getKeyword());
//        aKeywordHelper = new KeywordHelper();
//        System.out.println(aKeywordHelper.getKeywordById(1).getKeyword());
//        System.out.println(aKeywordHelper.getNextPendingKeyword().getKeyword());
//        aKeywordHelper.saveNewKeyword("Aganya");
//        aKeywordHelper.saveNewKeyword("Uma");
//        aKeywordHelper.saveNewKeyword("karthick");
//        aKeywordHelper.saveNewKeyword("Elango");

//        Keyword aKeyword = aKeywordHelper.getNextPendingKeyword();
//        Set<Url> urlSet = new HashSet<Url>();
//        Url aUrl = new Url();
//        aUrl.setUrl("ssghsdh");
//        aUrl.setRank(BigDecimal.ZERO);
//        aUrl.setKeywords(aKeyword);
//        urlSet.add(aUrl);
//        aKeyword.setUrls(urlSet);
//        aKeywordHelper.setURLsAndCompleteKeyword(aKeyword, urlSet);
//        aKeywordHelper.session = HibernateUtil.getSessionFactory().getCurrentSession();
//        Transaction t = aKeywordHelper.session.beginTransaction();
//        t.begin();
//        aKeywordHelper.session.save(aUrl);
//        t.commit();
//        System.out.println(aKeywordHelper.getNextPendingKeyword().getKeyword());
    }

}
