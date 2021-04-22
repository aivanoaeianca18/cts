package ro.ase.cts.state.clase;

public class Masa {
private int numar;
private Stare stare;

public Masa(int numar) {
	super();
	this.numar = numar;
	this.stare = new Libera();
}

public int getNumar() {
	return numar;
}

public void setNumar(int numar) {
	this.numar = numar;
}

public Stare getStare() {
	return stare;
}

void setStare(Stare stare) {//fara public ca sa nu fie accesibil in main
	this.stare = stare;
}

//3 request uri
public void rezervaMasa() {
	Rezervata rezervata=new Rezervata();
	rezervata.schimbaStare(this);
}

public void ocupaMasa() {
	Ocupata ocupata=new Ocupata();
	ocupata.schimbaStare(this);
	
}

public void elibereazaMasa() {
	Libera libera=new Libera();
	libera.schimbaStare(this);
	
}


}
