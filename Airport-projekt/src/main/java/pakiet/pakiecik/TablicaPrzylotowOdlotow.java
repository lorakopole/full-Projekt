package pakiecik;

import java.util.*;

public class TablicaPrzylotowOdlotow {

	private Vector<Samolot> aktualneloty;
	Date nowDate;


	public TablicaPrzylotowOdlotow(Vector<Samolot> _aktualneloty) {
		super();
		this.aktualneloty = _aktualneloty;

	}

	public long getTime() {
			return nowDate.getTime();
		}

	public Vector<Samolot> getAktualneloty() {
		return aktualneloty;
	}

	public void setAktulaneloty(Vector<Samolot> aktualneloty) {
		this.aktualneloty = aktualneloty;
	}

	public Date getNowDate() {
		return nowDate;
	}

	public void setNowDate(Date nowDate) {
		this.nowDate = nowDate;
	}

	public int indexOf(Object aktualnylot, int index) {
		return aktualneloty.indexOf(aktualnylot, index);
	}
	

}
