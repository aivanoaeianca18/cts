package ro.ase.cts.factorymethod.program;

import ro.ase.cts.factorymethod.clase.AtacantFactory;
import ro.ase.cts.factorymethod.clase.Jucator;
import ro.ase.cts.factorymethod.clase.JucatorFactory;
import ro.ase.cts.factorymethod.clase.MijlocasFactory;
import ro.ase.cts.factorymethod.clase.PortarFactory;

public class Program {
	
	public static void printeazaJucator(JucatorFactory fabrica, String nume) {
		Jucator jucator1=fabrica.creareJucator(nume);
		System.out.println(jucator1);
	}

	public static void main(String[] args) {
		
		printeazaJucator(new PortarFactory(),"Neuer");
		printeazaJucator(new AtacantFactory(), "Ronaldo");
		printeazaJucator(new MijlocasFactory(), "Neymar");
	}

}
