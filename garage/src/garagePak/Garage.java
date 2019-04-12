package garagePak;


import java.util.Scanner;


public class Garage {
	
	private Piano[] piani;
	private int exitAdmin;
	
	public Garage( int numPiani ) {
		
		this.piani = new Piano[numPiani];
		
		for(int i = 0; i<numPiani ;i++) {
			
			//inserire dati da tastiera
			piani[i] = new Piano(10,10,10,i+1);
		}
	}
	
	public void MenuAdmin() {
		
		System.out.println("... MENU ADMIN ...\n -> premi 1-5\n");
		
		while( exitAdmin == 0 ) {
			
			Scanner scan1 = new Scanner(System.in); 
			
			System.out.println(
					
					 " 1. Inizializza Garage\n"
					+ " 2. Setta prezzi orario\n"
					+ " 3. Setta prezzi abbonamento\n"		 
					+ " 4. Apri menu automobilista\n"
					+ " 5. Exit"
			);		
			
			int scelta = scan1.nextInt();
			
			switch(scelta) {
			   
				
				case 2:
			        
					Scanner scan3 = new Scanner(System.in);					
					System.out.println("\nInserisci prezzo orario Van: ");
					float prezzo1 = scan3.nextFloat();
					PostoAutoVan.prezzoOrario = prezzo1;
								
					System.out.println("\nInserisci prezzo orario Lusso: ");
					 prezzo1 = scan3.nextFloat();
					PostoAutoLusso.prezzoOrario = prezzo1;
					
					System.out.println("\nInserisci prezzo orario Normale: ");
					 prezzo1 = scan3.nextFloat();
					PostoAutoNormale.prezzoOrario = prezzo1;
					
				break;
					
				case 3:
					
					Scanner scan4 = new Scanner(System.in);					
					System.out.println("\nInserisci prezzo abbonamento Van: ");
					float prezzo2 = scan4.nextFloat();
					PostoAutoVan.prezzoAbbonamento = prezzo2;
									
					System.out.println("\nInserisci prezzo abbonamento Lusso: ");
					prezzo2 = scan4.nextFloat();
					PostoAutoLusso.prezzoAbbonamento = prezzo2;
									
					System.out.println("\nInserisci prezzo abbonamento Normale: ");
					prezzo2 = scan4.nextFloat();
					PostoAutoNormale.prezzoAbbonamento = prezzo2;
					
		 		break;
			
				case 4:
					
					menuAutomobilista();
					
				break;
				
				case 5:
					
					exitAdmin = 1;
					
				break;
			
			} 
		}
	}
	
	public void menuAutomobilista() {
		
		System.out.println("... MENU AUTOMOBILISTA ...\n -> premi 1-5\n");
		for(Piano pc: piani) {
			
			System.out.println("Il piano numero "+ pc.getPiano() + "ha disponibili :\n"
							 + pc.getPostiLiberi("Van") + "posti Van \n"
							 + pc.getPostiLiberi("Lusso")+ "posti Lusso \n"
							 + pc.getPostiLiberi("Normale")+ "posti Normale\n\n"
					);
		}
		
		while( exitAdmin == 0 ) {
			
			Scanner scan1 = new Scanner(System.in); 			
			System.out.println( "Scegli numero piano: ");			
			int scelta1 = scan1.nextInt();
			
			Scanner scan2 = new Scanner(System.in);			
			System.out.println( "Scegli tipo veicolo: ");			
			String scelta2 = scan2.nextLine();
			
			Scanner scan3 = new Scanner(System.in); 
			System.out.println( "Premi 1 -  posto giornaliero\n"
								+ "Premi 2 - abbonamento"
					    	  );			
			int scelta3 = scan3.nextInt();	
			
			if(scelta3 == 1) {
				
				if(piani[scelta1].verificaPieno(scelta2)) {
					System.out.println( "Posti non disponibili");	
					exitAdmin=1;
				}
				else {
					
					piani[scelta1].prenotaPosto(scelta2); 
					
				}
			}
			else {
				
				if(piani[scelta1].verficaAbbonato(scelta2)) {
					System.out.println( "Posti non disponibili");	
					exitAdmin=1;
				}
				else {
					
					piani[scelta1].prenotaAbbonamento(scelta2); 
					
				}
				
			}
			exitAdmin=1;
		}
		
		menuAutomobilistaUscita();
	}
	
	public void menuAutomobilistaUscita() {
		
		Scanner scan1 = new Scanner(System.in); 
		
		System.out.println( "Inserisci ID: ");			
		int scelta1 = scan1.nextInt();
		
		for(Piano pc: piani) {
			
			if(pc.liberaPosto(scelta1)>0) {
				double prezzo = pc.tempoPermanenza(scelta1)*pc.liberaPosto(scelta1);
				System.out.println( "pagare: "+prezzo);	
			}
			
		}
		
		
	}
	
	
}
