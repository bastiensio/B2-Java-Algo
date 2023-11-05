Question 1.2)

l'opérateur "==" ne compare pas le contenue mais la référence des objets, les joueurs ne seront donc pas égales .

Question 1.3)

Le résultat est incorecte cars les 2 joueurs ne sont pas égale
 
Question 1.6)

même chose que pour la 1.2

Question 1.7)

La méthode equals a été surchargé et compare bien que les numero qui sont identique 

Question 1.8)

public int compareTo(Joueur j) {
   if (this.nbVictoires > j.nbVictoires) {
       return 1;
   } else if (this.nbVictoires == j.nbVictoires) {
       return 0;
   } else {
       return -1;
   }
}

Question 1.9)
La methode permet de vérifier lequel a le plus de victoire entre 2 joueurs 

Question 2.2)


System.out.println( "\nListe triée des joueurs :\n" ) ;
			Collections.sort(joueurs, Comparator.comparingInt(Joueur::getNbVictoires));		
			System.out.println( joueurs ) ;
		 // on trie d'abord la liste par odre croissant 
			
		System.out.println( "\nCelui qui a remporté le moins de victoires :\n" );
		System.out.println(joueurs.get(0));
    // puis on prend le premier qui de la liste qui aura le plus petit taux de victoire
    
Question 2.3)

  public static void sort(List<Joueur> joueurs) {
   
    Collections.sort(joueurs, Comparator.comparingInt(Joueur::getNbVictoires));
   
    }


Question 2.5)

AppTrierParNbVictoires :

public class AppTrierParNbVictoires {
  ...
   
     ComparateurNbVictoires comp1 = new ComparateurNbVictoires() ; 
			int comparaison = comp1.compare(joueurs.get(2), joueurs.get(1));
			System.out.println(comparaison);
    }



ComparateurNbVictoires :

public int compare(Joueur o1, Joueur o2) {
		    if (o1.getNbVictoires() > o2.getNbVictoires()) {
		        return 1;
		    } else if (o1.getNbVictoires() == o2.getNbVictoires()) {
		        return 0;
		    } else {
		        return -1;
		    }
		}

Question 3.2)

La méthode Indexof fonctionne pas car elle a besoin de la méthode equals pour fonctionner, une fois que l'on a rajouter cette méthode , la méthode renvoie bien l'indice demander 

question 3.4)

La méthode Indexof ne fonctionne pas car la méthode equals ne marche pas , on la regenère automatiquement et la fonction Indexof foctionne bien
