package ro.ase.cts.simplefactory.program;

import ro.ase.cts.simplefactory.clase.Jucator;
import ro.ase.cts.simplefactory.clase.JucatorFactory;
import ro.ase.cts.simplefactory.clase.TipJucator;

public class Program {
	
	public static void main(String args[]) {
		
		try {
			JucatorFactory factory=new JucatorFactory();
			Jucator jucator1=factory.createJucator(TipJucator.Portar, "Neuer");
			Jucator jucator2=factory.createJucator(TipJucator.Atacant, "Messi");
			System.out.println(jucator1.toString());
			System.out.println(jucator2.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
