package pakiecik;
import java.lang.*;

public class SilnikSymulacji{
    private Lotnisko lotnisko;
    public ParametrySymulacji parametry;


    public SilnikSymulacji() {
        this.lotnisko = new Lotnisko();
        this.parametry = new ParametrySymulacji();
    }

    // accesors!!!


    public Lotnisko getLotnisko() {
        return lotnisko;
    }

    public ParametrySymulacji getParametry() {
        return parametry;
    }

    // metody
    public void menu_parametrow(){  // Menu wczytującze początkowe paramtery symulacji

    }

    public void dodaj_lot(){
        Samolot temp; // = new Samolot(//arg);
        //lotnisko.getAktualneloty().add(temp);

    }

    public void dodaj_pasazera(){
        Pasazer temp; // = new Pasazer();
        //lotnisko.getPassengers().add(,temp);
    }

    public void zgub_bagaz(){
        int index1 = 0;  // rand index from scope
        int index2 = 0; // rand index from scope
        this.lotnisko.getPassengers().get(index1).getBagaze().get(index2).setCzyZgubiona(true);
    }

    public void opoznij_lot(){

    }

    public void run_simulation() {

            boolean stillRunning = true;
            int main_iterator = 0;
            int period = 200; // count in ms
            int ostatniaIteracja = this.getParametry().getCzasTrwaniaSymulacji() * (1000 / period); // czas * okres petli

            int samolot_add_mod = 15;
            int pasazer_add_mod = 2;
            int zgub_bagaz_mod = 30;
            int opoznij_lot_mod = 35;

            this.menu_parametrow();
            while (stillRunning) {    // main symulation loop
                try {
                    if (main_iterator % pasazer_add_mod == 0) {
                        dodaj_pasazera();
                    }
                    if (main_iterator % samolot_add_mod == 0) {
                        dodaj_lot();
                    }
                    if (main_iterator % zgub_bagaz_mod == 0) {
                        zgub_bagaz();
                    }
                    if (main_iterator % opoznij_lot_mod == 0) {
                        opoznij_lot();
                    }

                    if(main_iterator < ostatniaIteracja) {

                    }
                    main_iterator++;    // numer of sumulation loop iteration
                    Thread.sleep(period);
                }
                catch(InterruptedException e) {
                    System.out.println("main thread was interrupted!");
                }
            }
    }

    /*
    // main loop threads
    public class Thread_main extends Thread {
        @Override
        public void run() {
            super.run();    // wywołanie konstruktora Thread czyli klasy nadrzędnej

            //this.sleep(2000);
        }
    }

    // main loop threads
    public class Thread_dodaj_pasazera extends Thread {
        @Override
        public void run() {
            super.run();    // wywołanie konstruktora Thread czyli klasy nadrzędnej
            dodaj_pasazera();
            //this.sleep(2000);
        }
    }

    public class Thread_dodaj_lot extends Thread {
        @Override
        public void run() {
            super.run();    // wywołanie konstruktora Thread czyli klasy nadrzędnej
            dodaj_lot();
        }
    }
    */

}
