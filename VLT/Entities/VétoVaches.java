package Entities;

import java.util.List;

public class VétoVaches {
 private int ID_Vét;
 private List<Vache>id_Vét;
public int getID_Vét() {
	return ID_Vét;
}
public void setID_Vét(int iD_Vét) {
	ID_Vét = iD_Vét;
}
public List<Vache> getId_Vét() {
	return id_Vét;
}
public void setId_Vét(List<Vache> id_Vét) {
	this.id_Vét = id_Vét;
}
public VétoVaches(int iD_Vét, List<Vache> id_Vét2) {
	super();
	ID_Vét = iD_Vét;
	id_Vét = id_Vét2;
}
 
 
}
