package junit2.util;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;
import org.junit.runners.model.TestTimedOutException;

import junit.util.TaskUtil;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TimeOut {
	@Rule
	public Timeout timeout = Timeout.seconds(8);
	
	@Test
	public void task2() {
		int expected = 1;
		int result = TaskUtil.doNormalTask();
		Assert.assertEquals(expected, result);
	}
	@Test(expected = TestTimedOutException.class)
	public void task1() {
		int expected = 1;
		int result = TaskUtil.doHeavyTask();
		Assert.assertEquals(expected, result);
	}
}
