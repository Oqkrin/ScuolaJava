package Trapezio;
import java.util.*;
import java.lang.*;
class MainTrapezio {
public static void main(String[] args) {
	int b, B;
	double ca1, ca2;
	boolean T = false;
	
	Scanner l = new Scanner(System.in);
	
	//do {
	
		System.out.println("Digitare base minore del Trapezio:");
		b  = l.nextInt();
		System.out.println("Digitare base minore del Trapezio:");
		B  = l.nextInt();
		
		if(B < b) {
			
			int temp = B;
			B = b;
			b = temp;
			} 
		
		System.out.println("Digitare primo lato obliquo:");
		ca1 = l.nextInt();
		System.out.println("Digitare secondo lato obliquo:");
		ca2 = l.nextInt();
		
	// controllo esistenza Trapezio, Lento:
	//
	//	for(int j = 0;j <= B-b || !(T);j++) {
	//		for(int i = 0; i <= B - b || !(T); i++) {	
	//			if(Math.pow(2,ca1) - Math.pow(2,i) == (Math.pow(2,ca2) - Math.pow(2,((B-b)-i))))  {				
	//				T = true; 
	//				}	
	//			}
	//	}
	//	if(!(T)) System.out.println("Trapezio non valido");
	//} while(!T);
	
	Trapezio t1 = new Trapezio(b,B,ca1,ca2);
	System.out.println("Il perimetro è: ");
	t1.getPerimetro();
	}
}
