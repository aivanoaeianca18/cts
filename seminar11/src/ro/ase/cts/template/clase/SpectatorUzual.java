package ro.ase.cts.template.clase;

public class SpectatorUzual extends TemplateIntrareStadion{
	private String nume;

	public SpectatorUzual(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareCoada() {
		System.out.println("Spectatorul "+nume+" s-a asezat la coada");
		
	}

	@Override
	public void prezentareBilet() {
		System.out.println("Spectatorul "+nume+" a prezentat biletul");
		
	}

	@Override
	public void controlCorporal() {
		System.out.println("Spectatorul "+nume+" a fost controlat");
		
	}

	@Override
	public void ocupareLoc() {
		System.out.println("Spectatorul "+nume+" a ocupat locul");
		
	}
	

}
