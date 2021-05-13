package ro.ase.cts.observer.main;

import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.ManagerSala;
import ro.ase.cts.observer.clase.Subiect;

public class Main {

	public static void main(String[] args) {
		ManagerSala manager=new ManagerSala();
		Client client1=new Client("Anca");
		Client client2=new Client("Ana");
		Client client3=new Client("Anda");
		
		manager.adaugaObserver(client1);
		manager.adaugaObserver(client2);
		manager.adaugaObserver(client3);
		manager.anuntaMeciFotbal();
		
		manager.stergeObserver(client3);
		manager.anuntaMeciVolei();
		
		
	}

}
