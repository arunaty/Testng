package Testng_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng_Test_Before_After_Class {

	@Test // test ng annotations
	public void testCase1() // this is testcase or test method
	{

		// write a test case here
		// while we want to generate a report and also we want to print it on console
		// then use
		// Reporter.log("Message-----",true/false)

		// List of anotation and it meaning
		// @Test -represent the test case/method and excucation happen in a alphabetical
		// orders
		// @BeforeMethod- this method will excuate before excectation of any test method
		// @AfterMethod - this method will excuate after excectation of all test method
		// @BeforeClass - its excucate before excecutaing the any method with
		// @BeforeMethod
		// @AfterClass - its excuate after all the methods/testcases and @AfterMethod
		// has been excuatated at last

		Reporter.log("Running the Testng method 1 with Test Anotation ", true);

	}

	@Test
	public void testCase2() // this is testcase or test method
	{

		Reporter.log("Running the Testng method 2 with Test Anotation", true);

	}
}
