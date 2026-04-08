package VillageGaulois;

import Personnages.Gaulois;

public class Village {
	
	private String nom; 
	private int nombre_de_villageaois;
	private Gaulois[] villageois;
	private String chef;
	
	

public Village(String nom, int nombre_de_villageaois,String[] villageois,String chef) {
	this.setNom(nom);
	this.setNombre_de_villageaois(nombre_de_villageaois);
	this.villageois = new Gaulois[this.nombre_de_villageaois]; 	
	this.chef= chef;
}



public String getChef() {
	return chef;
}

public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}


public int getNombre_de_villageaois() {
	return nombre_de_villageaois;
}


public void setNombre_de_villageaois(int nombre_de_villageaois) {
	this.nombre_de_villageaois = nombre_de_villageaois;
}

public String getChef( Gaulois chef) {
	return chef.getNom();
}

public void ajouter_villageois(Gaulois nv_villageois, Village village) {
	int ind_placement=0;
	while(village.villageois[ind_placement]!=null) {
		ind_placement+=1;
	}
	villageois[ind_placement]=nv_villageois;
	nv_villageois.setVillage(village);
}

public Gaulois TrouverVillageois(int numero_villageois) {
	if (numero_villageois-1>this.nombre_de_villageaois) {
		System.out.println("Il n’y a pas autant d’habitants dans notre village !");
		return null;
	}else {
		if (this.villageois[numero_villageois-1]!=null) {
		return villageois[numero_villageois-1];
		}
	System.out.println("Il n’y a pas autant d’habitants dans notre village !");
	return null;
	}
}

public Gaulois[] getVillageois() {
	return villageois;
}


public void setVillageois(Gaulois[] villageois) {
	this.villageois = villageois;
}

public void afficherVillageois (Village village) {
	int i = 0;
	System.out.println("Dans le village " +  village.getNom() + " du chef " +  village.getChef() + " vivent les légendaires gaulois : \n");
	while(this.villageois[i]!=null) {
		System.out.println("-" +  villageois[i].getNom() + "\n");
		i+=1;
	} 
}


public static void main(String[] args) {
	String[]tab=new String[30];
	Village village = new Village ( "Village des Irréductibles",30,tab,"Abraracourcix");
	Gaulois Abraracourcix = new Gaulois ("Abraracourcix",6,village);
	
	village.TrouverVillageois(30); 
	
	Gaulois Asterix = new Gaulois ("Astérix",8,null);
	
	village.ajouter_villageois(Asterix, village);
	
	Gaulois gaulois = village.TrouverVillageois(1); 
	System.out.println(gaulois); 
	gaulois = village.TrouverVillageois(2); 
	System.out.println(gaulois); 
	
	Gaulois Obelix = new Gaulois ("Obélix",25,village);
	Gaulois DoublePolemix = new Gaulois ("DoublePolémix",4,null);
	village.ajouter_villageois(Obelix,village);
	village.afficherVillageois(village);
	
	Asterix.sePresenter(Asterix);
	Abraracourcix.sePresenter(Abraracourcix);
	DoublePolemix.sePresenter(DoublePolemix);
	
	
	
	
	
	
	
	
	
}


}