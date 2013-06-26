package TestsUnitaires;

import FrameWorkJeuDes.De;



public class TestDe extends junit.framework.TestCase{
	
	public static void main(String Args){
		junit.textui.TestRunner.run(TestDe.class);
		
	}
	
	public 	TestDe(String name){
		super(name);
	}
     
	public void testCreerDe(){
		
		int[] t1=  {1,4,6,8,8,9,4,5,9,7,7};
		De unDe1 = new De(t1);
		assertNotNull("le de ne doit pas être nul",unDe1.getTabFaces());
		assertEquals("le nombre de faces est mal calculé",11, unDe1.getTabFaces().length);
		assertEquals("la valeur  de la face est incorrecte",7, unDe1.getTabFaces()[10]);
	}
	



}
