package Biblio;

public class LivreEmpruntable extends Livre {
	public boolean disponible;

	public LivreEmpruntable(String titre, String auteur, GenreLivre genre, int anneeDePublication, boolean disponible) {
		super(titre, auteur, genre, anneeDePublication);
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return ", disponible :" + (disponible ? "oui" : "non");
	}
}
