package junit6.util;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.Timeout;

public class TimeoutRuleTest {
	@Rule
	// Tạo file và folder tạm thời sau khi test xong sẽ bị xoá
	public Timeout timeout = Timeout.seconds(2);
	
	 @Test
	    public void testA() throws Exception {
	        try {
	            // Do normal task
	            TimeUnit.MILLISECONDS.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	 
	    @Test
	    public void testB() throws Exception {
	        try {
	            // Do heavy task
	            TimeUnit.SECONDS.sleep(3);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
}
