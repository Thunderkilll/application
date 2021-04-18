package Entities;

import java.util.Date;

public class Vétérinaire extends Utilisateur {
	
	private String Adresse;
	private int Note;
	public Vétérinaire() {
	
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public int getNote() {
		return Note;
	}
	public void setNote(int note) {
		Note = note;
	}
	@Override
	public String toString() {
		return "Vétérinaire [Adresse=" + Adresse + ", Note=" + Note + "]";
	}
	public Vétérinaire(String adresse, int note) {
		super();
		Adresse = adresse;
		Note = note;
	}
	
}
