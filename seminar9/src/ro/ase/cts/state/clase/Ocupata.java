package ro.ase.cts.state.clase;

public class Ocupata implements Stare{

	@Override
	public void schimbaStare(Masa masa) {
		if(!(masa.getStare() instanceof Ocupata)) {
			System.out.println("Ati ocupat masa cu codul "+masa.getNumar());
			masa.setStare(this);
		}else {
			System.out.println("Masa cu codul "+masa.getNumar()+" nu poate fi ocupata");
		}
		
	}

}
