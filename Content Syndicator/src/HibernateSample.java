
import com.cybermint.serpScraper.domains.Keyword;
import com.cybermint.serpScraper.domains.Url;
import com.cybermint.serpScraper.hibernate.HibernateUtil;
import java.util.ArrayList;
import org.hibernate.Session;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 309680
 */
public class HibernateSample {

    public static void main(String args[]) {

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        ArrayList<Keyword> keywords = (ArrayList<Keyword>) session.createQuery("from Keyword").list();
        for(Keyword aKeyword:keywords) {
            System.out.println(aKeyword.getKeywordId() + ". " + aKeyword.getKeyword() + " - " + aKeyword.getStatus());
            for(Url aUrl:aKeyword.getUrls()) {
                System.out.println("\t" + aUrl.getRank() + ". " + aUrl.getUrl());
            }
        }

    }
}
