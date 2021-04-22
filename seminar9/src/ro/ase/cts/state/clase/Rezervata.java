package ro.ase.cts.state.clase;

public class Rezervata implements Stare{

	@Override
	public void schimbaStare(Masa masa) {
		if(masa.getStare() instanceof Libera) {
			System.out.println("Ati rezervat masa cu codul "+masa.getNumar());
			masa.setStare(this);
		}else {
			System.out.println("Masa cu codul "+masa.getNumar()+" nu poate fi rezervata");
		}
		
	}

}
