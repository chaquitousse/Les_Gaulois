package TestFonctionnel;

import Objets.Chaudron;
import Personnages.Druide;
import Personnages.Gaulois;
import Personnages.Romain;
import VillageGaulois.Village;

public class TestGaulois {
	
	
	public static void main(String[] args) {
		
		String[] villageois = new String[5]; 
		Village village = new Village("village",2,villageois ,"a");
		Gaulois asterix = new Gaulois ("Astérix",6,village);
		
		Gaulois obelix = new Gaulois ("Obélix",16,village);
		
		asterix.parler("Bonjour Obélix");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée.");
		
		Romain minus = new Romain("Minus",6,null,0);
		
		System.out.println(" Dans la forêt " + asterix.getNom() +" et " + obelix.getNom() + " tombent nez à nez sur le romain " + minus.getNom());
		
		for ( int i =0; i<3; i++) {
			asterix.frapper(minus);
		}
		
		Romain brutus = new Romain("Brutus",14,null,0);
		Druide panoramix = new Druide ("Panoramix",2);
		Chaudron chaudron = new Chaudron (0,0);
		
		panoramix.fabriquerPotion(4,3,chaudron);
		panoramix.booster(obelix, chaudron);
		panoramix.booster(asterix, chaudron);
		
		
		for ( int i =0; i<3; i++) {
			asterix.frapper(brutus);
		}
	}
}