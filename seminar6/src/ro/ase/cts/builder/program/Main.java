package ro.ase.cts.builder.program;

import ro.ase.cts.builder.clase.BuilderRezervareV2;
import ro.ase.cts.builder.clase.Rezervare;
import ro.ase.cts.builder.clase.RezervareBuilder;

public class Main {

	public static void main(String[] args) {
		RezervareBuilder rezervareBuilder=new RezervareBuilder();
		
		Rezervare rezervare1=rezervareBuilder.setAreBauturaInclusa(true).build();
		Rezervare rezervare2=new RezervareBuilder().setAreMuzicaAmbientala(true).setGenMuzical("rock").build();
		
		System.out.println(rezervare1);
		System.out.println(rezervare2);
		
		BuilderRezervareV2 builderV2_1=new BuilderRezervareV2();
		
		Rezervare rezervare3=builderV2_1.setAreBauturaInclusa(true).build();
		Rezervare rezervare4=builderV2_1.setAreMuzicaAmbientala(true).setGenMuzical("k pop").build();

		System.out.println(rezervare3);
		System.out.println(rezervare4);
	}

}
