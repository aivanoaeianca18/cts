package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTests {
	//un test case

	@Test
	public void testConstructorCuParametru() {
		//testam constructor
		String nume="Anca";
		Student student=new Student(nume);
		
//		if(nume!= student.getNume()) {
//			fail("Numele nu este corect");
//		}
//		ild if-uri, face asertii
		//st expected, dr ceea ce avem setat
		assertEquals(nume, student.getNume());
		
	}
	
	@Test
	public void testConstructorFaraParametru() {
		Student student=new Student();
		assertEquals("Student",student.getNume());
	}
	
	@Test
	public void testAreRestanta() {
		Student student=new Student();
		student.adaugaNota(3);
		student.adaugaNota(10);
		assertTrue("Studentul care are restanta este marcat ca nu are restanta",student.areRestante());
	}
	
	@Test
	public void testNuAreRestanta() {
		Student student=new Student();
		student.adaugaNota(10);
		student.adaugaNota(10);
		//cazul true true in Student
		assertFalse("Studentul care nu are restanta este marcat ca are restanta",student.areRestante());
	}
	
	@Test
	public void testAdaugareNota() {
		Student student=new Student();
		student.adaugaNota(10);
		assertEquals(1,student.getNote().size());
	}
	
	@Test
	public void testNotaAdaugataCorecta() {
		Student student=new Student();
		int nota=10;
		student.adaugaNota(nota);
		assertEquals(nota,student.getNota(0));
	}

}
