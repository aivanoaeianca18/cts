package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Proiect;
import ro.ase.cts.clase.Student;
import ro.ase.cts.clase.UniversalReader;
import ro.ase.cts.clase.reader.StudentReader;

public class Program {

	public static void main(String[] args) {
		System.out.println(Student.getFinantare());
		System.out.println(Angajat.getFinantare());
		List<Aplicant> listaAplicanti;
		
		try {
			listaAplicanti = UniversalReader.readAplicants(new StudentReader("studenti.txt") );
			Proiect pr=new Proiect(80);
			for(Aplicant angajat:listaAplicanti) {
				System.out.println(angajat.toString());
				System.out.println(angajat.getSumaFinantata());
				angajat.afisareStatutProiect(pr);
				
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
