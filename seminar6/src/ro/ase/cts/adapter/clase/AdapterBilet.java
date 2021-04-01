package ro.ase.cts.adapter.clase;

public class AdapterBilet extends Bilet implements BiletOnline{

	public AdapterBilet(float pret) {
		super(pret);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void vindeBilet() {
		super.vinde();
		
	}

	@Override
	public void rezervaBilet() {
		super.rezerva();
		
	}

}
