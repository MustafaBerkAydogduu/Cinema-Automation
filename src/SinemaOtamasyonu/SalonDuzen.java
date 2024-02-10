package SinemaOtamasyonu;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class SalonDuzen {
	private String filmAdi;
	private String saat;
	private String salon;
	private Random r = new Random();
	private ArrayList<Integer> salonDuzen = new ArrayList<>();
	private Image icon;
	private int biletFiyati;

	public SalonDuzen(String filmAdi, String saat, String salon, Image icon,int biletFiyati) {
		atama();
		this.filmAdi = filmAdi;
		this.saat = saat;
		this.salon = salon;
		this.icon = icon;
		this.biletFiyati=biletFiyati;
	}

	public void atama() {
		for (int i = 0; i < 54; i++) {
				int secim = (int) (r.nextDouble() * 2) + 1;
				salonDuzen.add(secim);	

		}
	}

	public String getFilmAdi() {
		return filmAdi;
	}

	public void setFilmAdi(String filmAdi) {
		this.filmAdi = filmAdi;
	}

	public String getSaat() {
		return saat;
	}

	public void setSaat(String saat) {
		this.saat = saat;
	}

	public String getSalon() {
		return salon;
	}

	public void setSalon(String salon) {
		this.salon = salon;
	}

	public Random getR() {
		return r;
	}

	public void setR(Random r) {
		this.r = r;
	}

	public ArrayList<Integer> getSalonDuzen() {
		return salonDuzen;
	}

	public void setSalonDuzen(ArrayList<Integer> salonDuzen) {
		this.salonDuzen = salonDuzen;
	}

	public Image getIcon() {
		return icon;
	}

	public void setIcon(Image icon) {
		this.icon = icon;
	}

	public int getBiletFiyati() {
		return biletFiyati;
	}

	public void setBiletFiyati(int biletFiyati) {
		this.biletFiyati = biletFiyati;
	}

}
