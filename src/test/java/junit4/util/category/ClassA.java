package junit4.util.category;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ClassA {

	@Category(PerformanceTests.class)
	@Test
	public void testA1() {
		Assert.assertTrue(true);
	}

	@Category({ PerformanceTests.class, RegressionTests.class })
	@Test
	public void testA2() {
		Assert.assertTrue(true);
	}

	@Test
	public void testA3() {
		Assert.assertTrue(true);
	}
}
