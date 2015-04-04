package com.cybermint.contentSyndicator.sites.spinRewriter.scenarios;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.commons.pool.ObjectPool;
import org.apache.commons.pool.impl.GenericObjectPool;
import org.openqa.selenium.WebDriver;

import com.cybermint.contentSyndicator.sites.majesticSeo.formObjects.MajesticSeoLoginFormObject;
import com.cybermint.contentSyndicator.sites.spinRewriter.factories.PoolableSpinRewriterDriverFactory;
import com.cybermint.contentSyndicator.sites.spinRewriter.formObjects.SpinRewriterLoginFormObject;
import com.cybermint.contentSyndicator.sites.spinRewriter.pages.SpinRewriterControlPanel;
import com.cybermint.contentSyndicator.sites.spinRewriter.pages.SpinRewriterEditRewritePage;
import com.cybermint.contentSyndicator.sites.spinRewriter.pages.SpinRewriterFinishedRewritePage;
import com.cybermint.contentSyndicator.sites.spinRewriter.pages.SpinRewriterStartRewritePage;
import com.cybermint.factories.PoolableListOfObjectsFactory;
import com.cybermint.factories.webdrivers.utils.DriverPoolUtils;
import com.cybermint.utils.TextFileFilter;
import com.cybermint.utils.TextFileReaderUtils;
import com.cybermint.utils.TextFileWriterUtils;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;

public class GetSpinRewrittenArticle implements Callable<Map<String,String>> {

	private ObjectPool driverPool;
	private String givenArticle;
	private String articleName;
	
	public GetSpinRewrittenArticle(ObjectPool driverPool, String givenArticle, String articleName) {
		this.driverPool = driverPool;
		this.givenArticle = givenArticle;
		this.articleName = articleName;
	}
	
	@Override
	public Map<String,String> call() throws Exception {
		Map<String,String> rewrittenArticleMap = new HashMap<String, String> ();
		WebDriver driver = null;
		try {
			driver = (WebDriver) driverPool.borrowObject();
			SpinRewriterControlPanel aSpinRewriterControlPanel = new SpinRewriterControlPanel(driver);
			SpinRewriterStartRewritePage aSpinRewriterStartRewritePage = aSpinRewriterControlPanel.goToRewritePage();
			SpinRewriterEditRewritePage aSpinRewriterEditRewritePage = aSpinRewriterStartRewritePage.startRewrite(givenArticle);
			SpinRewriterFinishedRewritePage aSpinRewriterFinishedRewritePage = aSpinRewriterEditRewritePage.startOneClickRewrite();
			rewrittenArticleMap.put(articleName, aSpinRewriterFinishedRewritePage.getRewrittenArticle());
		} catch (Exception e) {
			driverPool.invalidateObject(driver);
			e.printStackTrace();
		} finally {
			driverPool.returnObject(driver);
		}
		return rewrittenArticleMap;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpinRewriterLoginFormObject aSpinRewriterLoginFormObject = new SpinRewriterLoginFormObject("pelangs@gmail.com", "123spinrewriter!@#");
		List<SpinRewriterLoginFormObject> spinRewriterLoginFormObjects = new ArrayList<SpinRewriterLoginFormObject> ();
		spinRewriterLoginFormObjects.add(aSpinRewriterLoginFormObject);
		PoolableListOfObjectsFactory<SpinRewriterLoginFormObject> spinRewriterLoginFormObjectsPoolableFactory = new PoolableListOfObjectsFactory<SpinRewriterLoginFormObject>(spinRewriterLoginFormObjects);
		GenericObjectPool spinRewriterLoginFormObjectsPool = new GenericObjectPool(spinRewriterLoginFormObjectsPoolableFactory);
		spinRewriterLoginFormObjectsPool.setLifo(false); //To make it behave a FIFO
		PoolableSpinRewriterDriverFactory aPoolableSpinRewriterDriverFactory = new PoolableSpinRewriterDriverFactory("firefox", spinRewriterLoginFormObjectsPool);
		GenericObjectPool spinRewriterDriverPool = new GenericObjectPool(aPoolableSpinRewriterDriverFactory);
		spinRewriterDriverPool.setLifo(false); //To make it behave a FIFO
		DriverPoolUtils.initiateObjects(spinRewriterDriverPool, 1);
		//ThreadPoolExecutor es = new ThreadPoolExecutor(2,20,Long.MAX_VALUE,TimeUnit.NANOSECONDS,new LinkedBlockingQueue<Runnable>());
		ListeningExecutorService service = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(1));
		File articlesFolder = new File("G:/Scraped Articles In Cycles/01.Cure Tinnitus/Cycle 5");
		for(File anArticleFile : articlesFolder.listFiles(new TextFileFilter())) {
			String text = TextFileReaderUtils.readFileAsString(anArticleFile.getPath());
			ListenableFuture<Map<String,String>> rewrittenArticleMapFuture = service.submit(new GetSpinRewrittenArticle(spinRewriterDriverPool, text, anArticleFile.getName()));
			Futures.addCallback(rewrittenArticleMapFuture,
					new FutureCallback<Map<String,String>>() {
						public void onSuccess(Map<String,String> rewrittenArticleMap) {
							String articleName = null;
							String reWrittenArticle = null;
							for(Entry anReWrittenArticleEntry : rewrittenArticleMap.entrySet()) {
								articleName = (String) anReWrittenArticleEntry.getKey();
								reWrittenArticle = (String) anReWrittenArticleEntry.getValue();
							}
								try {
									TextFileWriterUtils atextFileWriter = new TextFileWriterUtils("G:/Google Drive/Scraped Articles/Scraped Articles In Cycles Spun/01.Cure Tinnitus/Cycle 5/" + articleName + " [spun].txt");
									atextFileWriter.writeContentToFile(reWrittenArticle);
									atextFileWriter.closeWriter();
									} catch (IOException e) {
										e.printStackTrace();
									}
						}

						public void onFailure(Throwable thrown) {
							thrown.printStackTrace();
						}
					});
		}
	}

	

}
