package Equazione;
import java.util.*;
public class MainEquazione {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digita P per inserire un equazione di primo grado ed S per inserirne una di secondo Z per uscire");
		char x = (char) in.nextByte();
		do {
			switch (x) {
			
				case 'P' : {
					
					System.out.print("digita valore del coefficiente: ");
					double b = in.nextDouble();
					System.out.print("digita valore del terime noto: ");
					double c = in.nextDouble();
					
					Equazione Eq = new Equazione(c, b);
					
					System.out.print("l'incognita di " + Eq.getEquazione() + " è pari a " + Eq.getX());
				}
				break;
				case 'S' : {
					
					System.out.print("digita valore del coefficiente a : ");
					double a = in.nextDouble();
					System.out.print("digita valore del coefficiente b : ");
					double b = in.nextDouble();
					System.out.print("digita valore del terime noto: ");
					double c = in.nextDouble();
					
					Equazione2 Eq = new Equazione2(c, b, a);
					
					System.out.println("Digita 'T' per conoscere il tipo di equazione di secondo grado, 'R' per ottenere le radici se sono presenti nell'insieme dei reali e 'Z' per uscire");
					char y = (char) in.nextByte();
					
					do {
						switch(y) {
						case 'T' : {
							System.out.print("L'equazione è di tipo" + Eq.getTipo());
						}
						break;
						case 'R' : {
							
						}
						break;
						default : y= 'Z';
						break;
						}
					}while(y != 'Z');
					

				}
				break;
				default : x = 'Z';
				break;
			}
		}while(x != 'Z');
	}

}
