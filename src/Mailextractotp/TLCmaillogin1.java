package Mailextractotp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TLCmaillogin1 {

	@FindBy(xpath = "//input[@id='user']")
	private WebElement mailid;
	@FindBy(xpath = "//input[@id='pass']")
	private WebElement password;
	@FindBy(xpath = "//button[@id='login_submit']")
	private WebElement signinBtn;

	public TLCmaillogin1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setTLCmaillogin1mailid(String mid) {
		mailid.sendKeys(mid);
	}

	public void setTLCmaillogin1password(String mpass) {
		password.sendKeys(mpass);
	}

	public void clickTLCmaillogin1signBtn() {
		signinBtn.click();
	}

}
