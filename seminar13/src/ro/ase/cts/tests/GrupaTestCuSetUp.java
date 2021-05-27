package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class GrupaTestCuSetUp {
	Grupa grupa;
	
	@Before
	public void setUp() throws Exception{
		grupa=new Grupa(1076);
		for(int i=0;i<30;i++) {
			Student student=new Student("Anca");
			student.adaugaNota(5);
			student.adaugaNota(5);
			student.adaugaNota(6);
			student.adaugaNota(5);
			student.adaugaNota(5);
			student.adaugaNota(6);
			student.adaugaNota(5);
			student.adaugaNota(5);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<5;i++) {
			Student student=new Student("Ana");
			student.adaugaNota(4);
			student.adaugaNota(5);
			student.adaugaNota(6);
			student.adaugaNota(5);
			student.adaugaNota(5);
			student.adaugaNota(6);
			student.adaugaNota(4);
			student.adaugaNota(5);
			grupa.adaugaStudent(student);
		}
	}
	
	@Test(timeout=500)
	public void testPromovabilitatePerformance() {
		grupa.getPromovabilitate();
	}
}
