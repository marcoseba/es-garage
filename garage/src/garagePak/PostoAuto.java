package garagePak;
import java.util.Calendar;
import java.util.Date;

public class PostoAuto {

	private static int IDultimoPosto = 1;
	private int IDPosto;
	private boolean occupato;
	private boolean abbonato;
	private Date data = new Date();
	
	
	public PostoAuto() {
		
		this.IDPosto = IDultimoPosto +1; //inizializzo id posto quando viene creato
		IDultimoPosto++; //aggiorno variabile static 
	}

	
		
	public int getIDPosto() {
		
		return IDPosto;
	}

	public boolean getOccupato() {
		
		return occupato;
	}

	/**
	 * 
	 * @param occupato
	 */
	public void setOccupato(boolean occupato) {
		
		this.occupato = occupato;
		
		if(occupato  == true)  //set orario e data
		{
			Calendar cal =  Calendar.getInstance();
		
			data = cal.getTime();
		
		}
		
		
		
	}

	public boolean getAbbonato() {
		
		return abbonato;
	}

	/**
	 * 
	 * @param abbonato
	 */
	public void setAbbonato(boolean abbonato) {
		
		this.abbonato = abbonato;
	}

	
	public Date getDate() {
		return data;
	}

	
}