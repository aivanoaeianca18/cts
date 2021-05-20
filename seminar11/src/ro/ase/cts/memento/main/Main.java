package ro.ase.cts.memento.main;

import ro.ase.cts.memento.clase.ManagerMemento;
import ro.ase.cts.memento.clase.MeciJucat;

public class Main {

	public static void main(String[] args) {
		MeciJucat meciJucat=new MeciJucat(
				500,"Steaua","Dinamo",430,100,43);
		ManagerMemento manager=new ManagerMemento();
		manager.adaugaMemento(meciJucat.salvareInformatii());
		meciJucat.setNrSpectatori(300);
		meciJucat.setEchipaGazda("Rapid");
		meciJucat.setEchipaOaspeti("Chiajna");
		manager.adaugaMemento(meciJucat.salvareInformatii());
		
		System.out.println(meciJucat.toString());
		meciJucat.revenire(manager.getMemento(0));
		System.out.println(meciJucat.toString());

	}

}
