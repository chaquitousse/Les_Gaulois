package Personnages;

import VillageGaulois.Village;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion;
	private Village Village;

	public Gaulois(String nom, int force, VillageGaulois.Village village) {
		this.nom = nom;
		this.force = force;
		this.setEffetPotion(1);
		this.Village=null;
	}

	

	public void setNom(String nom) {
		this.nom = nom;
	}

	

	public String getNom() {
		return nom;
	}
	
	public void frapper(Romain romain) {
		System.out.println( nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		this.force=this.force * this.effetPotion;
		romain.recevoirCoup(force / 3);
		if (this.effetPotion>1) {
		this.effetPotion-=1;
	}
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole(texte) + "\"" + texte + "\"");
	}

	public String prendreParole(String string) {
		return (" Le gaulois " + nom + " : ");
	}

	public static void main(String[] args) {
		String[]tab=new String[30];
		Village village = new Village ( "Village des Irréductibles",30,tab,"Abraracourcix");
		Gaulois asterix;

		asterix = new Gaulois("Astérix",6,village);
		System.out.println(asterix);

	}

	public String toString() {
		return nom;
	}

	public int getEffetPotion() {
		return effetPotion;
	}

	public void setEffetPotion(int effetPotion) {
		this.effetPotion = effetPotion;
	}
	
	
	public void boirePotion(int forcePotion) {
		this.effetPotion=forcePotion;
	}
	
	
	




	public Village getVillage() {
		return Village;
	}



	public void setVillage(Village village) {
		Village = village;
	}
	
	
	public void sePresenter(Gaulois gaulois) {
		System.out.println("Bonjour, je m'appelle "+gaulois.getNom()+".");
		
	}
}