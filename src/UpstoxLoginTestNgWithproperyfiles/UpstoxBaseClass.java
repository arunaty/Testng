package UpstoxLoginTestNgWithproperyfiles;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpstoxBaseClass {
	WebDriver driver;
	WebDriverWait wait;

	public void invokeBrowser() throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\SoftwareTesting\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get(UpstoxUtilityClass.getdataFromProperty("URL"));

		
	}

}
