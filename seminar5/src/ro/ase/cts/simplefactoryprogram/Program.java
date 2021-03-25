package ro.ase.cts.simplefactoryprogram;

import ro.ase.cts.simplefactoryclase.Jucator;
import ro.ase.cts.simplefactoryclase.JucatorFactory;
import ro.ase.cts.simplefactoryclase.TipJucator;

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
