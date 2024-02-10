package SinemaOtamasyonu;

import java.awt.Image;
import java.util.Random;

import javax.swing.Icon;

public class SecilenFilm {
	
private String filmName;
private String salon;
private String saat;
private Icon icon;


public SecilenFilm(String filmName, String salon, String saat,Icon icon) {
	this.filmName = filmName;
	this.salon = salon;
	this.saat = saat;
	this.icon=icon;
}


public String getFilmName() {
	return filmName;
}

public void setFilmName(String filmName) {
	this.filmName = filmName;
}

public String getSalon() {
	return salon;
}

public void setSalon(String salon) {
	this.salon = salon;
}

public String getSaat() {
	return saat;
}

public void setSaat(String saat) {
	this.saat = saat;
}

public Icon getIcon() {
	return icon;
}

public void setIcon(Icon icon) {
	this.icon = icon;
}





}
