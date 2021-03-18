package ro.ase.cts.program;

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
		
		
		System.out.println(manager1.toString());
		System.out.println(manager2.toString());
		System.out.println(manager3.toString());
		System.out.println(manager4.toString());
	}

}
