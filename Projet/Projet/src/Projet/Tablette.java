package Projet;

public class Tablette extends PostesClients {
	
	public Tablette(String ip, String passerelle, String masque) {
		
		super (ip, passerelle, masque);
	}
	
	private String ip;
	private String passerelle;
	private String masque;
}
