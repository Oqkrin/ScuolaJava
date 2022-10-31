package Trapezio;
class Trapezio { 

	private int b;
	private int B;
	private double c1;
	private double c2;
	private double P;

	public Trapezio(int base, int BASE, double cateto1, double cateto2) {
		b = base;
		B = BASE;
		c1 = cateto1;
		c2 = cateto2; 
	} 

	public void cPerimetro() {
		P = b + B + c1 + c2; 
	} 

	public void getPerimetro() {
		cPerimetro();
		System.out.println(P);
	}	 

} 
