package Personnages;

public class Druide {
	private String nom;
	private int force;

	public Druide(String nom, int force) {
		super();
		this.nom = nom;
		this.setForce(force);
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
	
	public void fabriquerPotion () {
		
	}
	
	public void remplirChaudron(int quantite,int forcePotion) {
		parler("J'ai concocté"+ quantite + "potions magiques de force"+forcePotion+".");
		quantite += quantite; 
		
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}
}