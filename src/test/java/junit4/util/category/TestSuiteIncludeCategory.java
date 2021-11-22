package junit4.util.category;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@Categories.IncludeCategory(IntegrationTests.class)
@SuiteClasses({ClassA.class,ClassB.class,ClassC.class})
public class TestSuiteIncludeCategory {

}
