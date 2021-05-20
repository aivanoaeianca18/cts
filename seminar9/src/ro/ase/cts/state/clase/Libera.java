package ro.ase.cts.state.clase;

public class Libera implements Stare{

	@Override
	public void schimbaStare(Masa masa) {
		if(masa.getStare() instanceof Libera) {
			System.out.println("Masa cu codul "+masa.getNumar()+" a fost eliberata");
			masa.setStare(this);
		}else {
			System.out.println("Masa cu codul "+masa.getNumar()+" nu poate fi eliberata");
		}
		
	}

}
