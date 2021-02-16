package Projet;

public class OrdinateursFixes extends PostesClients {
	
	public OrdinateursFixes(String ip, String passerelle, String masque) {
		
		super (ip, passerelle, masque);
	}
	
	public String toString() {
		return "Cet ordinateur fixe a pour ip : " + getip() + " avec le masque suivant : " + getmasque() + ", a pour passerelle : " + getpasserelle();
}
