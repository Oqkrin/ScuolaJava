package numeriComplessi;

import java.util.Scanner;

import numeriComplessi.numeroComplesso.*;

public class numeriComplessiMain {

	public static void main(String[] args) {
		{
			Scanner in = new Scanner(System.in);
			
			System.out.println("Digita a: ");
			float a = floatFullProof(in);
			System.out.println("Digita x: ");
			float x = floatFullProof(in);
			System.out.println("Digita b: ");
			float b = floatFullProof(in);
			System.out.println("Digita y: ");
			float y = floatFullProof(in);

			numeroComplesso ax = new numeroComplesso(a, x);
			numeroComplesso by = new numeroComplesso(b, y);

			System.out.println("coniugato ax " + OperazioniNumeriComplessi.getConiugato(ax).getNumeroComplesso());
			System.out.println("coniugato by " + OperazioniNumeriComplessi.getConiugato(by).getNumeroComplesso());
			System.out.println("Somma " + OperazioniNumeriComplessi.sommaComplessa(ax, by).getNumeroComplesso());
			System.out.println(
					"differenza ax - by " + OperazioniNumeriComplessi.diffrenzaComplessa(ax, by).getNumeroComplesso());
			System.out.println(
					"differenza by - ax " + OperazioniNumeriComplessi.diffrenzaComplessa(by, ax).getNumeroComplesso());
			System.out.println("prodotto" + OperazioniNumeriComplessi.prodottoComplesso(ax, by).getNumeroComplesso());
			System.out.println(
					"quoziente ax/by " + OperazioniNumeriComplessi.quozienteComplesso(ax, by).getNumeroComplesso());
			System.out.println(
					"quoziente by/ax " + OperazioniNumeriComplessi.quozienteComplesso(by, ax).getNumeroComplesso());
		}
	}

	private static float floatFullProof(Scanner in) {
		boolean gotError = false;
		float f = 0;
		do {
			gotError = false;
			try {
				f = in.nextFloat();
			} catch (Exception e) {
				System.err.println("input non valido riprovare");
				gotError = true;
			}
		} while (!gotError);
		return f;
	}

}

class numeroComplesso {
	private float parteReale;
	private float parteImmaginaria;
	private float divisore = 1;
	private boolean èDivisa = false;

	public numeroComplesso(float parteReale, float parteImmaginaria) {
		this.parteReale = parteReale;
		this.parteImmaginaria = parteImmaginaria;
	}

	public float getParteReale() {
		return parteReale / getDivisore();
	}

	public void setParteReale(float parteReale) {
		this.parteReale = parteReale;
	}

	public float getParteImmaginaria() {
		return parteImmaginaria / getDivisore();
	}

	public void setParteImmaginaria(float parteImmaginaria) {
		this.parteImmaginaria = parteImmaginaria;
	}

	public String getNumeroComplesso() {
		return parteReale + (èDivisa ? "/" + getDivisore() : "") + " + i(" + parteImmaginaria
				+ (èDivisa ? "/" + getDivisore() : "") + ")";
	}

	public float getDivisore() {
		return divisore;
	}

	public void setDivisore(float divisore) {
		this.divisore = divisore;
	}

	public static class OperazioniNumeriComplessi {

		private OperazioniNumeriComplessi() {

		}
		// avendo a + ix e b + iy

		// somma = a+b + i(x+y)
		public static numeroComplesso sommaComplessa(numeroComplesso ax, numeroComplesso by) {
			float parteReale = ax.getParteReale() + by.getParteReale();
			float parteImmaginaria = ax.getParteImmaginaria() + by.getParteImmaginaria();
			return new numeroComplesso(parteReale, parteImmaginaria);

		}

		// differenza = a-b + i(x-y)
		public static numeroComplesso diffrenzaComplessa(numeroComplesso ax, numeroComplesso by) {
			float parteReale = ax.getParteReale() - by.getParteReale();
			float parteImmaginaria = ax.getParteImmaginaria() - by.getParteImmaginaria();
			return new numeroComplesso(parteReale, parteImmaginaria);
		}

		// prodotto = a*b - x*y + i(b*x + a*y)
		public static numeroComplesso prodottoComplesso(numeroComplesso ax, numeroComplesso by) {
			float parteReale = ax.getParteReale() * by.getParteReale()
					- ax.getParteImmaginaria() * by.getParteImmaginaria();
			float parteImmaginaria = by.getParteReale() * ax.getParteImmaginaria()
					+ ax.getParteReale() * by.getParteImmaginaria();
			return new numeroComplesso(parteReale, parteImmaginaria);
		}

		// quoziente = (a + ix / b + iy) * (coniugato del divisore/coniugato del
		// divisore) cioè (b - ix/b - ix)
		// il dividendo è un normale prodotto tra numeri complessi
		// il divisore è la somma per differenza del numero complesso quindi b^2 - y^2 *
		// (i^2 che è uguale a -1)
		// verificare che il divisore sia diverso da zeri
		public static numeroComplesso quozienteComplesso(numeroComplesso ax, numeroComplesso by) {
			numeroComplesso dividendo = OperazioniNumeriComplessi.prodottoComplesso(ax,
					OperazioniNumeriComplessi.getConiugato(by));
			numeroComplesso divisore = SommaPerDifferenza(by);
			if (divisore.getParteReale() == 0) {
				System.err.print("Divisore pari a zero");
				divisore = new numeroComplesso(1f, 0f);
			}
			dividendo.èDivisa = true;
			dividendo.setDivisore(divisore.getParteReale());
			return dividendo;
		}

		public static numeroComplesso SommaPerDifferenza(numeroComplesso by) {
			return new numeroComplesso(
					((by.getParteReale() * OperazioniNumeriComplessi.getConiugato(by).getParteReale())
							- (OperazioniNumeriComplessi.getConiugato(by).getParteImmaginaria()
									* OperazioniNumeriComplessi.getConiugato(by).getParteImmaginaria()) * -1),
					0);
		}

		public static numeroComplesso getConiugato(numeroComplesso nc) {
			return new numeroComplesso(nc.getParteReale(), -1 * nc.getParteImmaginaria());
		}
	}

}
