package Entities;

public class ServiceIT  extends Utilisateur {
	private  int ID_IT ;
	private String Spécialité;
	
	public String getSpécialité() {
		return Spécialité;
	}
	public void setSpécialité(String spécialité) {
		Spécialité = spécialité;
	}
	public int getID_IT() {
		return ID_IT;
	}
	
	public ServiceIT(int iD_IT, String spécialité) {
		super();
		ID_IT = iD_IT;
		Spécialité = spécialité;
	}
	
}
