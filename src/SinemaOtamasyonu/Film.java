package SinemaOtamasyonu;

public class Film {
	private String name;
	private String kategori;
	private String sure;

	public Film(String name, String kategori, String sure) {
		this.name = name;
		this.kategori = kategori;
		this.sure = sure;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKategori() {
		return kategori;
	}

	public void setKategori(String kategori) {
		this.kategori = kategori;
	}

	public String getSure() {
		return sure;
	}

	public void setSure(String sure) {
		this.sure = sure;
	}
}
