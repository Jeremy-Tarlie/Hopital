package Biblio;

public enum GenreLivre {
	Roman("Roman","c'est un roman"), Manga("Manga", "pour les fans d'animé"), BD("BD","c'est une bd");
	
	private String type;
	private String desc;
	
	GenreLivre(String type, String desc){
		this.type = type;
		this.desc = desc;
	}
	
	public String getType() {
		return type;
	}
	
	public String getDesc() {
		return desc;
	}
}
