package Entities;

public class ServiceCommercial extends Utilisateur {
	private  int ID_Com;
	private String Spécialité;
	
	public ServiceCommercial () {

	}
	
	public String getSpécialité() {
		return Spécialité;
	}
	public void setSpécialité(String spécialité) {
		Spécialité = spécialité;
	}
	public int getID_Com() {
		return ID_Com;
	}

}
