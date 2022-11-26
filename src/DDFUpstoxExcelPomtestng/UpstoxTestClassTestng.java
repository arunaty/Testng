package DDFUpstoxExcelPomtestng;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UpstoxTestClassTestng {

	// declare variable globally
	WebDriver driver;
	Sheet datasheet;
	Upstoxlogin1 login1;
	Upstoxlogin2 login2;
	Upstoxlogin3 login3;
	Upstoxlogin4 login4;
	String actuser4w;
	WebDriverWait wait;

	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException {
		// get data for login from external sheet which is excel

		FileInputStream file = new FileInputStream(
				"C:\\Users\\lakha\\Desktop\\Software Testing\\Automation Testing Notes\\Selenium Practice Demo\\upstoxlogin.xlsx");
		datasheet = WorkbookFactory.create(file).getSheet("Sheet2");

		System.setProperty("webdriver.chrome.driver", "C:\\SoftwareTesting\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://login-v2.upstox.com/");
		// create objects of classes
		login1 = new Upstoxlogin1(driver);
		login2 = new Upstoxlogin2(driver);
		login3 = new Upstoxlogin3(driver);
		login4 = new Upstoxlogin4(driver);
	}

	@BeforeMethod
	public void login() throws InterruptedException {
		String username = datasheet.getRow(0).getCell(0).getStringCellValue();
		login1.setUpstoxlogin1username(username);
		String password = datasheet.getRow(0).getCell(1).getStringCellValue();
		login1.setUpstoxlogin1password(password);
		login1.clickUpstoxlogin1signBtn();
		Thread.sleep(3000);
		String gpin = datasheet.getRow(0).getCell(2).getStringCellValue();
		login2.setUpstoxlogin2pin(gpin);
		login3.clickUpstoxlogin3noBtn();
		

	}

	@Test
	public void verifyusertng() {
		actuser4w = login4.getUpstoxlogin4Userid();
		String userid = datasheet.getRow(0).getCell(3).getStringCellValue();
		Assert.assertNotEquals(userid, actuser4w);
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
		datasheet = null;
		login1 = null;
		login2 = null;
		login3 = null;
		login4 = null;
		actuser4w = null;
		// driver.quit();
		driver = null;
	}

}
