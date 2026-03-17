package Personages;

import Objets.Chaudron;

public class Druide {
	private String nom;
	private int force;

	public Druide(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole(texte) + "\"" + texte + "\"");
	}

	public String prendreParole(String string) {
		return "Le druide " + nom + " : ";
	}
	
	public void fabriquerPotion (quan) {
		
	}
	
	public void remplirChaudron(int quantite,int forcePotion) {
		parler("J'ai concocté"+ quantite + "potions magiques de force"+forcePotion+".");
		Chaudron.quantitePotion += quantite; 
		
	}
}