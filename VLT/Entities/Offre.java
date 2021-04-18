package Entities;

import java.util.Date;

public class Offre {
	public int ID_Offre;
	private String Nom;
	private Date DateDébut;
	private Date DateFin ;
	private Float Prix_Offre;
	private String Produits ; 
	private int Qt_Offre;
	private int Nb_Participants ; 
	private int Note; 
	
	
	public Offre(int iD_Offre, String nom, Date dateDébut, Date dateFin, Float prix_Offre, String produits,
			int qt_Offre, int nb_Participants, int note) {
		super();
		ID_Offre = iD_Offre;
		Nom = nom;
		DateDébut = dateDébut;
		DateFin = dateFin;
		Prix_Offre = prix_Offre;
		Produits = produits;
		Qt_Offre = qt_Offre;
		Nb_Participants = nb_Participants;
		Note = note;
	}


	@Override
	public String toString() {
		return "Offre [ID_Offre=" + ID_Offre + ", Nom=" + Nom + ", DateDébut=" + DateDébut + ", DateFin=" + DateFin
				+ ", Prix_Offre=" + Prix_Offre + ", Produits=" + Produits + ", Qt_Offre=" + Qt_Offre
				+ ", Nb_Participants=" + Nb_Participants + ", Note=" + Note + "]";
	}


	public String getNom() {
		return Nom;
	}


	public void setNom(String nom) {
		Nom = nom;
	}


	public Date getDateDébut() {
		return DateDébut;
	}


	public void setDateDébut(Date dateDébut) {
		DateDébut = dateDébut;
	}


	public Date getDateFin() {
		return DateFin;
	}


	public void setDateFin(Date dateFin) {
		DateFin = dateFin;
	}


	public Float getPrix_Offre() {
		return Prix_Offre;
	}


	public void setPrix_Offre(Float prix_Offre) {
		Prix_Offre = prix_Offre;
	}


	public String getProduits() {
		return Produits;
	}


	public void setProduits(String produits) {
		Produits = produits;
	}


	public int getQt_Offre() {
		return Qt_Offre;
	}


	public void setQt_Offre(int qt_Offre) {
		Qt_Offre = qt_Offre;
	}


	public int getNb_Participants() {
		return Nb_Participants;
	}


	public void setNb_Participants(int nb_Participants) {
		Nb_Participants = nb_Participants;
	}


	public int getNote() {
		return Note;
	}


	public void setNote(int note) {
		Note = note;
	}


	public int getID_Offre() {
		return ID_Offre;
	}


	public Offre() {  
		
	}


	public static void add(Offre o2) {
		// TODO Auto-generated method stub
		
	}


	
}
