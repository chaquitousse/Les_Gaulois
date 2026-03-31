package Personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.setEffetPotion(1);
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
		Gaulois asterix;
		asterix = new Gaulois("Astérix", 8);
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
}