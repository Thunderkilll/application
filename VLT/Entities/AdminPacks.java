package Entities;

import java.util.List;

public class AdminPacks {
	private int ID_Pack;
	private List<Pack> id_Pack;
	public int getID_Pack() {
		return ID_Pack;
	}
	public void setID_Pack(int iD_Pack) {
		ID_Pack = iD_Pack;
	}
	public List<Pack> getId_Pack() {
		return id_Pack;
	}
	public void setId_Pack(List<Pack> id_Pack) {
		this.id_Pack = id_Pack;
	}
	public AdminPacks(int iD_Pack, List<Pack> id_Pack2) {
		super();
		ID_Pack = iD_Pack;
		id_Pack = id_Pack2;
	}
	
	
}
