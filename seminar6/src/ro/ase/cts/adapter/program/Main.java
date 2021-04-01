package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.clase.AdapterBilet;
import ro.ase.cts.adapter.clase.Bilet;
import ro.ase.cts.adapter.clase.BiletOnline;

public class Main {

	public static void rezervaSiVindeBiletOnline(BiletOnline biletOnline) {
		biletOnline.rezervaBilet();
		biletOnline.vindeBilet();
		
	}
	
	public static void rezervaSiVindeBiletLaCasa(Bilet bilet) {//exemplu-in plus
		bilet.rezerva();
		bilet.vinde();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bilet bilet=new Bilet(30.3f);
		rezervaSiVindeBiletLaCasa(bilet);//exemplu-in plus
		BiletOnline biletOnline=new AdapterBilet(41.7f);
		rezervaSiVindeBiletOnline(biletOnline);
	}

}
