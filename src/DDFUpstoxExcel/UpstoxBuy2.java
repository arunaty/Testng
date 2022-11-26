package DDFUpstoxExcel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxBuy2 {

	@FindBy(xpath = "//div[@class='scrip-details-tour order-entry-tour']//div[contains(@class,'L8WooJepTO6Q9tbrujkiv')]")
	private WebElement price1Stock;
	@FindBy(xpath = "//input[@id='quantity']")
	private WebElement quantity2Buy;
	@FindBy(xpath = "(//div[@class='scrip-details-tour order-entry-tour']//div[@id='undefined_dropdown'])[1]")
	private WebElement productType;
	@FindBy(xpath = "//div[@class='scrip-details-tour order-entry-tour']//span[@class='_1YYA2Qt24RztqlfeEeazOp']")
	private WebElement calculatedPrice;

	public UpstoxBuy2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setUpstoxBuy2Quantity() {

		quantity2Buy.sendKeys("10");

	}

	public void listUpstoxBuyProdType(WebDriver driver) throws InterruptedException {
		Actions act = new Actions(driver);
		String downEnter=Keys.chord(Keys.DOWN,Keys.ENTER);
		act.moveToElement(productType).click().sendKeys(downEnter).build().perform();
		Thread.sleep(2000);
	}

	public void calStockPrice() {
		String price1Stx = price1Stock.getText().replaceAll("[^0-9.]+", "").trim();
		double actStx1Price = Double.parseDouble(price1Stx);
		String quantityvalue = quantity2Buy.getAttribute("value");
		double qtyEnter = Double.parseDouble(quantityvalue);
		double result = actStx1Price * qtyEnter;
		String estprice = calculatedPrice.getText().replaceAll("[^0-9.]+", "").trim();
		double estStxPrice = Double.parseDouble(estprice);

		System.out.println(actStx1Price);
		System.out.println(qtyEnter);
		System.out.println(result);
		System.out.println(estStxPrice);

		if (result == estStxPrice) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		// Assert.assertEquals(actStxPrice, estStxPrice);

	}

}
