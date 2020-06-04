package pakiecik;

public class PasazerVIP extends Pasazer {
	
	 public PasazerVIP(String Imie, String Nazwisko, boolean wazny_paszport, String ID) {
		super(Imie, Nazwisko, wazny_paszport, ID);

	}

	@Override
	public boolean sprawdz_paszport() {
        return true;
	}

	@Override
	 public boolean sprawdz_bagaz() {
		return true;
	 }
}
	
