package Entities;

import java.util.List;


public class AdminOffres {
 private int ID_Offre;
 private List<Offre> id_Offre;
public int getID_Offre() {
	return ID_Offre;
}
public void setID_Offre(int iD_Offre) {
	ID_Offre = iD_Offre;
}
public List<Offre> getId_Offre() {
	return id_Offre;
}
public void setId_Offre(List<Offre> id_Offre) {
	this.id_Offre = id_Offre;
}
public AdminOffres(int iD_Offre, List<Offre> id_Offre2) {
	super();
	ID_Offre = iD_Offre;
	id_Offre = id_Offre2;
}

}
