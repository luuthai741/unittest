package junit7.util;

import static org.junit.Assert.assertThat;

import org.hamcrest.number.IsCloseTo;
import org.junit.Test;

public class NumberMatcher {
	@Test
	public void closeToTest() {
		double actual = 1.3;
		double operand = 1;
		double error = 0.5;

		assertThat(actual, IsCloseTo.closeTo(operand, error));
	}

}
