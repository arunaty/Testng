package Mailextractotp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TLCupstoxlogin2 {

	@FindBy(xpath = "//input[@id='otpNum']")
	private WebElement optNo;
	@FindBy(xpath = "//button[@id='continueBtn']")
	private WebElement contiBtn;

	public TLCupstoxlogin2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setTLCupstoxlogin1otpNo(String cotp) {
		optNo.sendKeys(cotp);
	}

	public void clickTLCupstoxlogin1otpBtn() {
		contiBtn.click();
	}

}
