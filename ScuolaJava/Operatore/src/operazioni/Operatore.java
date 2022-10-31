package operazioni;

public class Operatore {
	private int op1;
	private int op2;
	
	public Operatore(int operatore1, int operatore2) {
		trovaMaggiore(operatore1,operatore2);
	}
	
	public void trovaMaggiore(int operatore1, int operatore2) {
		if(operatore1>operatore2) {
			op1 = operatore1;
			op2 = operatore2;
		} else {
			op1 = operatore2;
			op2 = operatore1;
		}
		
	}
	
	public void setOp1(int operazione1) {
		trovaMaggiore(operazione1,op2);
	}
	
	public void setOp2(int operazione2) {
		trovaMaggiore(op1,operazione2);
	}
	
	public int getOp1() {
		return op1;
	}
	
	public int getOp2() {
		return op2;
	}
}

class Addizione extends Operatore {
	
	private int Somma;
	
	public Addizione(int operazione1, int operazioni2) {
		super(operazione1, operazioni2);
	}
	
	public void setAd1(int operazione1) {
		trovaMaggiore(operazione1,getAd2());
	}
	
	public void setAd2(int operazione2) {
		trovaMaggiore(getAd1(),operazione2);
	}
	
	public int getAd1() {
		return getOp1();
	}
	
	public int getAd2() {
		return getOp2();
	}
	
	public void cSomma() {
		Somma = getAd1() + getAd2();
	}

	public int getSomma() {
		cSomma();
		return Somma;
	}
}

class Sottrazione extends Operatore {
	
	private int Differenza;
	
	public Sottrazione(int operazione1, int operazioni2) {
		super(operazione1, operazioni2);
	}
	
	public void setSt1(int operazione1) {
		trovaMaggiore(operazione1,getSt2());
	}
	
	public void setSt2(int operazione2) {
		trovaMaggiore(getSt1(),operazione2);
	}
	
	public int getSt1() {
		return getOp1();
	}
	
	public int getSt2() {
		return getOp2();
	}
	
	public void cDifferenza() { 
		Differenza = getSt1() + getSt2(); 
	}

	public int getDifferenza() {
		cDifferenza();
		return Differenza;
	}
}
