
package TestsUnitaires;

import java.util.ArrayList;
import java.util.List;

import FrameWorkJeuDes.CollectionDes;
import FrameWorkJeuDes.De;

public class TestCollectionDes extends junit.framework.TestCase{
	
	public static void main(String Args){
		junit.textui.TestRunner.run(TestCollectionDes.class);
		
	}
	
	public 	TestCollectionDes(String name){
		super(name);
	}
     
	public void testCreerCollectionDes(){
		CollectionDes maColLectionDes = new CollectionDes();
		int[] t1=  {1,4,6,8};
		De unDe1 = new De(t1);
		maColLectionDes.addElement(unDe1) ;
		
		assertNotNull("la collection ne doit pas être nulle",maColLectionDes);
		assertEquals("le nombre  de des est incorrect",1, maColLectionDes.getNbrOfElement());
	}
	public void testSupprimerJoueurs(){
		CollectionDes maColLectionDes = new CollectionDes();
		int[] t1=  {1,4,6,8};
		De unDe1 = new De(t1);
		maColLectionDes.addElement(unDe1) ;
		maColLectionDes.remove(1);
		assertNotNull("la collection ne doit pas être nulle",maColLectionDes);
		assertEquals("le nombre  de des est incorrect",0, maColLectionDes.getNbrOfElement());
		}
	
	
	
}
