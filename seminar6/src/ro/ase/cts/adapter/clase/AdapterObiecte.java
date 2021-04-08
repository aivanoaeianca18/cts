package ro.ase.cts.adapter.clase;

public class AdapterObiecte implements BiletOnline{
	
	//pt a implementa cele 2 metode, ne trebuie un ob de tip bilet
	private Bilet bilet;
	

	public AdapterObiecte(Bilet bilet) {
		super();
		this.bilet = bilet;
	}

	@Override
	public void vindeBilet() {
		bilet.vinde();
		
	}

	@Override
	public void rezervaBilet() {
		bilet.rezerva();
		
	}

}
