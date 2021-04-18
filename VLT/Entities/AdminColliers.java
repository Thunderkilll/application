package Entities;

import java.util.List;

public class AdminColliers {

	private int ID_Collier;
	private List<Collier> id_Collier;
	public AdminColliers(int iD_Collier, List<Collier> id_Collier2) {
		super();
		ID_Collier = iD_Collier;
		id_Collier = id_Collier2;
	}
	public int getID_Collier() {
		return ID_Collier;
	}
	public void setID_Collier(int iD_Collier) {
		ID_Collier = iD_Collier;
	}
	public List<Collier> getId_Collier() {
		return id_Collier;
	}
	public void setId_Collier(List<Collier> id_Collier) {
		this.id_Collier = id_Collier;
	}
}
