package junit6.util;

import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Test;

public class ClassRuleTest {
	@ClassRule
	public static DatabaseExternalResource db = new DatabaseExternalResource();
	
	  @Test
	    public void testInsert() {
	        Assert.assertEquals(true, db.getConnection().insert());
	    }
	 
	    @Test
	    public void testUpdate() {
	        Assert.assertEquals(true, db.getConnection().update());
	    }
}
