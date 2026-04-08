package Personnages;

import Objets.Equipement;

public class Romain {
		private String nom;
		private int force;
		private Equipement[] equipement;
		private int nbEquipement ;
		
	

	public Romain (String nom, int force, Equipement[] equipement, int nbEquipement) {
		this.nom = nom;
		this.force = force;
		this.nbEquipement = nbEquipement;
		this.setEquipement(new Equipement[2]); 
	}


	private boolean isInvariantVerified ( int ForceRomain) {
	if (ForceRomain<0) {
		return false;
	}
		return true;
	}
	
	public void recevoirCoup(int forceCoup) {
		assert forceCoup > 0;
		force = force - forceCoup;
		assert isInvariantVerified(force);
		if (force > 0) {
			System.out.println (nom + " : aie");
		}else { 
				System.out.println( nom +" : j'abandonne !");
		}
		
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole(texte) + "\"" + texte + "\"");
	}

	public String prendreParole(String string) {
		return (" Le Romain " + nom + " : " );
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}
	
	public void sEquiper(Equipement Equipement) {
		switch(this.nbEquipement) {
		case 2 :
			System.out.println("Le soldat " +  this.nom +" est déjà bien protégé ! ");
			break;
		case 1 :
			if (equipement[0]==Equipement) {
				System.out.println("Le soldat " + this.nom +" possède déjà un " + Equipement +" ! ");
			}
			else {
				System.out.println("Le soldat " +this.nom+" s’équipe avec un "+ Equipement +".");
				equipement[1]=Equipement;
				nbEquipement+=1;
			}
			break;
		default :
			System.out.println("Le soldat " +this.nom+" s’équipe avec un "+ Equipement +".");
			equipement[0]=Equipement;
			nbEquipement+=1;
			break;
			
		}
	}
	
	public static void main(String[] args) {
		Equipement equipement[] = new Equipement[10];
		Romain Minus =new Romain ("Minus",6,equipement,0);
		Minus.parler("Je suis tout nul.");
		Minus.sEquiper(Equipement.CASQUE);
		Minus.sEquiper(Equipement.CASQUE);
		Minus.sEquiper(Equipement.BOUCLIER);
		Minus.sEquiper(Equipement.CASQUE);
}


	public Equipement[] getEquipement() {
		return equipement;
	}



	public void setEquipement(Equipement[] equipement) {
		this.equipement = equipement;
	}



	public String getNom() {
		return nom;
	}
}







