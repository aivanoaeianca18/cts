package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.clase.Student;
import ro.ase.cts.dubluri.StudentFake;
import ro.ase.cts.dubluri.StudentStub;
import ro.ase.cts.tests.categorii.TesteGetPromovabilitate;

public class TestGrupaWithFake {

	Grupa grupa;
	@Test
	@Category(TesteGetPromovabilitate.class)
	public void testGetPromovabilitateRight() {
		grupa=new Grupa(1077);
		for(int i=0;i<8;i++) {
			StudentFake student=new StudentFake();
			student.setValoareGetAreRestante(false);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<2;i++) {
			StudentFake student=new StudentFake();
			student.setValoareGetAreRestante(true);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.8,grupa.getPromovabilitate(),0.01);
	}

}
