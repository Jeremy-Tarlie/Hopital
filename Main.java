package Biblio;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
//	Créez une énumération GenreLivre qui est porteuse de données. Chaque genre de livre doit avoir les propriétés suivantes :
//
//		nom (String) : le nom du genre (par exemple, "Roman").
//		description (String) : une brève description du genre (par exemple, "Fiction narrative").
//		Créez une classe Livre avec les attributs suivants :
//
//		titre (String)
//		auteur (String)
//		genre (GenreLivre)
//		anneeDePublication (int)
//		Créez une classe LivreEmpruntable qui hérite de la classe Livre. Ajoutez un attribut disponible (boolean) pour indiquer si le livre est disponible pour l'emprunt.
//
//		Créez une liste de livres (utilisez ArrayList) et ajoutez-y quelques livres de différents genres, certains empruntables et d'autres non.
//
//		Parcourez la liste et affichez les détails de chaque livre, y compris son genre avec nom et description, ainsi que s'il est empruntable ou non.
	

	public static void main(String[] args) {
		ArrayList<Livre> listLivre = new ArrayList<Livre>();
		
		listLivre.add(new LivreEmpruntable("J'apprend", "khraii", GenreLivre.Roman, 2009, true));
		listLivre.add(new LivreEmpruntable("Java", "Yug", GenreLivre.Roman, 2000, true));
		listLivre.add(new LivreEmpruntable("Akame ga kill", "khraii", GenreLivre.Manga, 2007, true));
		listLivre.add(new LivreEmpruntable("Titeuf", "khraii", GenreLivre.BD, 2023, false));
		
		for(Livre livre : listLivre) {
			System.out.println(livre);
		}
		System.out.println("----------------------------");
		
		
		
		//ancienne méthode
		int totalAnnee = 0;
		int nombreLivre = 0;
		
		for(Livre livre : listLivre) {
			if(livre.getGenre() == GenreLivre.Manga) {
				totalAnnee += livre.getAnneeDePublication();
				nombreLivre++;
			}
		}
		
		double moyenne = totalAnnee/nombreLivre;
		System.out.println(moyenne);
		System.out.println("----------------------------");
		
		
		
		double moyenneTwo = listLivre.stream().filter(livre -> livre.getGenre() == GenreLivre.Manga).mapToInt(livre -> livre.getAnneeDePublication()).average().getAsDouble();
		System.out.println(moyenneTwo);
	}

}
