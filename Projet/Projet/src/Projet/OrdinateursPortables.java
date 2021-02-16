package Projet;

public class OrdinateursPortables extends PostesClients {
	
	public OrdinateursPortables(String ip, String passerelle, String masque) {
		
		super (ip, passerelle, masque);
	}
	
	private String ip;
	private String passerelle;
	private String masque;
	
	// a activer quand on declenche un bouton ou qq chose
	public String toString() {
		return "Cet ordinateur portable a pour ip : " + getip() + " avec le masque suivant : " + getmasque() + ", a pour passerelle : " + getpasserelle();
	}
}
