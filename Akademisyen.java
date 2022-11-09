package UniSorusu;

public abstract class Akademisyen extends Calisan {
	String bolum;
	String gorev;
	String ders;
	public Akademisyen (String bolum , String telefon) {
		super(telefon);
		this.bolum = bolum;
		
	}
	

	public abstract void derseGir();
	public void deneme() {
		System.out.println(super.AdSoyad);
		System.out.println(this.AdSoyad);
	}
	
	
	
		
	}
	
	

