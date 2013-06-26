
package TestsUnitaires;

import java.util.ArrayList;
import java.util.List;

import FrameWorkJeuDes.CollectionJoueurs;
import FrameWorkJeuDes.Joueur;


public class TestCollectionJoueurs extends junit.framework.TestCase{
	
	public static void main(String Args){
		junit.textui.TestRunner.run(TestCollectionJoueurs.class);
		
	}
	
	public 	TestCollectionJoueurs(String name){
		super(name);
	}
     
	public void testCreerCollectionJoueurs(){
		CollectionJoueurs maColLectionJoueurs= new CollectionJoueurs();
		Joueur unJoueur1 = new Joueur("khachani",1);
		maColLectionJoueurs.addElement(unJoueur1) ;  
		Joueur unJoueur2 = new Joueur("taibi",2);
		maColLectionJoueurs.addElement(unJoueur2) ; 
		Joueur unJoueur3 = new Joueur("rayane",3);
		maColLectionJoueurs.addElement(unJoueur3) ; 
		assertNotNull("la collection ne doit pas être nul",maColLectionJoueurs);
		assertEquals("le nombre  de joueurs est incorrect",3, maColLectionJoueurs.getElements().size());
		
	}
	public void testSupprimerJoueurs(){
		
		CollectionJoueurs maColLectionJoueur= new CollectionJoueurs();
		Joueur unJoueur1 = new Joueur("khachani",1);
		maColLectionJoueur.addElement(unJoueur1) ;  
		Joueur unJoueur2 = new Joueur("taibi",2);
		maColLectionJoueur.addElement(unJoueur2) ; 
		Joueur unJoueur3 = new Joueur("rayane",3);
		maColLectionJoueur.addElement(unJoueur3) ; 
		maColLectionJoueur.remove(1);
		assertNotNull("la collection ne doit pas être nul",maColLectionJoueur);
		assertEquals("le nombre  de joueurs est incorrect",2, maColLectionJoueur.getElements().size());
		}
	
	
	
	
	
	
	
}
