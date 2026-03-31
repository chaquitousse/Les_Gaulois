package Personnages;
import Objets.Chaudron;
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
	
	public void fabriquerPotion (int quantite, int forcePotion, Chaudron chaudron) {
		chaudron.remplirChaudron(quantite,forcePotion);
		parler("J'ai concocté"+ quantite + "potions magiques de force"+forcePotion+".");
		quantite += quantite;
	}
	
	public void booster(Gaulois gaulois, Chaudron chaudron) {
		if (chaudron.resterPotion(chaudron.quantitePotion) == false) {
			parler("Désolé"+gaulois.getNom()+"il n'y a plus un goutte de potion magique pour toi.");
		}else {
			if (gaulois.getNom()=="Obélix" ) {
				parler("NON"+gaulois.getNom()+"non ! ... Et tu le sais très bien !");
			}else {
				chaudron.prendreLouche();
				gaulois.boirePotion(chaudron.getForcePotion());
				parler("Tiens "+gaulois.getNom()+" un peu de potion magique.");
			}
		}
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}
}