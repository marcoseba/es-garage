package garagePak;

public class provaPostiAuto {
	
	

	public static void main ( String [] args ) {

		//set dei prezzi
		PostoAutoNormale.prezzoOrario = 1.25;
		PostoAutoNormale.prezzoAbbonamento = 20.5;
		PostoAutoLusso.prezzoOrario = 2.25;
		PostoAutoLusso.prezzoAbbonamento = 45.65;
		PostoAutoVan.prezzoOrario = 1.75;
		PostoAutoVan.prezzoAbbonamento = 30.40;
		
		
		PostoAutoNormale ppn1 = new PostoAutoNormale();
		PostoAutoNormale ppn2 = new PostoAutoNormale();
		PostoAutoNormale ppn3 = new PostoAutoNormale();
		PostoAutoNormale ppn4 = new PostoAutoNormale();

		ppn1.setOccupato(true); //inizializzo un posto auto
		
		PostoAutoLusso ppl1 = new PostoAutoLusso();
		PostoAutoLusso ppl2 = new PostoAutoLusso();
		PostoAutoLusso ppl3 = new PostoAutoLusso();
		
			
		System.out.println(ppn1.getDate().toString()); //prova stampa data
		
		double id  = PostoAutoLusso.prezzoOrario;
		double c = id+454.545;
		
		Piano primopiano = new Piano(12,12,12,1);
		int ID = primopiano.prenotaAbbonamento("Van");
		System.out.println(ID);
		
			
	
	
	}	
	
}
