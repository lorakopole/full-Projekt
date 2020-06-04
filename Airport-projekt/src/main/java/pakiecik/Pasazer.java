package pakiecik;

import java.util.Vector;
import java.util.Random;

public class Pasazer {
	
	private String Imie;
	private String Nazwisko;
	private Vector<Bagaz> bagaze;
	private boolean wazny_paszport;

	
	private boolean Bording = false;
	private String ID;
	
	
	public Pasazer(String Imie, String Nazwisko, boolean wazny_paszport, String ID)
	{
	
		this.Imie = Imie;
		this.Nazwisko = Nazwisko;
		this.wazny_paszport = wazny_paszport;
		this.ID = ID;
		bagaze = new Vector<Bagaz>();
		Random r = new Random();
		int liczba = r.nextInt(3)+1;
		for( int i=0;i < liczba;i++)
		{
			Bagaz temp = new Bagaz(BazaDanych.get_waga(),BazaDanych.get_ID_bagazu());
			this.bagaze.add(temp);
		}
	}
	 public boolean sprawdz_bagaz() {
		 int waga = 0;
		 for(int i=0; i<bagaze.size();i++) {
			 waga += bagaze.get(i).sprawdz_bagaz(); //pobiera wage bagazu i sumuje
		 }
		 if(waga <= 20) //jeslu suma wagi jest ponizej 20 to jest dobrze
			 return true;
		 
		 else { 
			 return false;
		 }
		 
		
    }
	 public boolean sprawdz_paszport() {
	        if (this.wazny_paszport == true) {
	        	return true;
	        }
	        else return false;
	    }

	public void ustaw_Boarding()
	{
		if(sprawdz_paszport() && sprawdz_bagaz()){
			this.Bording = true;
		}
	}

	public String getImie() {
		return Imie;
	}

	public String getNazwisko() {
		return Nazwisko;
	}

	public Vector<Bagaz> getBagaze() {
		return bagaze;
	}

	public boolean isWazny_paszport() {
		return wazny_paszport;
	}

	public boolean isBording() {
		return Bording;
	}

	public String getID() {
		return ID;
	}

}
