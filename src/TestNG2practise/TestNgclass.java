package TestNG2practise;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgclass extends Testng_Base_Class {
	// globally declare the object of classes

	page1 p1;
	page2 p2;
	page3 p3;
	page4 p4;

	// open the browser
	@BeforeClass
	public void openbrowser() throws IOException, InterruptedException {
		intilizebrowser();
		p1 = new page1(driver);
		p2 = new page2(driver);
		p3 = new page3(driver);
		p4 = new page4(driver);

		p1.user(TestNG_utilityclass.getTD(0, 0));
		p1.password(TestNG_utilityclass.getTD(0, 1));
		p1.signin();
		Thread.sleep(5000);
		p2.pin(TestNG_utilityclass.getTD(0, 2));
		Thread.sleep(8000);
		p3.wcbtn();
	}

	@Test
	public void verifyusername() throws EncryptedDocumentException, IOException {

		String act = p4.verifyuser();
		Assert.assertEquals(act, TestNG_utilityclass.getTD(0, 3));
		Reporter.log("Test case is pass: user verified", true);

	}

}
