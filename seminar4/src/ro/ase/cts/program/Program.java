package ro.ase.cts.program;

import ro.ase.cts.clase.Academie;
import ro.ase.cts.clase.ManagerSpital;
import ro.ase.cts.clase.ManagerSpitalLazy;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//clasa normala
		//ManagerSpital manager1=new ManagerSpital("Manager 1", 42, 12345);
		//ManagerSpital manager2=new ManagerSpital("Manager 2", 45, 67890);
		
		//singleton
		//eager
		ManagerSpital manager1=ManagerSpital.getInstance();
		ManagerSpital manager2=ManagerSpital.getInstance();
		
		//lazy
		ManagerSpitalLazy manager3=ManagerSpitalLazy.getInstance("Andrei", 57, 23232);
		ManagerSpitalLazy manager4=ManagerSpitalLazy.getInstance("Mihai", 51, 24151);
		
		//aceeasi instanta este modificata prin setteri
		manager3.setVarsta(58);
		manager4.setNume("Mihaela");
		
		//Aivanoaei Anca-> clasa Academie
		Academie academie1=Academie.getInstance("ASE", 20000, 22.2f);
		Academie academie2=Academie.getInstance("Militara", 35000, 78.56f);
		
		academie1.setDenumire("de Studii Economice");
		academie2.setBuget(46.23f);
		
		System.out.println(manager1.toString());
		System.out.println(manager2.toString());
		System.out.println(manager3.toString());
		System.out.println(manager4.toString());
		
		System.out.println(academie1.toString());
		System.out.println(academie2.toString());
	}

}
