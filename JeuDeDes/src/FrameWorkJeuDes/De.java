
package FrameWorkJeuDes;
import java.lang.Comparable;
public class De implements Comparable{
    private int[] tabFaces;
  
	//Constructors
	public De() {

	}
	
	public De(int[] tabFaces) {
		// TODO Auto-generated constructor stub
		this.tabFaces=tabFaces.clone();
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	 public int[] getTabFaces() {
			return tabFaces;
	}
	 
	public void setTabFaces(int[] tabFaces) {
			this.tabFaces = tabFaces;
	}
	

}
