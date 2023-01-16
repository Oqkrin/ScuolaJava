package Equazione;
import java.util.*;

public class MainEquazione {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String x, y;
		do {
			System.out.println("Digita P per inserire un equazione di primo grado ed S per inserirne una di secondo Z per uscire");
			x = in.next();
			
			switch (x) {
			
				case "P" : {
					
					System.out.print("digita valore del coefficiente: ");
					double b = in.nextDouble();
					System.out.print("digita valore del terime noto: ");
					double c = in.nextDouble();
					
					Equazione Eq = new Equazione(c, b);
					
					System.out.println("l'incognita di " + Eq.getEquazione() + " è pari a " + Eq.getX());
				}
				break;
				
				case "S" : {
					
					System.out.print("digita valore del coefficiente a : ");
					double a = in.nextDouble();
					System.out.print("digita valore del coefficiente b : ");
					double b = in.nextDouble();
					System.out.print("digita valore del terime noto: ");
					double c = in.nextDouble();
					
					Equazione2 Eq = new Equazione2(c, b, a);
					
					do {
						
						System.out.println("Digita 'T' per conoscere il tipo di equazione di secondo grado, 'R' per ottenere le radici se sono presenti nell'insieme dei reali e 'Z' per uscire");
						y = in.next();
						
						switch(y) {
						
						case "T" : {
							System.out.println("L'equazione è di tipo " + Eq.getTipo());
						}
						break;
						
						case "R" : {
							if(Eq.getDelta()==0) {
								System.out.println("Il delta è pari a zero quindi le sue radici sono coincidenti in un solo punto: " + Eq.getX0() + " tocca l' asse y a" + Eq.getC() + "e ha concavità verso " + Eq.getVerso());
							}else if(Eq.getDelta() < 0) {
								System.out.println("Delta negativo nessuna radice possibile nei reali");
							}else { 

								System.out.println("Il delta è positivo("+ Eq.getDelta() +") le sue radici sono " + Eq.getXS() + " e " + Eq.getXD() + " tocca l' asse y a " + Eq.getC() + " e ha concavità verso " + Eq.getVerso());
							}
						}
						break;
						
						default : y= "Z";
						break;
						
						}
					}while(y != "Z");
					

				}
				break;
				default : x = "Z";
				break;
			}
		}while(x != "Z");
	}

}
