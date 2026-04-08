package Personnages;

public class Romain extends Personnage {
	public Romain(String nom, int force) {
		super();
		this.nom = nom;
		this.setForce(force);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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