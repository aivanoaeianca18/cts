package ro.ase.cts.decorator.clase;

public class DecoratorConcretB extends DecoratorAbstract{

	public DecoratorConcretB(BiletAbstract biletAbstract) {
		super(biletAbstract);
		// TODO Auto-generated constructor stub
	}
	//mesaj la multi ani
	
	@Override
	public void rezervaBilet() {
		super.rezervaBilet();
		System.out.println("La multi ani!");
	}

}
