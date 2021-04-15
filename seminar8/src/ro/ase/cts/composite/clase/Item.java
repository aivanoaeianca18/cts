package ro.ase.cts.composite.clase;

public class Item implements ComponentaMeniu{
	private String numeItem;
	
	

	public Item(String numeItem) {
		super();
		this.numeItem = numeItem;
	}

	@Override
	public void adaugareNod(ComponentaMeniu componenta) {
		throw new IllegalArgumentException("Metoda nu este implementata");
		
	}

	@Override
	public void stergereNod(ComponentaMeniu componenta) {
		throw new IllegalArgumentException("Metoda nu este implementata");
		
	}

	@Override
	public void afiseazaInformatii() {
		System.out.println("Item "+numeItem);
		
	}

	@Override
	public ComponentaMeniu getComponenta(int index) throws Exception {
		throw new IllegalArgumentException("Metoda nu este implementata");
	}
	

}
