package MultiBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterMultibrowser2 {

	WebDriver driver;

	@Parameters("browsername")
	@Test
	public void openbrowser(String browsername) {
		if (browsername.equals("chrome")) {
			Reporter.log("Opening the firefox", true);
			System.setProperty("webdriver.chrome.driver", "C:\\SoftwareTesting\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equals("firefox")) {
			Reporter.log("Opening the firefox", true);
			System.setProperty("webdriver.gecko.driver", "C:\\SoftwareTesting\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browsername.equals("opera")) {
			Reporter.log("Opening the Opera", true);
		}
	}

}
