package Testng_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng_Keywords {

	// Keywords are use with the annotation in testng framework.
	// syntax is @Test(keyword1=value,keyword2=value)

	// set priority to run at which after by default it will be alphabetically a to
	// z 0-9
	// @Test(priority=1)
	@Test(priority = 2)
	// test ng annotations
	public void testCase1() // this is testcase or test method
	{

		Reporter.log("Running the Testng method 1 with keyword priority= 1 ", true);

	}

	@Test(priority = 1)
	public void testCase2() // this is testcase or test method
	{

		Reporter.log("Running the Testng method 1 with keyword priority= 2", true);

	}
	
	@Test(timeOut=1000)//use to set a timeout out max time before methos should excuate
	public void testCase3() throws InterruptedException // this is testcase or test method
	{
		Thread.sleep(2000);//for example only
		Reporter.log("Running the Testng method 1 with keyword priority= 2", true);

	}
	
	
	
}
