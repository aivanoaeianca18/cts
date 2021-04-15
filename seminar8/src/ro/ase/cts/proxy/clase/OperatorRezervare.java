package ro.ase.cts.proxy.clase;

public class OperatorRezervare implements IOperatorRezervare{

	private String numeLocal;
	
	@Override
	public void rezerva(int nrPersoane) {
		System.out.println("S-a realizat rezervarea pentru "+nrPersoane+" la "+numeLocal);
		
	}

	
	
	public OperatorRezervare(String numeLocal) {
		super();
		this.numeLocal = numeLocal;
	}



	public String getNumeLocal() {
		return numeLocal;
	}
	
	

}
