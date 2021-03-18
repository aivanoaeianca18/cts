package ro.ase.cts.clase;

public class Academie {
	private String denumire;
	private int nrStudenti;
	private float buget;
	
	private static Academie academie = null;
	
	private Academie(String denumire, int nrStudenti, float buget) {
		super();
		this.denumire = denumire;
		this.nrStudenti = nrStudenti;
		this.buget = buget;
	}
	
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	public void setNrStudenti(int nrStudenti) {
		this.nrStudenti = nrStudenti;
	}
	public void setBuget(float buget) {
		this.buget = buget;
	}

	@Override
	public String toString() {
		return "Academia " + denumire + ", cu " + nrStudenti + " studenti si buget de " + buget + " MII LEI";
	}
	
	public static synchronized Academie getInstance(String denumire, int nrStudenti, float buget) {
		if(academie == null) {
			academie=new Academie(denumire, nrStudenti,buget);
		}
		return academie;
	}
	
	
}
