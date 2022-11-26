package DDFUpstoxExcel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxBuy1 {

	@FindBy(xpath = "//div[@id='watchlistTestId']/div/div")
	private List<WebElement> stockList;

	@FindBy(xpath = "//div[@id='watchlistTestId']/div//div[@class='GVZPg514UQ_SC6KR0I5Cx']")
	private List<WebElement> moreoptions;

	@FindBy(xpath = "//div[@class='ciq-nav full-screen-hide']/div[1]")
	private WebElement grid;

	public UpstoxBuy1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void getStoxList(WebDriver driver) {
		Actions act = new Actions(driver);

		for (int i = 0; i < stockList.size(); i++) {

			// this will print the list of top 20 stocks in market
			// System.out.println(stockList.get(i).getText().replaceAll("[^A-Za-z]", " "));

			boolean results = stockList.get(i).getText().replaceAll("[^A-Za-z]", " ").contains("TCS");

			if (results) {
				// click on particular stock to view chart

				act.moveToElement(moreoptions.get(i)).click().build().perform();
				// buy options will click
				// stockList.get(i).click();
			}

		}
		act.moveToElement(grid).click().build().perform();
	}

}
