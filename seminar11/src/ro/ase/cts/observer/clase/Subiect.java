package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
	private List<Observer> lista;

	public Subiect() {
		super();
		this.lista = new ArrayList<Observer>();
	}
	
	public void adaugaObserver(Observer observer) {
		lista.add(observer);
		
	}
	
	public void stergeObserver(Observer observer) {
		lista.remove(observer);
	}
	
	public void notificaClienti(String mesaj) {
		for(Observer observer:lista) {
			observer.primesteNotificare(mesaj);
		}
	}
}
