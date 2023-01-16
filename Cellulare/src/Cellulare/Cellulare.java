//Gabriele Circosta

package Cellulare;

public class Cellulare {
	
	private double costoContratto = 0.15;
	private double credito;
	private int numeroChiamate;
	
	public Cellulare(double carica) {
		credito = carica;
	}
	
	public void ricarica(double ricarica) {
		credito += ricarica;
	}
	
	public void chiama(double minutiDurata) {
		credito -= minutiDurata*costoContratto;
		numeroChiamate++;
	}
	
	public double numero404() {
		return credito;
	}
	
	public int getNumeroChiamate() {
		return numeroChiamate;
	}
	
	public void azzeraChiamate() {
		numeroChiamate = 0;
	}
}
