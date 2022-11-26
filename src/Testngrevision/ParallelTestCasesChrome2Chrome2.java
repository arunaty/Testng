package Testngrevision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelTestCasesChrome2Chrome2 {
	WebDriver driver;

	@BeforeTest
	public void opbrowser() {
		Reporter.log("Opening the Chrome2", true);
		System.setProperty("webdriver.chrome.driver", "C:\\SoftwareTesting\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void testcase011() {
		Reporter.log("Running TestCase 11 from Chrome2", true);
		driver.get("https://www.angelone.in/");
		Reporter.log(driver.getTitle());
		
		
	}

	@Test
	public void testcase22() {
		Reporter.log("Running TestCase 22 from Chrome2", true);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.angelone.in/share-market-app");
		Reporter.log(driver.getTitle());
	}

	@Test
	public void testcase33() {
		Reporter.log("Running TestCase 33 from Chrome2", true);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.angelbee.in/");
		Reporter.log(driver.getTitle());
	}

	@Test
	public void testcase44() {
		Reporter.log("Running TestCase 44 from Chrome2", true);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.angelone.in/share-market-app");
		Reporter.log(driver.getTitle());
	}

	@Test
	public void testcase55() {
		Reporter.log("Running TestCase 55 from Chrome2", true);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://smartapi.angelbroking.com/");
		Reporter.log(driver.getTitle());
	}

	@Test
	public void testcase66() {
		Reporter.log("Running TestCase 66 from Chrome2", true);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.angelone.in/margin-trading-facility");
		Reporter.log(driver.getTitle());
	}

	@Test
	public void testcase77() {
		Reporter.log("Running TestCase 77 from Chrome2", true);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.angelone.in/platform-and-tools/angel-speedpro");
		Reporter.log(driver.getTitle());
	}

	@Test
	public void testcase88() {
		Reporter.log("Running TestCase 88 from Chrome2", true);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.angelone.in/experience-arq");
		Reporter.log(driver.getTitle());
	}

	@Test
	public void testcase99() {
		Reporter.log("Running TestCase 99 from Chrome2", true);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.angelone.in/stocks/a");
		Reporter.log(driver.getTitle());
	}

	@Test
	public void testcase11() {
		Reporter.log("Running TestCase 11 from Chrome2", true);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.angelone.in/us-etfs/g");
		Reporter.log(driver.getTitle());
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
