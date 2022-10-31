package Equazione;

public class Equazione {
	
	private double c;
	private double b;
	
	public Equazione(double termineNoto, double coefficiente1) {
		c = termineNoto ;
		b = coefficiente1;
	}

	public String getEquazione() {
		return '(' + getB() + "x)" + " + (" + c + ')';
	}
	
	public double getX() {
		
		return (-1*c)/getB();
	}

	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	
}

class Equazione2 extends Equazione {
	
	private double a;
	private double Delta;
	
	public Equazione2(double termineNoto, double coefficiente1, double coefficiente2) {
		super(termineNoto, coefficiente1);
		a = coefficiente2;
	}

	public String getEquazione2() {
		return a + "x^2 " + getEquazione2();
	}
	
	public double getDelta() {
		return Delta = Math.pow(2, getB()) + -4*a*getC();
	}
	
	public double getXS() {
		return -1*getB() + Math.sqrt(Delta)/(2*a);
	}
	
	public double getXD() {
		return -1*getB() - Math.sqrt(Delta)/(2*a);
	}
	
	public double getX0() {
		return (-1*getB())/(2*a);
	}

	public String getTipo() {
		 
		return null;
	}
}
