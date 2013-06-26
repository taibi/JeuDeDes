package FrameWorkJeuDes;


import java.util.ArrayList;
import java.util.Iterator;

public class CollectionJoueurs implements CollectionToIterate {
	private ArrayList<Comparable> listeJoueurs ; // list of menu items

	public CollectionJoueurs() {
		// TODO Auto-generated constructor stub
		listeJoueurs = new ArrayList<Comparable>() ;
	}
	

	
	public ArrayList<Comparable> getElements(){
		return listeJoueurs;
		}
	
	/**
	 * Add an item
	 * @param name item's name
	 * @param description description
	 * @param vegetarian if the item is vegetarian
	 * @param price item's price
	 */
	public void addElement(Joueur unJoueur){
		listeJoueurs.add(unJoueur) ;
	}
    
	public void remove(int index){
		listeJoueurs.remove(index);
	}
	  @Override

	   public Iterator<Comparable> createIterator() {
		// TODO Auto-generated method stub
		   return listeJoueurs.iterator();
	   }
	
}

