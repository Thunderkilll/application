package Entities;

import java.util.List;


public class AgriVaches {
	private int ID_Vache;
    private List<Vache> id_Vache;
	public int getID_Vache() {
		return ID_Vache;
	}
	public void setID_Vache(int iD_Vache) {
		ID_Vache = iD_Vache;
	}
	public List<Vache> getId_Vache() {
		return id_Vache;
	}
	public void setId_Vache(List<Vache> id_Vache) {
		this.id_Vache = id_Vache;
	}
	public AgriVaches(int iD_Vache, List<Vache> id_Vache2) {
		super();
		ID_Vache = iD_Vache;
		id_Vache = id_Vache2;
	}

	
}
