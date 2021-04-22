package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Card;
import ro.ase.cts.strategy.clase.Cash;
import ro.ase.cts.strategy.clase.Client;

public class Program {

	public static void main(String[] args) {
		Card card=new Card(3415.67f);
		Client client=new Client("Anca",card);
		client.platesteNota(300f);
		client.setModalitatePlata(new Cash());
		client.platesteNota(2000f);
		client.setModalitatePlata(card);
		client.platesteNota(30000f);
	}

}
