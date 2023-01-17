package giocoDadi;

import java.util.List;

public class dado {
	private int valoreMax, valoreAttuale, tiroAttuale = 0;
	private List<Integer> tiri;

	public dado(int valoreMax) {
		this.valoreMax = valoreMax;
		tira();
	}

	public int tira() {
		tiri.add((int) ((Math.random() * valoreMax) +1));
		tiroAttuale++;
		return valoreAttuale;
	}

	public void setValoreMax(int valoreMax) {
		this.valoreMax = valoreMax;
	}

	public int getValoreMax() {
		return valoreMax;
	}

	public int getValoreAttuale() {
		return valoreAttuale;
	}

	public int getTiroAttuale() {
		return tiroAttuale;
	}

	public List<Integer> getListaTiri() {
		return tiri;
	}

	public int getTiroN(int n) {
		if (n > tiri.size()) {
			System.err.println("tiro inesistente");
			return n;
		} else if (n < 0) {
			System.err.println("tiro inesistente");
			return n;
		} else {
			return tiri.get(n);
		}
	}
}
