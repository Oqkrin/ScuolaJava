package giocoDadi;

public class dadoMain {

	public static void main(String[] args) {
		dado dadoPc = new dado(6);
		dado dadoGiocatore = new dado(6);
		int punteggioGiocatore = 0, punteggioPc = 0;
		punteggioPc += dadoPc.tira() + dadoPc.tira();
		System.out.println("tira due dadi");
		punteggioGiocatore += dadoGiocatore.tira() + dadoGiocatore.tira();
	}

}
