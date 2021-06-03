package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.dubluri.StudentDummy;
import ro.ase.cts.dubluri.StudentStub;
import ro.ase.cts.tests.categorii.TesteGetPromovabilitate;

public class TestGrupaWithStub {

	Grupa grupa;
	@Test
	@Category(TesteGetPromovabilitate.class)
	public void testGetPromovabilitate() {
		//aka test de boundary superior
		grupa=new Grupa(1077);
		IStudent s1=new StudentStub();
		
		grupa.adaugaStudent(s1);
		//!!nu testam areRestatnte, ci getPromovabilitate
		assertEquals(1,grupa.getPromovabilitate(),0.01);
	}

}
