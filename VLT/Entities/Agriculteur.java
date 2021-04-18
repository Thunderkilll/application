package Entities;

public class Agriculteur {

	
	private String Adresse;
	private int Score ;
	private int Région;
	
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public int getScore() {
		return Score;
	}
	public void setScore(int score) {
		Score = score;
	}
	public int getRégion() {
		return Région;
	}
	public void setRégion(int région) {
		Région = région;
	}
	@Override
	public String toString() {
		return "Agriculteur [Adresse=" + Adresse + ", Score=" + Score + ", Région=" + Région + "]";
	}
	public Agriculteur(String adresse, int score, int région) {
		super();
		Adresse = adresse;
		Score = score;
		Région = région;
	} 
	
	
}
