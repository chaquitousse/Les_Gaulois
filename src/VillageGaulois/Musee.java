package VillageGaulois;

import Objets.Equipement;
import Objets.Trophee;
import Personnages.Gaulois;

public class Musee {
	private Trophee[] trophees = new Trophee[200];
	private int nbTrophee;
	
	
	public void DonnerTrophees(Gaulois donnateur, Equipement don) {
		Trophee tresor = new Trophee(donnateur,don);
		setNbTrophee(getNbTrophee() + 1);
		trophees[getNbTrophee()]= tresor ;
	}


	public int getNbTrophee() {
		return nbTrophee;
	}


	public void setNbTrophee(int nbTrophee) {
		this.nbTrophee = nbTrophee;
	}


	
	
	

}
