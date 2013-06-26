package FrameWorkJeuDes;
import java.util.Iterator;

/**
 * An Iterator of a CollectionDeDES
 *
 */

public class ArrayIterator<T> implements Iterator<T> {
   private T[] items; // list of items 
   private int position = 0; // position of the iterator in the list
   
   /**
    * Constructor
    * @param items the list of items
    */
   public ArrayIterator(T[] items) {
	   this.items = items;
   }
   
   /**
    * Return the next item and increment the position of the iterator
    * @return the next item
    */
   public T next() {
      T item = items[position];
      position = position + 1;
      return item;
   }
   
   /**
    * @return if there is a next item
    */
   public boolean hasNext() {
      if (position >= items.length || items[position] == null) {
         return false;
      } else {
      return true;
      }
   }

   @Override
   public void remove() {
	// TODO Auto-generated method stub
	throw new UnsupportedOperationException();
   }
   
   
}