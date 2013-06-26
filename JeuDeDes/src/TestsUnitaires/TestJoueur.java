package TestsUnitaires;

import FrameWorkJeuDes.De;
import FrameWorkJeuDes.Joueur;



public class TestJoueur extends junit.framework.TestCase{
	
	public static void main(String Args){
		junit.textui.TestRunner.run(TestJoueur.class);
	}
	
	public 	TestJoueur(String name){
		super(name);
	}
     
	public void testCreerDe(){
		Joueur unJoueur1 = new Joueur("rayane",3);
		assertNotNull("le de ne doit pas être nul",unJoueur1);
		assertEquals("le numéro de joueur est incorrect",3, unJoueur1.getNumJoueur());
		assertEquals("le nom de joueur est incorrect","rayane", unJoueur1.getNomJoueur());
	}
	



}