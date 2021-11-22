package junit5.util;

import org.junit.Assert;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import junit.util.MathUtil;

@RunWith(Theories.class)
public class TheoryAndDataPoints1 {
	@DataPoints
	public static int[][] datapoints() {
		return new int[][] { { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 } };
	}

	@Theory
	public void test(final int inputs[]) {
		System.out.println(String.format("Testing with %d and %d", inputs[0], inputs[1]));
		Assert.assertEquals(inputs[1], MathUtil.fibonaci(inputs[0]));
	}
}
