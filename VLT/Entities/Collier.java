package Entities;

public class Collier {
	private int ID_Collier;
	private int ID_Vache;
	private Float Température;
	private Float Pulsation;
	private Localisation Position ;
	
	 public Collier() {
			
		}

	
	public Collier(int iD_Collier, int iD_Vache, Float température, Float pulsation, Float fréquence_Cardiaque,
			Localisation position) {
		super();
		ID_Collier = iD_Collier;
		ID_Vache = iD_Vache;
		Température = température;
		Pulsation = pulsation;
		Position = position;
	}
	public int getID_Collier() {
		return ID_Collier;
	}
	public void setID_Collier(int iD_Collier) {
		ID_Collier = iD_Collier;
	}
	public int getID_Vache() {
		return ID_Vache;
	}
	public void setID_Vache(int iD_Vache) {
		ID_Vache = iD_Vache;
	}
	public Float getTempérature() {
		return Température;
	}
	public void setTempérature(Float température) {
		Température = température;
	}
	public Float getPulsation() {
		return Pulsation;
	}
	public void setPulsation(Float pulsation) {
		Pulsation = pulsation;
	
	}
	public Localisation getPosition() {
		return Position;
	}
	public void setPosition(Localisation position) {
		Position = position;
	}

   	

}
