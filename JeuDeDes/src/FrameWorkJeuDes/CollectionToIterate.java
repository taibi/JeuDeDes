package FrameWorkJeuDes;

import java.util.Iterator;

/**
 * collection interface
 * @param <E>
 *
 */
public interface CollectionToIterate<E> {
	Iterator<Comparable> createIterator();   
	
}
