package ro.ase.cts.clase;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.reader.Reader;

public class UniversalReader {

//punct de legatura catre readerele noastre
	
	public static List<Aplicant> readAplicants(Reader reader) throws FileNotFoundException{
		return reader.readAplicants();
		
	}
}
