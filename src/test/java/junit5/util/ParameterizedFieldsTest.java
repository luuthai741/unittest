package junit5.util;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import junit.util.MathUtil;

@RunWith(Parameterized.class)
public class ParameterizedFieldsTest {
	@Parameter(value = 0)
	public int number;
	@Parameter(value = 1)
	public int expected;

	@Parameters(name = "Test {index}: Fibonacci({0}) = {1}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 } });
	}
	
	@Test
	public void test() {
		Assert.assertEquals(expected, MathUtil.fibonaci(number));
	}
}	
