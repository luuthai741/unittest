package junit4.util.category;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(PerformanceTests.class)
public class ClassB {
	@Test
	public void testB1() {
		Assert.assertTrue(true);
	}

	@Test
	public void testB2() {
		Assert.assertTrue(true);
	}
}
