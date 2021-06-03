package ro.ase.cts.tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.tests.categorii.TesteGetPromovabilitate;
import ro.ase.cts.tests.categorii.TesteNormale;

@RunWith(Categories.class)
@SuiteClasses({ GrupaTest.class, GrupaTestCuSetUp.class, TestGrupaWithDummy.class, TestGrupaWithFake.class,
		TestGrupaWithStub.class })
@IncludeCategory(TesteGetPromovabilitate.class)
@ExcludeCategory(TesteGetPromovabilitate.class)
public class SuitaCustom {

}
