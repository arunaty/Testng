package Testng_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGGrouping2 {

	@Test (priority=1,groups="group2")
	public void testCase5()
	{
		Reporter.log("Running Testcase 5 from group 2",true);
	}
	@Test (priority=1,groups="group1")
	public void testCase6()
	{
		Reporter.log("Running Testcase 6 from group 1",true);
	}
	@Test (priority=1,groups="group2")
	public void testCase7()
	{
		Reporter.log("Running Testcase 7 from group 2",true);
	}
	@Test (priority=1,groups="group1")
	public void testCase8()
	{
		Reporter.log("Running Testcase 8 from group 1",true);
	}
	
}
