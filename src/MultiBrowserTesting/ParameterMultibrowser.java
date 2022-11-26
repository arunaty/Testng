package MultiBrowserTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import DDFUpstoxExcel.Upstoxlogin1;
import DDFUpstoxExcel.Upstoxlogin2;
import DDFUpstoxExcel.Upstoxlogin3;
import DDFUpstoxExcel.Upstoxlogin4;

public class ParameterMultibrowser {

	WebDriver driver;

	@Parameters("browsername")
	@BeforeClass
	public void openbrowser(String browsername) {
		if (browsername.equals("chrome")) {
			Reporter.log("Opening the Chrome", true);
			System.setProperty("webdriver.chrome.driver", "C:\\SoftwareTesting\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equals("firefox")) {
			Reporter.log("Opening the firefox", true);
			System.setProperty("webdriver.gecko.driver", "C:\\SoftwareTesting\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browsername.equals("opera")) {
			Reporter.log("Opening the Opera", true);
//			System.setProperty("webdriver.opera.driver", "C:\\SoftwareTesting\\Selenium\\operadriver.exe");
//			driver = new OperaDriver();
		} else if (browsername.equals("edge")) {
			Reporter.log("Opening the Edge", true);
			System.setProperty("webdriver.edge.driver", "C:\\SoftwareTesting\\Selenium\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else {
			Reporter.log("Unable to read data provided", true);
		}
	}

	@Test
	public void runOpen() throws InterruptedException, EncryptedDocumentException, IOException {
		// get data for login from external sheet which is excel

		FileInputStream file = new FileInputStream(
				"C:\\Users\\lakha\\Desktop\\Software Testing\\Automation Testing Notes\\Selenium Practice Demo\\upstoxlogin.xlsx");
		Sheet datasheet = WorkbookFactory.create(file).getSheet("Sheet1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://login-v2.upstox.com/");

		Upstoxlogin1 login1 = new Upstoxlogin1(driver);
		String username = datasheet.getRow(0).getCell(0).getStringCellValue();
		login1.setUpstoxlogin1username(username);
		String password = datasheet.getRow(0).getCell(1).getStringCellValue();
		login1.setUpstoxlogin1password(password);
		login1.clickUpstoxlogin1signBtn();
		Thread.sleep(3000);

		Upstoxlogin2 login2 = new Upstoxlogin2(driver);
		String gpin = datasheet.getRow(0).getCell(2).getStringCellValue();
		login2.setUpstoxlogin2pin(gpin);

		Upstoxlogin3 login3 = new Upstoxlogin3(driver);
		login3.clickUpstoxlogin3noBtn();
		Upstoxlogin4 login4 = new Upstoxlogin4(driver);
		String userid = datasheet.getRow(0).getCell(3).getStringCellValue();
		login4.getUpstoxlogin4Userid(userid);
		driver.quit();
	}

}
