package TestFonctionnel;

import Personnages.Gaulois;
import Personnages.Romain;

public class TestGaulois {
	
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois ("Astérix",8);
		
		Gaulois obelix = new Gaulois ("Obélix",16);
		
		asterix.prendreParole("Bonjour Obélix");
		obelix.prendreParole("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.prendreParole("Oui très bonne idée.");
		
		Romain minus = new Romain("Minus",6);
		
		System.out.println("Dans la forêt" + asterix.getNom() +" et " + obelix.getNom() + "tombent nez à nez sur le romain" + minus.getNom());
		
		for ( int i =0; i<3; i++) {
			asterix.frapper(minus);
		}
		
		
	}
}