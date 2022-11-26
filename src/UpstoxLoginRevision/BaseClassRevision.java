package UpstoxLoginRevision;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClassRevision {

	WebDriver driver;
	WebDriverWait wait;
	public void openbroweser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SoftwareTesting\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://login-v2.upstox.com/");
	}
	
	
	
}
