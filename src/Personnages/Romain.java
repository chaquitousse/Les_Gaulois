package Personnages;

public class Romain {
	private String nom;
	private int force; 


	public Romain(String nom, int force) {
		this.nom = nom;
		this.setForce(force);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
	
	public void recevoirCoup(int forceCoup) {

		force = force - forceCoup;
		if (force > 0) {
			System.out.println (nom + " : aie");
		}else { 
				System.out.println( nom +" : j'abandonne !");
		}
		
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}
}