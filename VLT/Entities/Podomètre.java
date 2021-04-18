package Entities;

import java.util.Date;

public class Podomètre {
	private int ID_Pod;
	private int ID_Vache;
	private Float Distance ;
	private Date Période;
	
	public Podomètre() {
		
	}
	public int getID_Pod() {
		return ID_Pod;
	}
	public void setID_Pod(int iD_Pod) {
		ID_Pod = iD_Pod;
	}
	public int getID_Vache() {
		return ID_Vache;
	}
	public void setID_Vache(int iD_Vache) {
		ID_Vache = iD_Vache;
	}
	public Float getDistance() {
		return Distance;
	}
	public void setDistance(Float distance) {
		Distance = distance;
	}
	public Date getPériode() {
		return Période;
	}
	public void setPériode(Date période) {
		Période = période;
	}
	public Podomètre(int iD_Pod, int iD_Vache, Float distance, Date période) {
		super();
		ID_Pod = iD_Pod;
		ID_Vache = iD_Vache;
		Distance = distance;
		Période = période;
	}
	
}
