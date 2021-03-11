package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
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
			for(Aplicant angajat:listaAplicanti) {
				System.out.println(angajat.toString());
				System.out.println(angajat.getSumaFinantata());
				
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
