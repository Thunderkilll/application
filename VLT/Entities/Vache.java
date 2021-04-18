package Entities;

public class Vache {
	private int ID_Vache;
	private int ID_Agri;
	private int ID_Vét;
	private String Race ;
	private int Age ;
	private String Sexe ;
	private String Vaccin ;
	private String Dossie_Médical ;
	private boolean Période_Chaleur ;
	private int numéro;
	public Vache() {
		
	}
	public int getID_Vache() {
		return ID_Vache;
	}
	public void setID_Vache(int iD_Vache) {
		ID_Vache = iD_Vache;
	}
	public int getID_Agri() {
		return ID_Agri;
	}
	public void setID_Agri(int iD_Agri) {
		ID_Agri = iD_Agri;
	}
	public int getID_Vét() {
		return ID_Vét;
	}
	public void setID_Vét(int iD_Vét) {
		ID_Vét = iD_Vét;
	}
	public String getRace() {
		return Race;
	}
	public void setRace(String race) {
		Race = race;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getSexe() {
		return Sexe;
	}
	public void setSexe(String sexe) {
		Sexe = sexe;
	}
	public String getVaccin() {
		return Vaccin;
	}
	public void setVaccin(String vaccin) {
		Vaccin = vaccin;
	}
	public String getDossie_Médical() {
		return Dossie_Médical;
	}
	public void setDossie_Médical(String dossie_Médical) {
		Dossie_Médical = dossie_Médical;
	}
	public boolean isPériode_Chaleur() {
		return Période_Chaleur;
	}
	public void setPériode_Chaleur(boolean période_Chaleur) {
		Période_Chaleur = période_Chaleur;
	}
	public int getNuméro() {
		return numéro;
	}
	public void setNuméro(int numéro) {
		this.numéro = numéro;
	}
	@Override
	public String toString() {
		return "Vache [ID_Vache=" + ID_Vache + ", ID_Agri=" + ID_Agri + ", ID_Vét=" + ID_Vét + ", Race=" + Race
				+ ", Age=" + Age + ", Sexe=" + Sexe + ", Vaccin=" + Vaccin + ", Dossie_Médical=" + Dossie_Médical
				+ ", Période_Chaleur=" + Période_Chaleur + ", numéro=" + numéro + "]";
	}
	public Vache(int iD_Vache, int iD_Agri, int iD_Vét, String race, int age, String sexe, String vaccin,
			String dossie_Médical, boolean période_Chaleur, int numéro) {
		super();
		ID_Vache = iD_Vache;
		ID_Agri = iD_Agri;
		ID_Vét = iD_Vét;
		Race = race;
		Age = age;
		Sexe = sexe;
		Vaccin = vaccin;
		Dossie_Médical = dossie_Médical;
		Période_Chaleur = période_Chaleur;
		this.numéro = numéro;
	}
	
	


}
