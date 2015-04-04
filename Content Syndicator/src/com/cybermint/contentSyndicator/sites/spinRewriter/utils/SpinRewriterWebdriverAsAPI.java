package com.cybermint.contentSyndicator.sites.spinRewriter.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.commons.pool.impl.GenericObjectPool;

import com.cybermint.contentSyndicator.sites.spinRewriter.factories.PoolableSpinRewriterDriverFactory;
import com.cybermint.contentSyndicator.sites.spinRewriter.formObjects.SpinRewriterLoginFormObject;
import com.cybermint.contentSyndicator.sites.spinRewriter.scenarios.GetSpinRewrittenArticle;
import com.cybermint.factories.PoolableListOfObjectsFactory;
import com.cybermint.factories.webdrivers.utils.DriverPoolUtils;

public class SpinRewriterWebdriverAsAPI {

	ThreadPoolExecutor es;
	GenericObjectPool spinRewriterDriverPool;
	
	public SpinRewriterWebdriverAsAPI(String username, String password) {
		SpinRewriterLoginFormObject aSpinRewriterLoginFormObject = new SpinRewriterLoginFormObject(username, password);
		List<SpinRewriterLoginFormObject> spinRewriterLoginFormObjects = new ArrayList<SpinRewriterLoginFormObject> ();
		spinRewriterLoginFormObjects.add(aSpinRewriterLoginFormObject);
		PoolableListOfObjectsFactory<SpinRewriterLoginFormObject> spinRewriterLoginFormObjectsPoolableFactory = new PoolableListOfObjectsFactory<SpinRewriterLoginFormObject>(spinRewriterLoginFormObjects);
		GenericObjectPool spinRewriterLoginFormObjectsPool = new GenericObjectPool(spinRewriterLoginFormObjectsPoolableFactory);
		spinRewriterLoginFormObjectsPool.setLifo(false); //To make it behave a FIFO
		PoolableSpinRewriterDriverFactory aPoolableSpinRewriterDriverFactory = new PoolableSpinRewriterDriverFactory("firefox", spinRewriterLoginFormObjectsPool);
		spinRewriterDriverPool = new GenericObjectPool(aPoolableSpinRewriterDriverFactory);
		spinRewriterDriverPool.setLifo(false); //To make it behave a FIFO
		DriverPoolUtils.initiateObjects(spinRewriterDriverPool, 1);
		es = new ThreadPoolExecutor(2,20,Long.MAX_VALUE,TimeUnit.NANOSECONDS,new LinkedBlockingQueue<Runnable>());
	} 
	
	public String getTextWithSpintax(String givenArticle) {
		Future<Map<String, String>> rewrittenArticleInFuture = es.submit(new GetSpinRewrittenArticle(spinRewriterDriverPool, givenArticle, "No name given"));
		String rewrittenArticle = null;
		try {
			rewrittenArticle = rewrittenArticleInFuture.get().get("No name given");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		return rewrittenArticle;
	}
}
