package junit4.util.category;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category({ PerformanceTests.class, RegressionTests.class })
public class ClassC {
	@Test
	public void test_C1() {
		Assert.assertTrue(true);
	}

	@Category(IntegrationTests.class)
	@Test
	public void test_C2() {
		Assert.assertTrue(true);
	}
}
