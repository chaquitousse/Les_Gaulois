package VillageGaulois;

import Objets.Equipement;
import Objets.Trophee;
import Personnages.Gaulois;

public class Musee {
	private Trophee[] trophees = new Trophee[200];
	private int nbTrophee;
	
	
	public void DonnerTrophees(Gaulois donnateur, Equipement don) {
		Trophee tresor = new Trophee(donnateur,don);
		nbTrophee+=1;
		trophees[nbTrophee]= tresor ;
	}
}
