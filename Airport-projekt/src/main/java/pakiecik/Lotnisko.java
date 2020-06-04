package pakiecik;

import java.util.*;
public class Lotnisko{

        private Vector<Pasazer> pasazerowie;
        private Vector<Samolot> aktualneloty;
        private Vector<Bramka> BramkiBoardingu;
        private TablicaPrzylotowOdlotow tablicaprzylotowodlotow;

        //stalelosowe[*]
        // do u�ycia ale raczej przez Silnik symulacji

    // constructor //
        
    public Lotnisko() {
			this.pasazerowie = new Vector<Pasazer>();
			this.aktualneloty =new Vector <Samolot>();
			this.BramkiBoardingu = new Vector <Bramka>();
			this.tablicaprzylotowodlotow = new TablicaPrzylotowOdlotow (this.aktualneloty);
		}

	// getersy //

    public Vector<Pasazer> getPassengers() {
        return pasazerowie;
    }

    public Vector<Samolot> getAktualneloty() {
        return aktualneloty;
    }

    public Vector<Bramka> getBramkiBoardingu() {
        return BramkiBoardingu;
    }

    public TablicaPrzylotowOdlotow getTablicaprzylotowodlotow() {
        return tablicaprzylotowodlotow;
    }

    // dodawanie i zamykanie bramek - relacja z bramka //

    public boolean czy_dodac_bramke(int wspolczynnikOtwarciaBramek){  // dodaje bramk� w zale�no�ci czy ilo�� pasa�er�w przekracza wsp�czynnik dozwolona ilo�� pasa�er / ilo�� bramek
        if(pasazerowie.size() / BramkiBoardingu.size() > wspolczynnikOtwarciaBramek)
            return true;
        else return false;
    }



    public void otworz_nowa_bramke(){ // metoda u�yta my�l� �e przez silnikSymulacji w g��wnej p�tli

    }

    public boolean czy_zamknac_bramke(int wspolczynnikZamknieciaBramek){  // dodaje bramk� w zale�no�ci czy ilo�� pasa�er�w przekracza wsp�czynnik dozwolona ilo�� pasa�er / ilo�� bramek
        if(pasazerowie.size() / BramkiBoardingu.size() < wspolczynnikZamknieciaBramek)
            return true;
        else return false;
    }

    public void zamknij_bramke(){

    }
}

