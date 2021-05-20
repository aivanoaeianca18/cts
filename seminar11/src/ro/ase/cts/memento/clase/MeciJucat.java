package ro.ase.cts.memento.clase;

public class MeciJucat {
	private int nrSpectatori;
	private String echipaGazda;
	private String echipaOaspeti;
	private int nrBileteVandute;
	private int nrSticleApaVandute;
	private int nrJandarmi;
	
	public MeciJucat(int nrSpectatori, String echipaGazda, String echipaOaspeti, int nrBileteVandute,
			int nrSticleApaVandute, int nrJandarmi) {
		super();
		this.nrSpectatori = nrSpectatori;
		this.echipaGazda = echipaGazda;
		this.echipaOaspeti = echipaOaspeti;
		this.nrBileteVandute = nrBileteVandute;
		this.nrSticleApaVandute = nrSticleApaVandute;
		this.nrJandarmi = nrJandarmi;
	}
	
	public Memento salvareInformatii() {
		Memento memento=new Memento(nrSpectatori,echipaGazda,echipaOaspeti);
		return memento;
	}
	
	public void revenire(Memento memento) {
		this.nrSpectatori=memento.getNrSpectatori();
		this.echipaGazda=memento.getEchipaGazda();
		this.echipaOaspeti=memento.getEchipaOaspete();
	}

	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}

	public void setEchipaGazda(String echipaGazda) {
		this.echipaGazda = echipaGazda;
	}

	public void setEchipaOaspeti(String echipaOaspeti) {
		this.echipaOaspeti = echipaOaspeti;
	}

	public void setNrBileteVandute(int nrBileteVandute) {
		this.nrBileteVandute = nrBileteVandute;
	}

	public void setNrSticleApaVandute(int nrSticleApaVandute) {
		this.nrSticleApaVandute = nrSticleApaVandute;
	}

	public void setNrJandarmi(int nrJandarmi) {
		this.nrJandarmi = nrJandarmi;
	}

	@Override
	public String toString() {
		return "MeciJucat [nrSpectatori=" + nrSpectatori + ", echipaGazda=" + echipaGazda + ", echipaOaspeti="
				+ echipaOaspeti + ", nrBileteVandute=" + nrBileteVandute + ", nrSticleApaVandute=" + nrSticleApaVandute
				+ ", nrJandarmi=" + nrJandarmi + "]";
	}

	
	
}
