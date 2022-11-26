package Mailextractotp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TLCupstoxlogin1 {

	@FindBy(xpath = "//input[@id='mobileNum']")
	private WebElement mobiloeNo;
	@FindBy(xpath = "//button[@id='getOtp']")
	private WebElement getOtpBtn;

	public TLCupstoxlogin1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void setTLCupstoxlogin1mobNo() {
		mobiloeNo.sendKeys("9404105185");
	}
	public void clickTLCupstoxlogin1getotpBtn() {
		getOtpBtn.click();
	}
	
	
	
	
}
