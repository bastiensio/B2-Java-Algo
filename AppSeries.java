package dk.ns.series;

import java.util.ArrayList;
import java.util.List;

public class AppSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	         List<Acteur> listeActeur = new ArrayList<Acteur>() ;

	         listeActeur.add( new Acteur("BRAAS" , "Bastien" ) ) ;
	         listeActeur.add( new Acteur("VICENTE" , "Téo" ) ) ;
	         listeActeur.add( new Acteur("FERT" , "Timoté" ) ) ;
	         listeActeur.add( new Acteur("DARBOE" , "Ali" ) ) ;
	         listeActeur.add( new Acteur("LUCINA" , "Mathis" ) ) ;
	         listeActeur.add( new Acteur("GAMBO" , "Adam" ) ) ;
	         listeActeur.add( new Acteur("SIF" , "Mohamed" ) ) ;


	         System.out.println( "\nListe des acteurs :\n" ) ;
	            for( Acteur acteur : listeActeur ) {
	                System.out.println( acteur ) ;
	            }

	            List<Episode> episode = new ArrayList<>();

	            episode.add(new Episode("Episode 1", 1, 60));
	            episode.add(new Episode("Episode 2", 2, 55));
	            episode.add(new Episode("Episode 3", 3, 57));
	            
	            for( Episode episode1 : episode ) {
	                System.out.println( episode1 ) ;
	            }
				
	            List<Saison> saisons = new ArrayList<>();
				
				
				saisons.add(new Saison(episode.get(0), 1, 2022));
				saisons.add(new Saison(episode.get(0), 2, 2023));
				saisons.add(new Saison(episode.get(2), 3, 2024));
				
				for( Saison saison1 : saisons ) {
	                System.out.println( saison1 ) ;
	            }
}
}