package pakiecik;

import java.util.*;
public class Samolot
{
	private Vector<Pasazer> pasazerowie;
    private Lotnisko mojelotnisko;
    private Date nowDate;
    public Date odlot;
    public Date przylot;

	public long getTime() {
		return odlot.getTime();
	}

	public Samolot(Lotnisko mojelotnisko,
			Date nowDate, Date odlot, Date przylot) {
		super();
		this.pasazerowie = new Vector<Pasazer>();
		this.mojelotnisko = mojelotnisko;
		this.nowDate = nowDate;
		this.odlot = odlot;
		this.przylot = przylot;
	
	}

	public void odlot() {
		Calendar odlotopoznienie=Calendar.getInstance();
		odlotopoznienie.setTime(new Date());
		odlotopoznienie.add(Calendar.HOUR_OF_DAY, opoznienie);
		//opoznienie z tablicy przylotów-odlotow>?!
		if(odlotopoznienie.after(odlot) ) 
		{
		       //samolot opozniony
			
			
		}
		else
		{
			//humor gituwa
			
		}
		

	}

	public Vector<Pasazer> getPasazerowie() {
		return pasazerowie;
	}

	public void setPasazerowie(Vector<Pasazer> pasazerowie) {
		this.pasazerowie = pasazerowie;
	}

	public Lotnisko getMojelotnisko() {
		return mojelotnisko;
	}

	public void setMojelotnisko(Lotnisko mojelotnisko) {
		this.mojelotnisko = mojelotnisko;
	}

	public Date getNowDate() {
		return nowDate;
	}

	public void setNowDate(Date nowDate) {
		this.nowDate = nowDate;
	}

	public Date getOdlot() {
		return odlot;
		//
	}

	public void setOdlot(Date odlot) {
		this.odlot = odlot;
	}

	public Date getPrzylot() {
		return przylot;
	}

	public void setPrzylot(Date przylot) {
		this.przylot = przylot;
	}

}