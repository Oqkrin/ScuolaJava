//Gabriele Circosta 

//main alternativa interattiva

package Cellulare;

import java.util.*;

public class CellulareMainExtra {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double ricarica;
		int durata;
		
		System.out.println("Digita valore prima ricarica: ");
		ricarica = in.nextDouble();
		Cellulare myCel = new Cellulare(ricarica);
		String x;
		do {
			
			System.out.println("Digita 'Chiama' per chiamare, 'credito' per ottenere il credito, 'Ricarica' per ricaricare, 'Chiamate' per ottenere il numero di chiamate, 'Azzera' per azzerare il numero chiamate e 'Z' per interrompere");
			x = in.next();
			
			switch (x){
			
				case "Chiama" : {
					System.out.println("Digita durata chiamata : ");
					durata = in.nextInt();
					myCel.chiama(durata) ;
				}
				break;
				
				case "credito" : System.out.println( myCel.numero404());
				break;
				
				case "Ricarica" :{
					System.out.println("Digita ricarica: ");
					ricarica = in.nextInt();
					myCel.ricarica(ricarica) ;
				} ;
				
				break;
				case "Chiamate" : ;
				break;
				case "Azzera" : System.out.println(myCel.getNumeroChiamate());
				break;
				default : x = "Z";
				break;
 			}
			
		}while(x != "Z");
	}
}