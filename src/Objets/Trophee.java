package Objets;

import Personnages.Gaulois;

public class Trophee {
private Gaulois gaulois;
private Equipement equipement;


public Trophee(Gaulois gaulois, Equipement equipement) {
	super();
	this.gaulois = gaulois;
	this.equipement = equipement;
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
