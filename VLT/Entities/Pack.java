package Entities;

public class Pack {
	private int ID_Pack;
	private String Nom;
	private Float Prix_Pack;
	private int Nb_Participants;
	private int Qt_Pack;
	private String  Produits;
	private int Note;
	private String Type;
	
	  public Pack() {
			
		}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public Float getPrix_Pack() {
		return Prix_Pack;
	}

	public void setPrix_Pack(Float prix_Pack) {
		Prix_Pack = prix_Pack;
	}

	public int getNb_Participants() {
		return Nb_Participants;
	}

	public void setNb_Participants(int nb_Participants) {
		Nb_Participants = nb_Participants;
	}

	public int getQt_Pack() {
		return Qt_Pack;
	}

	public void setQt_Pack(int qt_Pack) {
		Qt_Pack = qt_Pack;
	}

	public String getProduits() {
		return Produits;
	}

	public void setProduits(String produits) {
		Produits = produits;
	}

	public int getNote() {
		return Note;
	}

	public void setNote(int note) {
		Note = note;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public int getID_Pack() {
		return ID_Pack;
	}

	@Override
	public String toString() {
		return "Pack [ID_Pack=" + ID_Pack + ", Nom=" + Nom + ", Prix_Pack=" + Prix_Pack + ", Nb_Participants="
				+ Nb_Participants + ", Qt_Pack=" + Qt_Pack + ", Produits=" + Produits + ", Note=" + Note + ", Type="
				+ Type + "]";
	}

	public static void add(Pack p2) {
		// TODO Auto-generated method stub
		
	}
	  
	

}
