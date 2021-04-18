package Entities;

public class Administrateur extends Utilisateur {
	private String Spécialité;
	
	public Administrateur () {
		
	}
	
	public Administrateur( String spécialité) {
		super();
		Spécialité = spécialité;
	}
	public String getSpécialité() {
		return Spécialité;
	}
	public void setSpécialité(String spécialité) {
		Spécialité = spécialité;
	}
	
}



