import java.lang.Math.*;

class triangolo {
	private int a;
	private int b;
	private int c;
	
	public triangolo(int cateto1, int cateto2, int ipotenusa) {
		a = cateto1;
		b = cateto2;
		c = ipotenusa;
	}
	
	public String getTipo() {

		if((a != b) && (b != c) && (a != c)) {
		    return("scaleno");
		    }
		        else if((a == b) && (b == c) && (a == c)) 
		    {
                return("equilatero");
            }
                else
            {
                return("isoscele");
            }
	}
	
		
	public int getPerimetro() {
		return a + b + c;
	}
	
	public double getArea() {
		return 0.25*Math.sqrt((a+(b+c))*(c-(a-b))*(c+(a-b))*(a+(b-c))); //formula erone
	}
}
