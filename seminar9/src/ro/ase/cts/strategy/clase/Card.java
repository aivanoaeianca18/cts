package ro.ase.cts.strategy.clase;

public class Card implements ModalitatePlata{
	private float sold;

	
	
	public Card(float sold) {
		super();
		this.sold = sold;
	}



	@Override
	public void achita(float suma) {
		if(suma<=sold) {
			System.out.println("S-a realziat plata cu cardul in valoare de "+suma+" lei");
			sold=sold-suma;
		}else {
			System.out.println("Fonduri insuficiente");
		}
		
		
	}

}
