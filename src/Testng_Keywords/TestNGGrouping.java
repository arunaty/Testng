package Testng_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGGrouping {

	@Test (priority=1,groups="group1")
	public void testCase1()
	{
		Reporter.log("Running Testcase 1 from group 1",true);
	}
	@Test (priority=1,groups="group1")
	public void testCase2()
	{
		Reporter.log("Running Testcase 2 from group 1",false);
	}
	@Test (priority=1,groups="group2")
	public void testCase3()
	{
		Reporter.log("Running Testcase 3 from group 2",true);
	}
	@Test (priority=1,groups="group2")
	public void testCase4()
	{
		Reporter.log("Running Testcase 4 from group 2",true);
	}
	
}
