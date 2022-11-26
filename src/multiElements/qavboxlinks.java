package multiElements;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class qavboxlinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\SoftwareTesting\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://qavbox.github.io/demo/");

		List<WebElement> listLinks = driver.findElements(By.xpath("//form[@id='form1']//a"));

		Actions act = new Actions(driver);

		for (int i = 0; i < listLinks.size(); i++) {

			act.keyDown(Keys.CONTROL).click(listLinks.get(i)).build().perform();
		}

		Set<String> idCh = driver.getWindowHandles();
		for(int i=0;i<=10;i++){
		
		System.out.println(i);
		System.out.println(i);
		}
		
		
		

		ArrayList<String> arid = new ArrayList<String>(idCh);

		for (int j = 0; j < arid.size(); j++) {

			String sys = driver.switchTo().window(arid.get(j)).getTitle();

			System.out.println(sys);

		}

	}
}
