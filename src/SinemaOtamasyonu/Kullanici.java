package SinemaOtamasyonu;

import java.util.ArrayList;

public class Kullanici {
	private String kullaniciAdi;
	private String sifre;
	private static ArrayList<Bilet> biletler =new ArrayList<>();
	
	public Kullanici(String kullaniciAdi, String sifre) {
		this.kullaniciAdi = kullaniciAdi;
		this.sifre = sifre;
	}
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public static ArrayList<Bilet> getBiletler() {
		return biletler;
	}
	public static void setBiletler(ArrayList<Bilet> biletler) {
		Kullanici.biletler = biletler;
	}
}
