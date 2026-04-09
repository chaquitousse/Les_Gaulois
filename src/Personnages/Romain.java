package Personnages;

import Objets.Equipement;

public class Romain {
		private String nom;
		private int force;
		private Equipement[] equipement;
		private int nbEquipement ;
		private String texte;
		

	public Romain (String nom, int force, Equipement[] equipement, int nbEquipement) {
		this.nom = nom;
		this.force = force;
		this.nbEquipement = nbEquipement;
		this.setEquipement(new Equipement[2]); 
	}


	
	
//	public void recevoirCoup(int forceCoup) {
//		assert forceCoup > 0;
//		force = force - forceCoup;
//		assert isInvariantVerified(force);
//		if (force > 0) {
//			System.out.println (nom + " : aie");
//		}else { 
//				System.out.println( nom +" : j'abandonne !");
//		}
//	}
	
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		forceCoup = CalculResistanceEquipement(forceCoup);
		if (forceCoup <=0) {
		}else {
		force -= forceCoup;
		}
		switch (force) {
		case 0:
		equipementEjecte = ejecterEquipement();
		parler("J'abandonne...");
		break;
		default:
			parler("Aïe");
			break;
		}
		return equipementEjecte;
		}
	
	private int CalculResistanceEquipement(int forceCoup) {
		System.out.println( "Ma force est de " + this.force + ", et la force du coup est de" + forceCoup);
		int resistanceEquipement = 0;
		if (!(nbEquipement == 0)) {
		System.out.println( "\nMais heureusement, grace à mon équipement sa force");
		for (int i = 0; i < nbEquipement;) {
		if ((equipement[i] != null &&
		equipement[i].equals(Equipement.BOUCLIER)) == true) {
		resistanceEquipement += 6;
		} else {
		resistanceEquipement += 3;
		}
		i++;
		}
		if (resistanceEquipement > forceCoup) {
			System.out.println( " a été complètement absorbée.");
		}else {
		System.out.println(" a été diminué de "+ resistanceEquipement + "!");
		}
		}
		forceCoup -= resistanceEquipement;
		return forceCoup;
		}
		private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom.toString() + " s'envole sous la force du coup.");
		//TODO
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
		if (equipement[i] == null) {
		continue;
		} else {
		equipementEjecte[nbEquipementEjecte] = equipement[i];
		nbEquipementEjecte++;
		equipement[i] = null;
		}
		}
		return equipementEjecte;
		}
		
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	public String prendreParole() {
		String texte = "Le Romain " + this.nom + ":";
		return texte;
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


	public String getTexte() {
		return texte;
	}


	public void setTexte(String texte) {
		this.texte = texte;
	}
}







