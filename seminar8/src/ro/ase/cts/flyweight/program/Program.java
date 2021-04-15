package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.FabricaFlyweight;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		Rezervare rez1=new Rezervare(3,4,2);
		Rezervare rez2=new Rezervare(2,5,2);
		Rezervare rez3=new Rezervare(5,3,4);
		
		//clientii obt prin fabrica flyweight
		FabricaFlyweight fabFlyw=new FabricaFlyweight();
		Client client=(Client) fabFlyw.getClient("074049498");
		client.afiseazaInformatii(rez1);
		
		Client client2=(Client) fabFlyw.getClient("070000000");
		client2.afiseazaInformatii(rez2);

		fabFlyw.getClient("070000000").afiseazaInformatii(rez3);
		
	}

}
