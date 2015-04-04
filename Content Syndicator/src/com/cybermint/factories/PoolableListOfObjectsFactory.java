/**
 * 
 */
package com.cybermint.factories;

import java.util.List;

import org.apache.commons.pool.BasePoolableObjectFactory;

import com.cybermint.utils.CyclicIterator;

/**
 * @author aa
 *
 */
public class PoolableListOfObjectsFactory<T> extends BasePoolableObjectFactory {

	protected List<T> listOfObjects;
	protected CyclicIterator<T> cyclicObjectsIterator;
	
	public PoolableListOfObjectsFactory(List<T> listOfObjects) {
		this.listOfObjects = listOfObjects;
		this.cyclicObjectsIterator = new CyclicIterator<T> (this.listOfObjects);
	}
	/* (non-Javadoc)
	 * @see org.apache.commons.pool.BasePoolableObjectFactory#makeObject()
	 */
	@Override
	public Object makeObject() throws Exception {
		Object anObject = null;
		if(cyclicObjectsIterator.hasNext()) {
			anObject = cyclicObjectsIterator.next();
		}
		return anObject;
	}

}
