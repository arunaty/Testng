package Testngrevision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParallelTestCasesChrome1Chrome1 {
	WebDriver driver;

	@BeforeClass
	public void opbrowser() {
		Reporter.log("Opening the Chrome1", true);
		System.setProperty("webdriver.chrome.driver", "C:\\SoftwareTesting\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void testcase1() {
		Reporter.log("Running TestCase 1 from Chrome1", true);
		driver.get("https://upstox.com/");
		System.out.println(driver.getTitle());
	}

	@Test
	public void testcase2() {
		Reporter.log("Running TestCase 2 from Chrome1", true);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://upstox.com/about/");
		System.out.println(driver.getTitle());
	}

	@Test
	public void testcase3() {
		Reporter.log("Running TestCase 3 from Chrome1", true);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://upstox.com/market-talk/");
		System.out.println(driver.getTitle());
	}

	@Test
	public void testcase4() {
		Reporter.log("Running TestCase 4 from Chrome1", true);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://upstox.com/pricing/");
		System.out.println(driver.getTitle());
	}

	@Test
	public void testcase5() {
		Reporter.log("Running TestCase 5 from Chrome1", true);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://upstox.com/refer-and-earn/");
		System.out.println(driver.getTitle());
	}

	@Test
	public void testcase6() {
		Reporter.log("Running TestCase 6 from Chrome1", true);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://upstox.com/announcements/");
		System.out.println(driver.getTitle());
	}

	@Test
	public void testcase7() {
		Reporter.log("Running TestCase 7 from Chrome1", true);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
	}

	@Test
	public void testcase8() {
		Reporter.log("Running TestCase 8 from Chrome1", true);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://upstox.com/become-sub-broker/");
		System.out.println(driver.getTitle());
	}

	@Test
	public void testcase9() {
		Reporter.log("Running TestCase 9 from Chrome1", true);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://upstox.com/press-releases/");
		System.out.println(driver.getTitle());
	}

	@Test
	public void testcase10() {
		Reporter.log("Running TestCase 10 from Chrome1", true);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://upstox.com/bug-bounty/");
		System.out.println(driver.getTitle());
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
