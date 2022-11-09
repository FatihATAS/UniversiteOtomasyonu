package UniSorusu;

public abstract class Calisan {
	String AdSoyad;
	String Telefon;
	String Eposta;
	
	public Calisan() {
		
	}
	
	
	public Calisan(String telefon2) {
		this.Telefon = telefon2;
	}
	public abstract void giris();
	public abstract void cikis();
	public abstract void yemek();
	
	
	
	
	
}
