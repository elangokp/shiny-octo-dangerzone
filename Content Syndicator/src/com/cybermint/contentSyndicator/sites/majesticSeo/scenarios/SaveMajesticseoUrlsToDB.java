/**
 * 
 */
package com.cybermint.contentSyndicator.sites.majesticSeo.scenarios;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import com.cybermint.contentSyndicator.pojo.UrlProperties;
import com.cybermint.serpScraper.domains.helpers.UrlHelper;

/**
 * @author aa
 *
 */
public class SaveMajesticseoUrlsToDB implements Runnable{

	Future<List<UrlProperties>> urlPropertiesList;
	String urlType;
	
	public SaveMajesticseoUrlsToDB(Future<List<UrlProperties>> urlPropertiesList, String urlType) {
		this.urlPropertiesList = urlPropertiesList;
		this.urlType = urlType;
	}
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		try {
			if("url".equalsIgnoreCase(urlType)) {
				UrlHelper.setMajesticseoForUrls(urlPropertiesList.get());
			} else if("domain".equalsIgnoreCase(urlType)) {
				UrlHelper.setMajesticseoForDomains(urlPropertiesList.get());
			}			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}		
	}

}
