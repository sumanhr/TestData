package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample1 {
		@Test(priority=2)
		public void test1()
		{
			Reporter.log("hello",true);
		}
	    @Test(priority=1)
	    public void test2()
		{
			Reporter.log("bye",true);
		}

}
