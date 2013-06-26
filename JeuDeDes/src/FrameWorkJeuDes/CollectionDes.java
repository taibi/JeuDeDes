package FrameWorkJeuDes;


import java.util.Iterator;

public class CollectionDes implements CollectionToIterate {
	public static final int MAX_DES = 10; // Maximum de des
	private int nombreDeDes = 0; // number of items
    private Comparable[] tabDes; 
	
	public CollectionDes() {
		// TODO Auto-generated constructor stub
		tabDes = new De[MAX_DES];
	}

	
	/**
	 * @return nombre de De
	 */
	public int getLength(){
		return tabDes.length;
	}
	
	/**
	 * Retourne un mot de la collection
	 * @param index index du mot
	 * @return le mot à l'index spécifié
	 */
	public De get(int index){
		return (De) tabDes[index];
	}
	
	
	
	@Override
	public Iterator<Comparable> createIterator() {
		// TODO Auto-generated method stub
		return new ArrayIterator<Comparable>(tabDes);
	}
	 public Comparable[] getElements(){return tabDes;}
	   
	   /**
		 * Add an item
		 * @param name item's name
		 * @param description description
		 * @param vegetarian if the item is vegetarian
		 * @param price item's price
		 */
	   public void addElement(De unDe) throws ArrayIndexOutOfBoundsException {
		   tabDes[nombreDeDes] = unDe;
		   nombreDeDes = nombreDeDes + 1; 
	   } 
	   
	   
	   public int getNbrOfElement() {
		  return nombreDeDes ; 
	   }
	public void remove(int index){
		Comparable[] newtabDes = new De[tabDes.length-1];
		for(int i=0, z=0; i<tabDes.length;++i){
			if(i!=index){
				newtabDes[z++] = tabDes[i];
			}
		}
		tabDes = newtabDes;
		  nombreDeDes = nombreDeDes - 1; 
	}
}
