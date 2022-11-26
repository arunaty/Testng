package Mailextractotp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TLCupstoxlogin3 {

	@FindBy(xpath = "//input[@id='pinCode']")
	private WebElement passCode;
	@FindBy(xpath = "//button[@id='pinContinueBtn']")
	private WebElement loginBtn;
	@FindBy(xpath = "//button[@data-id='declineTour']")
	private WebElement noBtn;

	public TLCupstoxlogin3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setTLCupstoxlogin1passCode() {
		passCode.sendKeys("949494");
	}

	public void clickTLCupstoxlogin1getcontiBtn() {
		loginBtn.click();
	}

	public void clickUpstoxlogin3noBtn() throws InterruptedException {
		// Thread.sleep(3000);
		noBtn.click();
	}
}
