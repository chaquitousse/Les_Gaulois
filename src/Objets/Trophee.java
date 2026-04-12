package Objets;

import Personnages.Gaulois;
import VillageGaulois.Musee;

public class Trophee {
private Gaulois gaulois;
private Equipement equipement;


public Trophee(Gaulois gaulois, Equipement equipement) {
	super();
	this.gaulois = gaulois;
	this.equipement = equipement;
}


public void extraireInstructionsOCaml(Musee musee) {
	System.out.println("let musee = [");
	for (int i =0; i < musee.getNbTrophee(); i++) {
		System.out.println(this.gaulois.getNom()+","+this.equipement.name()+";");
		
	}
	System.out.println("]");
}


public Gaulois getGaulois() {
	return gaulois;
}

public String donnerNom() {
	return gaulois.getNom();
}


public void setGaulois(Gaulois gaulois) {
	this.gaulois = gaulois;
}


public Equipement getEquipement() {
	return equipement;
}


public void setEquipement(Equipement equipement) {
	this.equipement = equipement;
}
}
