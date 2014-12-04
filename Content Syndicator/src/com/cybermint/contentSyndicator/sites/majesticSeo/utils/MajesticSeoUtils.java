/**
 * 
 */
package com.cybermint.contentSyndicator.sites.majesticSeo.utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.pool.impl.GenericObjectPool;

import com.cybermint.contentSyndicator.sites.majesticSeo.formObjects.MajesticSeoLoginFormObject;
import com.cybermint.factories.PoolableListOfObjectsFactory;
import com.cybermint.utils.TextFileReaderUtils;

/**
 * @author aa
 *
 */
public class MajesticSeoUtils {
	
	public static List<MajesticSeoLoginFormObject> getLoginObjects(String loginsFileLocation) {
		List<MajesticSeoLoginFormObject> majesticSeoLoginFormObjects = new ArrayList<MajesticSeoLoginFormObject>();
		List<String> loginsList = TextFileReaderUtils.readLinesAsList(loginsFileLocation, false);
		for(String aLoginString:loginsList) {
			System.out.println(aLoginString);
			String[] aLoginArray = aLoginString.split(",");
			MajesticSeoLoginFormObject aMajesticSeoLoginFormObject = new MajesticSeoLoginFormObject();
			aMajesticSeoLoginFormObject.setEmail(aLoginArray[0]);
			aMajesticSeoLoginFormObject.setPassword(aLoginArray[1]);
			aMajesticSeoLoginFormObject.setRememberMe(true);
			majesticSeoLoginFormObjects.add(aMajesticSeoLoginFormObject);
		}
		return majesticSeoLoginFormObjects;
	}
	
	public static GenericObjectPool getLoginObjectsPool(String loginsFileLocation) {
		List<MajesticSeoLoginFormObject> majesticSeoLoginFormObjects = getLoginObjects(loginsFileLocation);
		for(MajesticSeoLoginFormObject obj:majesticSeoLoginFormObjects) {
			System.out.println(obj.getEmail() + " " + obj.getPassword());
		}
		PoolableListOfObjectsFactory<MajesticSeoLoginFormObject> aPoolableListOfObjectsFactory = new PoolableListOfObjectsFactory<MajesticSeoLoginFormObject>(majesticSeoLoginFormObjects);
		GenericObjectPool genericPool = new GenericObjectPool(aPoolableListOfObjectsFactory);
		genericPool.setLifo(false); //To make it behave a FIFO
		return genericPool;		
	}

}
