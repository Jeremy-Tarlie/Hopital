package Biblio;

public class Livre {
	private String titre;
	private String auteur;
	private GenreLivre genre;
	private int anneeDePublication;
	

	public Livre(String titre, String auteur, GenreLivre genre, int anneeDePublication) {
		this.titre = titre;
		this.auteur = auteur;
		this.genre = genre;
		this.anneeDePublication = anneeDePublication;

	}

	public String getTitre() {
		return titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public GenreLivre getGenre() {
		return genre;
	}

	public int getAnneeDePublication() {
		return anneeDePublication;
	}

	@Override
	public String toString() {
		return "titre :" + titre + ", auteur :" + auteur + ", genre :" + genre + ", anneeDePublication : "
				+ anneeDePublication;
	}
}
