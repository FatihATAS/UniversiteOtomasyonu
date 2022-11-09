package UniSorusu;

public class Asistant extends Akademisyen {
	boolean yuksekLisans;
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	public Asistant(boolean yuksekLisans , String adSoyad , String ders , String bolum , String telefon) {
		super(bolum , telefon);
		this.yuksekLisans = yuksekLisans;
		this.AdSoyad = adSoyad;
		super.ders = ders;
		
	}

	@Override
	public void derseGir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void giris() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cikis() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void yemek() {
		// TODO Auto-generated method stub
		
	}
	
}
