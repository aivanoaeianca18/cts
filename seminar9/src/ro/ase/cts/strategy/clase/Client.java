package ro.ase.cts.strategy.clase;

public class Client {

	private String nume;
	private ModalitatePlata modalitatePlata;
	
	
	
	public Client(String nume, ModalitatePlata modalitatePlata) {
		super();
		this.nume = nume;
		this.modalitatePlata = modalitatePlata;
	}



	public void setModalitatePlata(ModalitatePlata modalitatePlata) {
		this.modalitatePlata = modalitatePlata;
	}
	
	public void platesteNota(float suma) {
		System.out.println(this.nume+" are de platit nota in valoare de "+ suma+" lei");
		modalitatePlata.achita(suma);//plateste cash/card e decis la runtime
	}
	
	
	
}
