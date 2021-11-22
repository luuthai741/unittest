package junit5.util;

import org.junit.Assert;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.runner.RunWith;

import junit.util.MathUtil;

@RunWith(Theories.class)
public class TheoryAndDataPoints2 {
	@Theory
	public void test(@TestedOn(ints = {1,4,3,2}) int numbers1,
			@TestedOn(ints = {0,2}) int numbers2
			) {
		System.out.println(String.format("Testing with %d and %d", numbers1, numbers2));
		Assert.assertTrue(MathUtil.checkGreaterThan(numbers1, numbers2));
	}
}
