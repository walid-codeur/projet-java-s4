package Projet;

public class Téléphones extends PostesClients {

	public Téléphones(String ip, String passerelle, String masque) {
		
		super (ip, passerelle, masque);
	}
	
	private String ip;
	private String passerelle;
	private String masque;
}
