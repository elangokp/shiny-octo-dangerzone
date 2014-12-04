package com.cybermint.factories.webdrivers.utils;

import org.apache.commons.pool.impl.GenericObjectPool;

public class DriverPoolUtils {

	public static void initiateObjects(GenericObjectPool aPool, Integer noOfObjectsToInitiate) {
		int i = 0;
		while(i<noOfObjectsToInitiate) {
			try {
				aPool.addObject();
				Thread.sleep(50000);
				i++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
