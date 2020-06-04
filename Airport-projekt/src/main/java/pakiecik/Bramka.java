package pakiecik;

import java.util.*;
public class Bramka
{
        private Queue<Pasazer> kolejka;

		public Bramka(Queue<Pasazer> kolejka) {
			this.kolejka = new PriorityQueue<Pasazer>();	//polimorfizm
			
		}

		public Queue<Pasazer> getKolejka() {
			return kolejka;
		}

		public void setKolejka(PriorityQueue<Pasazer> kolejka) {
			this.kolejka = kolejka;
		}
}