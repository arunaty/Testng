package UpstoxLoginTestNgWithproperyfiles;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UpstoxTestClassTestng extends UpstoxBaseClass {

	// declare variable globally
	Upstoxlogin1 login1;
	Upstoxlogin2 login2;
	Upstoxlogin3 login3;
	Upstoxlogin4 login4;
	String actuser4w;

	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException {
		//open a browser and navigate to provided urls
		invokeBrowser();
		
		// create objects of classes
		login1 = new Upstoxlogin1(driver);
		login2 = new Upstoxlogin2(driver);
		login3 = new Upstoxlogin3(driver);
		login4 = new Upstoxlogin4(driver);
	}

	@Test
	public void login() throws InterruptedException, EncryptedDocumentException, IOException {
		
		login1.setUpstoxlogin1username(UpstoxUtilityClass.getdataFromProperty("userName"));
		
		login1.setUpstoxlogin1password(UpstoxUtilityClass.getdataFromProperty("passWord"));
		login1.clickUpstoxlogin1signBtn();
		Thread.sleep(3000);
		
		login2.setUpstoxlogin2pin(UpstoxUtilityClass.getdataFromProperty("passCode"));
		
		login3.clickUpstoxlogin3noBtn();
		
		actuser4w = login4.getUpstoxlogin4Userid();

	}

	@Test(dependsOnMethods = {"login"})
	public void verifyusertng() throws EncryptedDocumentException, IOException {
		String userid = UpstoxUtilityClass.getUserLogins(0,3);
		Assert.assertEquals(userid, actuser4w);
		Reporter.log("Expected Userid = " + userid, true);
		Reporter.log("Actual Userid = " + actuser4w, true);
		Reporter.log("The User Loggined is same", true);
	}

	@Test(dependsOnMethods = {"verifyusertng"})
	public void logout() throws InterruptedException {

		login4.clickUpstoxlogin4LogoutBtn(driver, wait);
	}

	@AfterClass
	public void closeBrowser() {
		login1 = null;
		login2 = null;
		login3 = null;
		login4 = null;
		actuser4w = null;
		driver.quit();
		driver = null;
	}

}
