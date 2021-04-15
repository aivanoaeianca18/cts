package ro.ase.cts.flyweight.clase;

public class Rezervare {
private int nrMasa;
private int nrPersoane;
private int oraRezervare;
public Rezervare(int nrMasa, int nrPersoane, int oraRezervare) {
	super();
	this.nrMasa = nrMasa;
	this.nrPersoane = nrPersoane;
	this.oraRezervare = oraRezervare;
}
@Override
public String toString() {
	return "Rezervare [nrMasa=" + nrMasa + ", nrPersoane=" + nrPersoane + ", oraRezervare=" + oraRezervare + "]";
}



}
