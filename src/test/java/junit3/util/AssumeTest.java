package junit3.util;

import org.junit.Assume;
import org.junit.Test;

public class AssumeTest {
	@Test
	public void assumeTrue() {
		Assume.assumeTrue(true);
		System.out.println("Assume true");
	}
	@Test
	public void assumeFalse() {
		Assume.assumeTrue(false);
		System.out.println("Assume false");
	}
}
