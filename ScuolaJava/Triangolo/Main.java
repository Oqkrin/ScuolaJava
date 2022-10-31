import java.util.*;

public class Main {
	public static void main(String[] args) {
		String x;
		boolean v = true;
		Scanner l= new Scanner(System.in);
		System.out.println("Digitare le lunghezze dei lati di un triangolo\n\nCateto1:");
		int l1  = l.nextInt();
		System.out.println("Cateto2:");
		int l2  = l.nextInt();
		System.out.println("Ipotenusa:");
		int l3  = l.nextInt();
		
		triangolo t1 = new triangolo(l1,l2,l3);
		
		do{
		System.out.println("Digita 'A' per sapere l'area 'P' per conoscere il perimetro 'T' per sapere il tipo e 'Z' per interrompere");
		x = l.next();
		switch(x) {
		    case "A" : System.out.println("="+t1.getArea());
		        break;
		    case "P" : System.out.println("="+t1.getPerimetro());
		        break;
		    case "T" : System.out.println("Il triangolo e': "+t1.getTipo());
		        break;
            default :  v = false;
                break;
		}
        }while(v);   
		
		
	}

}
