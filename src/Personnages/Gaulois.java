package Personnages;

public class Gaulois {
	private String nom;
	private int force;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void frapper(Romain romain) {
		System.out.println( nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force / 3,force);
	}

	public void parler(String texte) {
		System.out.println(prendreParole(texte) + "\"" + texte + "\"");
	}

	public String prendreParole(String string) {
		return "Le gaulois " + nom + " : ";
	}

	public static void main(String[] args) {
		Gaulois asterix;
		asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix);

	}

	@Override
	public String toString() {
		return nom;
	}
}