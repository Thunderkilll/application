package Entities;

public class Client extends Utilisateur {
private String Spécialité;
	

	public Client(String spécialité) {
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
