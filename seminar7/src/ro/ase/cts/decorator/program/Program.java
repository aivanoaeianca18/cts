package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.Bilet;
import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorConcret;
import ro.ase.cts.decorator.clase.DecoratorConcretB;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bilet bilet=new Bilet("FCSB","Dinamo", "Anca");
		bilet.rezervaBilet();
		System.out.println();
		DecoratorConcret decorator=new DecoratorConcret(bilet);
		decorator.rezervaBilet();
		System.out.println();
		DecoratorConcretB decoratorLMA=new DecoratorConcretB(bilet);
		decoratorLMA.rezervaBilet();
		//daca joaca echipa gazda intr=o zi de sarbatoare
		System.out.println();
		DecoratorAbstract decoratorMix=new DecoratorConcretB(decorator);
		decoratorMix.rezervaBilet();
		
	}

}
