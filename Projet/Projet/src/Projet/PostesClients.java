package Projet;

public class PostesClients {

	private String ip;
	private String passerelle;
	private String masque;
	
	public PostesClients(String ip, String passerelle, String masque) {
		
		this.ip=ip;
		this.passerelle=passerelle;
		this.masque=masque;	
	}
	
	public String getip() {
		
		return ip;
	}
	
	public void setip (String i) {
		
		ip=i;
	}
	
	public String getpasserelle() {
		
		return passerelle;
	}
	
	public void setpasserelle (String p) {
		
		passerelle=p;
	}
	
	public String getmasque() {
		
		return masque;
	}
	
	public void setmasque (String m) {
		
		masque=m;
	}
}
