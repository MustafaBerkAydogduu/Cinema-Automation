package SinemaOtamasyonu;

import java.awt.Image;

public class Bilet {
	
private String filmName;
private String saat;
private int odenenUcret;
private String salon;
private int koltukNo;
private Image icon;
private String isim_soy_isim;

public Bilet(String filmName, String saat, int odenenUcret, String salon, int koltukNo,String isim_soy_isim,Image icon) {
	this.filmName = filmName;
	this.saat = saat;
	this.odenenUcret = odenenUcret;
	this.salon = salon;
	this.koltukNo = koltukNo;
	this.icon=icon;
	this.isim_soy_isim=isim_soy_isim;
}
public String getFilmName() {
	return filmName;
}
public void setFilmName(String filmName) {
	this.filmName = filmName;
}
public String getSaat() {
	return saat;
}
public void setSaat(String saat) {
	this.saat = saat;
}
public int getOdenenUcret() {
	return odenenUcret;
}
public void setOdenenUcret(int odenenUcret) {
	this.odenenUcret = odenenUcret;
}
public String getSalon() {
	return salon;
}
public void setSalon(String salon) {
	this.salon = salon;
}
public int getKoltukNo() {
	return koltukNo;
}
public void setKoltukNo(int koltukNo) {
	this.koltukNo = koltukNo;
}
public Image getIcon() {
	return icon;
}
public void setIcon(Image icon) {
	this.icon = icon;
}
public String getIsim_soy_isim() {
	return isim_soy_isim;
}
public void setIsim_soy_isim(String isim_soy_isim) {
	this.isim_soy_isim = isim_soy_isim;
}
}
