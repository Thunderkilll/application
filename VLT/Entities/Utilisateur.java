package Entities;

import java.util.Date;

public class Utilisateur {
	private int ID;
	private String Nom; 
	private String Prénom;
	private Date DateNaiss;
    private	int Age;
	private String Email;
	private int NumTél;
	public Utilisateur() {
			}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrénom() {
		return Prénom;
	}
	public void setPrénom(String prénom) {
		Prénom = prénom;
	}
	public Date getDateNaiss() {
		return DateNaiss;
	}
	public void setDateNaiss(Date dateNaiss) {
		DateNaiss = dateNaiss;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getNumTél() {
		return NumTél;
	}
	public void setNumTél(int numTél) {
		NumTél = numTél;
	}
	@Override
	public String toString() {
		return "Utilisateur [ID=" + ID + ", Nom=" + Nom + ", Prénom=" + Prénom + ", DateNaiss=" + DateNaiss + ", Age="
				+ Age + ", Email=" + Email + ", NumTél=" + NumTél + "]";
	}
	public Utilisateur(int iD, String nom, String prénom, Date dateNaiss, int age, String email, int numTél) {
		super();
		ID = iD;
		Nom = nom;
		Prénom = prénom;
		DateNaiss = dateNaiss;
		Age = age;
		Email = email;
		NumTél = numTél;
	}
	
	
}

