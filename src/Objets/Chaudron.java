package Objets;

public class Chaudron {
	public int quantitePotion;
	private int forcePotion;
	
	
	public Chaudron(int quantitePotion, int forcePotion) {
		super();
		this.quantitePotion = quantitePotion;
		this.setForcePotion(forcePotion);
	}
	
	public Boolean resterPotion(int quantitePotion) {
		if (quantitePotion == 0) {
			return false;
			
		}else {
			return true;
		}
	}

	public int getForcePotion() {
		return forcePotion;
	}

	public void setForcePotion(int forcePotion) {
		this.forcePotion = forcePotion;
	}
	
	public void remplirChaudron(int quantite,int forcePotion) {
		 this.quantitePotion+=quantite;
		 this.forcePotion = forcePotion;
	}
	
	public void prendreLouche() {
		if (this.quantitePotion-1==0) {
			this.forcePotion=0;
		}else {
		this.quantitePotion-=1;
		
	}
	}
}
