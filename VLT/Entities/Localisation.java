package Entities;

import java.util.Date;

public class Localisation {
	private Float Latitude ;
	private Float Longitude ;
	private Date Temps;
	
	public Localisation() {
		
	}
	public Localisation(Float latitude, Float longitude, Date temps) {
		super();
		Latitude = latitude;
		Longitude = longitude;
		Temps = temps;
	}
	public Float getLatitude() {
		return Latitude;
	}
	public void setLaltitude(Float latitude) {
		Latitude = latitude;
	}
	public Float getLongitude() {
		return Longitude;
	}
	public void setLongitude(Float longitude) {
		Longitude = longitude;
	}
	public Date getTemps() {
		return Temps;
	}
	public void setTemps(Date temps) {
		Temps = temps;
	}
	
}


