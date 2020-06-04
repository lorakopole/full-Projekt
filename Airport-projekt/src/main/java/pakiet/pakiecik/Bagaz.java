package pakiecik;

public class Bagaz {
		private int waga;
		private String ID;
		private boolean czyZgubiona = false;
		
		public Bagaz(int waga, String ID) {
			this.waga = waga;
			this.ID = ID;
		}
		public int sprawdz_bagaz() {
			return waga;
		}

	public boolean isCzyZgubiona() {
		return czyZgubiona;
	}

	public void setCzyZgubiona(boolean czyZgubiona) {
		this.czyZgubiona = czyZgubiona;
	}
}
