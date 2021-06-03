package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;
import ro.ase.cts.tests.categorii.TesteGetPromovabilitate;
import ro.ase.cts.tests.categorii.TesteNormale;
import ro.ase.cts.tests.categorii.TesteUrgente;

public class GrupaTest {
	
	
	//right-bicep
	@Test
	@Category(TesteUrgente.class)
	public void testConstructorRight() {
		Grupa grupa=new Grupa(1076);
		assertEquals(1076,grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorBoundaryInf() {
		Grupa grupa=new Grupa(1000);
		assertEquals(1000,grupa.getNrGrupa());
		
	}
	
	@Test
	@Category(TesteUrgente.class)
	public void testConstructorBoundarySup() {
		Grupa grupa=new Grupa(1100);
		assertEquals(1100,grupa.getNrGrupa());
	}
	
	@Test(expected=IllegalArgumentException.class)
	@Category(TesteUrgente.class)
	public void testConstructorError() {
		Grupa grupa=new Grupa(1200);
	}
	
	@Test(expected=IllegalArgumentException.class)
	@Category(TesteNormale.class)
	public void testConstructorErrorSub1000() {
		Grupa grupa=new Grupa(100);
	}
	
	@Test(timeout=500)
	public void testConstructorPerformance() {
		Grupa grupa=new Grupa(1076);
	}

	//correct
	@Test
	public void testConstructorLista() {
		Grupa grupa=new Grupa(1076);
		assertNotNull(grupa.getStudenti());
	}
	
	//right-bicep
	@Test
	@Category({TesteGetPromovabilitate.class,TesteUrgente.class})
	
	public void testPromovabilitateRight() {
		Grupa grupa=new Grupa(1076);
		for(int i=0;i<7;i++) {
			Student student=new Student("Anca");
			student.adaugaNota(4);
			student.adaugaNota(5);
			student.adaugaNota(6);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<5;i++) {
			Student student=new Student("Bianca");
			student.adaugaNota(10);
			student.adaugaNota(9);
			student.adaugaNota(8);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.41,grupa.getPromovabilitate(),0.05);
	}
	
	@Test
	@Category({TesteGetPromovabilitate.class,TesteNormale.class})
	public void testPromovabilitateBoundaryInf() {
		Grupa grupa=new Grupa(1076);
		for(int i=0;i<7;i++) {
			Student student=new Student("Anca");
			student.adaugaNota(4);
			student.adaugaNota(5);
			student.adaugaNota(6);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<5;i++) {
			Student student=new Student("Bianca");
			student.adaugaNota(10);
			student.adaugaNota(4);
			student.adaugaNota(8);
			grupa.adaugaStudent(student);
		}
		assertEquals(0,grupa.getPromovabilitate(),0.05);
	}
	
	@Test
	@Category(TesteGetPromovabilitate.class)
	public void testPromovabilitateBoundarySup() {
		Grupa grupa=new Grupa(1076);
		for(int i=0;i<7;i++) {
			Student student=new Student("Anca");
			student.adaugaNota(5);
			student.adaugaNota(5);
			student.adaugaNota(6);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<5;i++) {
			Student student=new Student("Bianca");
			student.adaugaNota(10);
			student.adaugaNota(5);
			student.adaugaNota(8);
			grupa.adaugaStudent(student);
		}
		assertEquals(1,grupa.getPromovabilitate(),0.05);
	}
	
	@Test(expected=IllegalArgumentException.class)
	@Category(TesteGetPromovabilitate.class)
	public void testPromovabilitateErrorCond(){
		//grupa fara studenti
		Grupa grupa=new Grupa(1076);
		grupa.getPromovabilitate();
		
	}
	
	
	
	
}
