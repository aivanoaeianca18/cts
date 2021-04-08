package ro.ase.cts.decorator.clase;

public class Bilet implements BiletAbstract{

	private String numeGazda;
	private String numeOaspeti;
	private String numeClienti;
	
	public Bilet(String numeGazda, String numeOaspeti, String numeClienti) {
		super();
		this.numeGazda = numeGazda;
		this.numeOaspeti = numeOaspeti;
		this.numeClienti = numeClienti;
	}

	public String getNumeGazda() {
		return numeGazda;
	}

	public void setNumeGazda(String numeGazda) {
		this.numeGazda = numeGazda;
	}

	public String getNumeOaspeti() {
		return numeOaspeti;
	}

	public void setNumeOaspeti(String numeOaspeti) {
		this.numeOaspeti = numeOaspeti;
	}

	public String getNumeClienti() {
		return numeClienti;
	}

	public void setNumeClienti(String numeClienti) {
		this.numeClienti = numeClienti;
	}

	@Override
	public void rezervaBilet() {
		System.out.println(numeClienti+"  are bilet la meciul "+ numeGazda+  " cu "+numeOaspeti);
		
	}
	

}
