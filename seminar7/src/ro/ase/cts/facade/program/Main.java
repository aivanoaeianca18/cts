package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.BazaDeDateHuligani;
import ro.ase.cts.facade.clase.Bilet;
import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Persoana;
import ro.ase.cts.facade.clase.Politie;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persoana p1=new Persoana("Andrei", "1990000000000");
		Bilet b1=new Bilet("Andrei","1A");
		
		if(p1.getNume().equals(b1.getNume())) {
			if(Politie.esteUrmarita(p1)) {
				if(BazaDeDateHuligani.esteInListaDeHuligani(p1)) {
					System.out.println("Intrati!");
				}
			}
		}
		
		Persoana p2=new Persoana("Maria", "1990000000000");
		Bilet b2=new Bilet("Maria","2C");
		
		if(Facade.sePermiteAccesulPeStadion(p2,b2)) {
			System.out.println("Poftiti!");
		}else {
			System.out.println("Nu aveti voie!");
		}
	}
	
	

}
