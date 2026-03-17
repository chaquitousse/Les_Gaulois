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
	
	
	
}
