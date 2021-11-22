package junit3.util;

import org.junit.Assert;
import org.junit.Test;

public class AssertTest {
	@Test
	public void assertEqual() {
		Assert.assertEquals("Test assert equal", "test", "test");
	}

	@Test
	public void assertArrayEqual() {
		String[] arr1 = { "t", "e", "s", "t" };
		String[] arr2 = { "t", "e", "s", "t" };
		Assert.assertArrayEquals("Test assert array equal", arr1, arr2);
	}
	
	@Test
	public void assertTrue() {
		Assert.assertTrue("Test assert true", true);
	}
	
	@Test
	public void assertFalse() {
		Assert.assertFalse("Test assert false", false);
	}
	
	@Test
	public void assertNull() {
		Object obj = null;
		Assert.assertNull("Test assert null",obj);
	}
	
	@Test
	public void assertNotNull() {
		Object obj = new Object();
		Assert.assertNotNull("Test assert not null",obj);
	}
	
	@Test
	public void assertSame() {
		Integer number =  Integer.valueOf(700);
		Assert.assertSame("Test assert same", number, number);
	}
	@Test
	public void assertNotSame() {
		Assert.assertNotSame("Test assert not same", new Object(), new Object());
	}
	
	@Test
	public void fail() throws Exception{
		Assert.fail("Test fail");
	}
}
