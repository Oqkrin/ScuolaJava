package numeriComplessi;

public class numeroComplesso{
	private float parteReale;
	private float parteImmaginaria;
	
	public numeroComplesso(float parteReale, float parteImmaginaria){
		this.parteReale = parteReale;
		this.parteImmaginaria = parteImmaginaria;
	}
	
	public float getParteReale() {
		return parteReale;
	}

	public void setParteReale(float parteReale) {
		this.parteReale = parteReale;
	}

	public float getParteImmaginaria() {
		return parteImmaginaria;
	}

	public void setParteImmaginaria(float parteImmaginaria) {
		this.parteImmaginaria = parteImmaginaria;
	}	
	
	public String getNumeroComplesso() {
		return parteReale + " + i" + parteImmaginaria;
	}
	
	public static class OpNC {
		
		private OpNC() {
			
		}
		//avendo a + ix e b + iy 
		
		//somma = a+b + i(x+y)
		public static numeroComplesso sommaComplessa(numeroComplesso ax,numeroComplesso by) {
			float parteReale = ax.getParteReale() + by.getParteReale();
			float parteImmaginaria = ax.getParteImmaginaria() + by.getParteImmaginaria();
			return new numeroComplesso(parteReale, parteImmaginaria);
			
		}
		
		//differenza = a-b + i(x-y)
		public static numeroComplesso diffrenzaComplessa(numeroComplesso ax,numeroComplesso by) {
			float parteReale = ax.getParteReale() - by.getParteReale();
			float parteImmaginaria = ax.getParteImmaginaria() - by.getParteImmaginaria();
			return new numeroComplesso(parteReale, parteImmaginaria);
		}
		
		//prodotto = a*b - x*y + i(b*x + a*y)
		public static numeroComplesso prodottoComplesso(numeroComplesso ax,numeroComplesso by) {
			float parteReale = ax.getParteReale() * by.getParteReale() - ax.getParteImmaginaria() * by.getParteImmaginaria();
			float parteImmaginaria = by.getParteReale() * ax.getParteImmaginaria() + ax.getParteReale() * by.getParteImmaginaria();
			return new numeroComplesso(parteReale, parteImmaginaria);
		}
		
		//quoziente = (a + ix / b + iy) * (coniugato del divisore/coniugato del divisore) cioè (b - ix/b - ix) 
		//il dividendo è un normale prodotto tra numeri complessi
		//il divisore è la somma per differenza del numero complesso quindi b^2 - y^2 * (i^2 che è uguale a -1)
		//verificare che il denominatore sia diverso da zero
		//[(a*b+x*y)/(b^2+y^2)]+[i*(b*x-a*y)/(b^2+y^2)]
		public static numeroComplesso quozienteComplesso(numeroComplesso ax,numeroComplesso by) {
			numeroComplesso dividendo = OpNC.prodottoComplesso(ax,OpNC.getConiugato(by));
			numeroComplesso divisore = SommaPerDifferenza(by);
			return new numeroComplesso(dividendo.getParteReale()/divisore.getParteReale() , dividendo.getParteImmaginaria()/divisore.getParteReale());
		}
		
		public static numeroComplesso SommaPerDifferenza(numeroComplesso by) {
			return new numeroComplesso( ((by.getParteReale() * OpNC.getConiugato(by).getParteReale()) - (by.getParteImmaginaria() * OpNC.getConiugato(by).getParteImmaginaria()) * -1) ,0);
		}
		
		public static numeroComplesso getConiugato(numeroComplesso n) {
			return new numeroComplesso(n.getParteReale(),-n.getParteImmaginaria());
		}
	}
	
}
