package Personages;

public class Romain {
	private String nom;
	private int force;
	private Object ;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup, int force) {

		self.force = self.force - forceCoup;
		if (self.force > 0) {
			System.out.println (nom + " : aie");
		}else { 
				System.out.println( nom +" : j'abandonne !");
		}
		
	}
}