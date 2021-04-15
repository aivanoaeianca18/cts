package ro.ase.cts.proxy.clase;

public class Proxy implements IOperatorRezervare{
	private OperatorRezervare operatorRezervare;
	private int numarMinimPersoane;
	
	
	
	
	public Proxy(OperatorRezervare operatorRezervare, int numarMinimPersoane) {
		super();
		this.operatorRezervare = operatorRezervare;
		this.numarMinimPersoane = numarMinimPersoane;
	}




	@Override
	public void rezerva(int nrPersoane) {
		if(nrPersoane>numarMinimPersoane) {
			operatorRezervare.rezerva(nrPersoane);
		}else {
			System.out.println("Nu se poate realiza rezervarea pentru "+nrPersoane);
		}
		
	}
	
	

}
