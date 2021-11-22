package junit1.util;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import junit.util.MathUtil;

public class MathUltilTest {
	@Test
	public void divide_SixDividedByTwo_ReturnThree() {
		final int expected = 3;

		final int actual = MathUtil.divide(6, 2);

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void divide_OneDividedByTwo_ReturnZero() {
		final int expected = 2;

		final int actual = MathUtil.divide(1, 2);

		Assert.assertEquals(expected, actual);
	}

	@Test(expected = IllegalArgumentException.class)
	@Ignore
	public void divide_OneDividedByZero_ThrowsIllegalArgumentException() {
		MathUtil.divide(1, 0);
	}

	@Test
	public void add_SixAddedByTwo_ReturnEight() {
		final int expected = 8;

		final int actual = MathUtil.sum(6, 2);

		Assert.assertEquals(expected, actual);
	}
	@Test
	public void urcl() {
		final int expected = 5;

		final int actual = MathUtil.ucln(10, 5);

		Assert.assertEquals(expected, actual);
	}
}
