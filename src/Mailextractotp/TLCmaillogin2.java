package Mailextractotp;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TLCmaillogin2 {

	@FindBy(xpath = "//div[@id='layout-list']//a[@id='rcmbtn111']")
	private WebElement refreshBtn;
	@FindBy(xpath = "//div[@id='layout-list']//a[@class='button unread']")
	private WebElement unreadMsgBtn;

	// class="message unread focused"
	@FindBy(xpath = "//table[@id='messagelist']//tbody//tr")
	private List<WebElement> resmail;
	@FindBy(xpath = "//iframe[@id='messagecontframe']")
	private WebElement iframeid;
	@FindBy(xpath = "//div[@id='message-content']//div[@id='messagebody']//div[@class='rcmBody']")
	public WebElement msgTextinframe;

	String otp;

	public TLCmaillogin2(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}

//	public void clickTLCmaillogin1refreshBtn() throws InterruptedException {
//		Thread.sleep(30000);
//		refreshBtn.click();
//		Thread.sleep(3000);
//		unreadMsgBtn.click();
//	}

	public String getOptfrommail(WebDriver driver, WebDriverWait wait) throws InterruptedException {
		Thread.sleep(60000);
		refreshBtn.click();
		Thread.sleep(3000);
		unreadMsgBtn.click();
		Thread.sleep(3000);

		for (int i = 0; i < resmail.size(); i++) {

			String urAtrmsg = resmail.get(i).getAttribute("class");

			boolean result = urAtrmsg.contains("unread");

			if (result) {
				resmail.get(i).click();
			}
			driver.switchTo().frame(iframeid);
			otp = msgTextinframe.getText().replaceAll("[^0-9]+", "").trim();
		}

		return otp;

	}

}
