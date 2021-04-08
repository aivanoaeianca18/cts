package ro.ase.cts.adapter.clase;

public class AdapterBilet extends Bilet implements BiletOnline{
	//adapter de clase

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
