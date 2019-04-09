package garagePak;

import java.util.Date;


public class Piano {

	private int numTotVan;
	private int numTotLusso;
    private int numTotNormale;
	private int numPiano;
	private PostoAutoVan[] postiAutoVan;  //dichiarazione vettore
	private PostoAutoLusso[] postiAutoLusso;
	private PostoAutoNormale[] postiAutoNormale;
	
	
	public Piano(int numTotVan, int numTotLusso, int numTotNormale, int numPiano) {
		
		this.numPiano = numPiano;
		this.numTotVan = numTotVan;
		this.numTotLusso = numTotLusso;
		this.numTotNormale = numTotNormale;
		this.postiAutoVan = new PostoAutoVan[numTotVan];  //creazione vettore
		this.postiAutoLusso = new PostoAutoLusso[numTotLusso];
		this.postiAutoNormale = new PostoAutoNormale[numTotNormale];
		
		for(int i = 0; i<numTotVan ;i++) {
			postiAutoVan[i] = new PostoAutoVan();
		}
		for(int i = 0; i<numTotNormale ;i++) {
			postiAutoNormale[i] = new PostoAutoNormale();
		}
		for(int i = 0; i<numTotLusso ;i++) {
			postiAutoLusso[i] = new PostoAutoLusso();
		}
	}
	
	public boolean verificaPieno( String tipoAuto ) {
		
		switch( tipoAuto ) {
		
			case "Van":
				
				for( int i = 0; i < numTotVan; i++ ) {
					if( postiAutoVan[i].getOccupato() != true )
						return false;				
				}
				return true;

			
			case "Lusso":
				
				for(int  i = 0; i < numTotLusso; i++ ) {
					if( postiAutoLusso[i].getOccupato() != true )
						return false;				
				}
				return true;

			
			case "Normale":
				
				for( int i = 0; i < numTotNormale; i++ ) {
					if( postiAutoNormale[i].getOccupato() != true )
						return false;				
				}
				return true;
				
				
			default: return true;
	
		}		
	}
	
	public boolean verficaAbbonato( String tipoAuto ) {
		
		switch( tipoAuto ) {
		
			case "Van":
				
				int count1=0;
				for(int  i = 0; i < numTotVan; i++ ) {
					if( postiAutoVan[i].getAbbonato() == true )
						count1++;				
				}
				
				if( count1 < numTotVan/2 && !verificaPieno( tipoAuto ) )
					return false;
				else 
					return true;

			
			case "Lusso":
				
				int count2=0;
				for( int i = 0; i < numTotLusso; i++ ) {
					if( postiAutoLusso[i].getAbbonato() == true )
						count2++;				
				}
				
				if( count2 < numTotLusso/2 && !verificaPieno( tipoAuto ) )
					return false;
				else 
					return true;
							
			
			case "Normale":
				
				int count3=0;
				for(int i = 0; i < numTotNormale; i++ ) {
					if( postiAutoNormale[i].getAbbonato() == true )
						count3++;				
				}
				
				if( count3 < numTotNormale/2 && !verificaPieno( tipoAuto ) )
					return false;
				else 
					return true;

			
			default: return true;
		}		
	}
	
	public int prenotaPosto( String tipoAuto ) {
		
		switch( tipoAuto ) {
		
			case "Van":
				
				for( int i = 0; i < numTotVan ; i++ ) {
					if( postiAutoVan[i].getOccupato() == false ) {
	
						postiAutoVan[i].setOccupato(true);
						System.out.println( "\n\nPOSTO AUTO PRENOTATO!\n"+
								            "\nID = "+postiAutoVan[i].getIDPosto()+
								            "\nDATA = "+postiAutoVan[i].getDate()				               
								             );
						return postiAutoVan[i].getIDPosto();
					}	
				}
				
			break;
			
			case "Lusso":
				
				for(int i = 0; i < numTotLusso ; i++ ) {
					if( postiAutoLusso[i].getOccupato() == false ) {
						
						postiAutoLusso[i].setOccupato(true);
						System.out.println( "\n\nPOSTO AUTO PRENOTATO!\n"+
								            "\nID = "+postiAutoLusso[i].getIDPosto()+
								            "\nDATA = "+postiAutoLusso[i].getDate()				               
								             );
						return postiAutoLusso[i].getIDPosto();
					}	
				}
				
			break;
			
			case "Normale":
				
				for(int i = 0; i < numTotNormale ; i++ ) {
					if( postiAutoNormale[i].getOccupato() == false ) {
						
						postiAutoNormale[i].setOccupato(true); 
						System.out.println( "\n\nPOSTO AUTO PRENOTATO!\n"+
								            "\nID = "+postiAutoNormale[i].getIDPosto()+
								            "\nDATA = "+postiAutoNormale[i].getDate()				               
								             );
						return postiAutoNormale[i].getIDPosto();
					}	
				}
				
			break;
			
		}	
		return 0;
	}
	
	public int prenotaAbbonamento( String tipoAuto ) {
		
		switch( tipoAuto ) {
		
			case "Van":
				
				for(int i = 0; i < numTotVan; i++ ) {
					if( postiAutoVan[i].getOccupato() == false ) {
	
						postiAutoVan[i].setOccupato(true);
						postiAutoVan[i].setAbbonato(true); 
						System.out.println( "\n\nABBONAMENTO POSTO AUTO EFFETTUATO!\n"+
								            "\nID = "+postiAutoVan[i].getIDPosto()+
								            "\nDATA = "+postiAutoVan[i].getDate()					               
								             );
						return postiAutoVan[i].getIDPosto();
					}	
				}
							
			break;
			
			case "Lusso":
				
				for(int i = 0; i < numTotLusso; i++ ) {
					if( postiAutoLusso[i].getOccupato() == false ) {
	
						postiAutoLusso[i].setOccupato(true);
						postiAutoLusso[i].setAbbonato(true); 
						System.out.println( "\n\nABBONAMENTO POSTO AUTO EFFETTUATO!\n"+
								            "\nID = "+postiAutoLusso[i].getIDPosto()+
								            "\nDATA = "+postiAutoLusso[i].getDate()					               
								             );
						return postiAutoLusso[i].getIDPosto();
					}	
				}
							
			break;
			
			case "Normale":
				
				for(int i = 0; i < numTotNormale; i++ ) {
					if( postiAutoNormale[i].getOccupato() == false ) {
	
						postiAutoNormale[i].setOccupato(true);
						postiAutoNormale[i].setAbbonato(true); 
						System.out.println( "\n\nABBONAMENTO POSTO AUTO EFFETTUATO!\n"+
								            "\nID = "+postiAutoNormale[i].getIDPosto()+
								            "\nDATA = "+postiAutoNormale[i].getDate()					               
								             );
						return postiAutoNormale[i].getIDPosto();
					}	
				}
							
			break;	

		}	
		return 0;
	}
	
	public int liberaPosto( int IDPosto ) {
			
		for(int i = 0; i < numTotVan ; i++ ) {			
			if( postiAutoVan[i].getIDPosto() == IDPosto) {
				
				postiAutoVan[i].setOccupato(false);
				postiAutoVan[i].setAbbonato(false); 		
				System.out.println( "\n\nPOSTO AUTO LIBERATO!\nID = "+postiAutoVan[i].getIDPosto()+"\n");
			    return postiAutoVan[i].getIDPosto();
			}
		}	
		for(int i = 0; i < numTotLusso ; i++ ) {
			if( postiAutoLusso[i].getIDPosto() == IDPosto) {

				postiAutoLusso[i].setOccupato(false);
				postiAutoLusso[i].setAbbonato(false); 		
				System.out.println( "\n\nPOSTO AUTO LIBERATO!\nID = "+postiAutoLusso[i].getIDPosto()+"\n");
			    return postiAutoLusso[i].getIDPosto();
			}
		}	
		
		for(int  i = 0; i < numTotNormale ; i++ ) {
			if( postiAutoNormale[i].getIDPosto() == IDPosto) {
	
				postiAutoNormale[i].setOccupato(false);
				postiAutoNormale[i].setAbbonato(false); 		
				System.out.println( "\n\nPOSTO AUTO LIBERATO!\nID = "+postiAutoNormale[i].getIDPosto()+"\n");
				return postiAutoNormale[i].getIDPosto();
			}
		}
		return 0; 
    }
	
	public String tempoPermanenza( int IDPosto ) {
		

		for( int i = 0; i < numTotVan ; i++ ) {			
			if( postiAutoVan[i].getIDPosto() == IDPosto) {
				
				long orarioIniziale = postiAutoVan[i].getDate().getTime();
				Date date = new Date();
				long orarioFinale = date.getTime();
				long durata = orarioFinale - orarioIniziale;
				
				if( postiAutoVan[i].getOccupato() == true && postiAutoVan[i].getAbbonato() == true) {
					
					int days = (int) (durata / (1000*60*60*24));					
					System.out.println("\n\nINTERVALLO PERMANENZA: "+Integer.toString(days));
					return Integer.toString(days);
					
					
				}
				else if( postiAutoVan[i].getOccupato() == true ) {
				
					int secondi = (int) (durata / 1000) % 60 ;
					int minuti = (int) ((durata / (1000*60)) % 60);
					int ore   = (int) ((durata / (1000*60*60)) % 24);
					String intervalloPermanenza = Integer.toString(ore)+":"+Integer.toString(minuti)+":"+Integer.toString(secondi);
					System.out.println("\n\nINTERVALLO PERMANENZA: "+intervalloPermanenza);
					return intervalloPermanenza;
			    }	
			}
		}
		
		for( int i = 0; i < numTotLusso ; i++ ) {
			if( postiAutoLusso[i].getIDPosto() == IDPosto) {

				long orarioIniziale = postiAutoLusso[i].getDate().getTime();
				Date date = new Date();
				long orarioFinale = date.getTime();
				long durata = orarioFinale - orarioIniziale;
				
				if( postiAutoLusso[i].getOccupato() == true && postiAutoLusso[i].getAbbonato() == true) {
					
					int days = (int) (durata / (1000*60*60*24));						
					System.out.println("\n\nINTERVALLO PERMANENZA: "+Integer.toString(days));
					return Integer.toString(days);
				}
				else if( postiAutoLusso[i].getOccupato() == true ){
				
					int secondi = (int) (durata / 1000) % 60 ;
					int minuti = (int) ((durata / (1000*60)) % 60);
					int ore   = (int) ((durata / (1000*60*60)) % 24);
					String intervalloPermanenza = Integer.toString(ore)+":"+Integer.toString(minuti)+":"+Integer.toString(secondi);
					System.out.println("\n\nINTERVALLO PERMANENZA: "+intervalloPermanenza);
					return intervalloPermanenza;
				}	
			}	
		}	
		
		for( int i = 0; i < numTotNormale ; i++ ) {
			if( postiAutoNormale[i].getIDPosto() == IDPosto) {

				long orarioIniziale = postiAutoNormale[i].getDate().getTime();
				Date date = new Date();
				long orarioFinale = date.getTime();
				long durata = orarioFinale - orarioIniziale;
				
				if( postiAutoNormale[i].getOccupato() == true && postiAutoNormale[i].getAbbonato() == true) {
					
					int days = (int) (durata / (1000*60*60*24));					
					System.out.println("\n\nINTERVALLO PERMANENZA: "+Integer.toString(days));
					return Integer.toString(days);
				}
				else if( postiAutoNormale[i].getOccupato() == true ){
				
					int secondi = (int) (durata / 1000) % 60 ;
					int minuti = (int) ((durata / (1000*60)) % 60);
					int ore   = (int) ((durata / (1000*60*60)) % 24);
					String intervalloPermanenza = Integer.toString(ore)+":"+Integer.toString(minuti)+":"+Integer.toString(secondi);
					System.out.println("\n\nINTERVALLO PERMANENZA: "+intervalloPermanenza);
					return intervalloPermanenza;
				}	
			}
		}
		return "Error!";
	}
	
	public int getPiano() {
		
		return numPiano;
		
	}
	
	public int getPostiOccupati( String tipoAuto ) {
		
		
		switch( tipoAuto ) {
		
			case "Van":
				int count1=0;
				for(int i = 0; i < numTotVan ; i++ ) {
					if( postiAutoVan[i].getOccupato() == true )
						count1++;				
				}
				System.out.println("\n\nNUMERO DI POSTI VAN OCCUPATI: "+count1);
				return count1;	
				
		case "Lusso":
				int count2=0;
				for(int i = 0; i < numTotLusso ; i++ ) {
					if( postiAutoLusso[i].getOccupato() == true )
						count2++;				
				}
				System.out.println("\n\nNUMERO DI POSTI LUSSO OCCUPATI: "+count2);
				return count2;						

			
			case "Normale":
				int count3=0;
				for(int i = 0; i < numTotNormale; i++ ) {
					if( postiAutoNormale[i].getOccupato() == true )
						count3++;				
				}
				System.out.println("\n\nNUMERO DI POSTI NORMALE OCCUPATI: "+count3);
				return count3;			
	
		}
	    return 0;
	    
	}
	
}
