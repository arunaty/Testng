package Mailextractotp;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;


public class TLCRegularTestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		WebDriver driver;
		String mid;
		String mpass;

		System.setProperty("webdriver.chrome.driver", "C:\\SoftwareTesting\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://tractorlearningcenter.in:2096/");

		FileInputStream file = new FileInputStream("C:\\SoftwareTesting\\excelSelenium.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("emaillogintractor");
		mid = sh.getRow(0).getCell(0).getStringCellValue();
		mpass = sh.getRow(0).getCell(1).getStringCellValue();

		TLCmaillogin1 login1 = new TLCmaillogin1(driver);
		login1.setTLCmaillogin1mailid(mid);
		login1.setTLCmaillogin1password(mpass);
		login1.clickTLCmaillogin1signBtn();
		Reporter.log(mid, true);
		Reporter.log(mpass, true);

	}

}
