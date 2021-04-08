package ro.ase.cts.decorator.clase;

public class DecoratorConcret extends DecoratorAbstract{
	//decorator cu mesaj sustinere
	
	public DecoratorConcret(BiletAbstract biletAbstract) {
		super(biletAbstract);
		// TODO Auto-generated constructor stub
	
	}
	
	@Override
	public void rezervaBilet() {
		super.rezervaBilet();
		System.out.println("Sustinem "+((Bilet)(super.getBiletAbstract())).getNumeGazda());
	}
	

}
