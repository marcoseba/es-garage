package garagePak;


public class TestPiano {
	public static void main ( String [] args ) {
	
		Piano p1 = new Piano(10,10,10,1);
		p1.prenotaPosto("Van");
		p1.prenotaAbbonamento("Lusso");
		p1.getPiano();
		
		p1.getPostiLiberi("Van");
		
		p1.tempoPermanenza(2);
		p1.liberaPosto(2);
		p1.verficaAbbonato("Lusso");
		
		
		}
}
