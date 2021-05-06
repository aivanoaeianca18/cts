package ro.ase.cts.chain.clase;

public class ContDeCredit extends Cont{

	public ContDeCredit(String detinator, float sold) {
		super(detinator, sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(super.getSold() > suma) {
			System.out.println("S-a realizat plata de " + suma + " RON, din contul de credit.");
			super.setSold(super.getSold() - suma);
		} else {
			super.getSuccesor().realizeazaPlata(suma);
		}
		
	}

}
