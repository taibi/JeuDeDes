package FrameWorkJeuDes;
import java.lang.Comparable;
public class Joueur implements Comparable {
    final String nomJoueur;
	final int numJoueur;
	public Joueur() {
		// TODO Auto-generated constructor stub
		this.nomJoueur= null;
		this.numJoueur=0;
	}
	public Joueur(String nomJoueur, int numJoueur) {
		// TODO Auto-generated constructor stub
		this.nomJoueur= nomJoueur;
		this.numJoueur=numJoueur;
		
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	 public String getNomJoueur() {
			return nomJoueur;
	}
		public int getNumJoueur() {
			return numJoueur;
	}


}
