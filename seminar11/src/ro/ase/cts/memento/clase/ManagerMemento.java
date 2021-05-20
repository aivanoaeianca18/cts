package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
	private List<Memento> lista;
	
	
	
	public ManagerMemento() {
		super();
		this.lista = new ArrayList<>();
	}

	public void adaugaMemento(Memento memento) {
		lista.add(memento);
		
	}
	
	public Memento getMemento(int pozitieMemento) {
		if(pozitieMemento<lista.size()) {
			return lista.get(pozitieMemento);
		}else {
			throw new IllegalArgumentException("Nu se afla in lista.");
		}
		
	}
}
