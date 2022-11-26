package Mailextractotp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WindowType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TLCTestNglass extends TLCmailbaseClass {
	// Author: Lakhan Adewar
	// use to otp and login to upstox

	// Tlc mail classes
	TLCmaillogin1 maillogin1;
	TLCmaillogin2 maillogin2;
	// Upstox login object
	TLCupstoxlogin1 uplogin1;
	TLCupstoxlogin2 uplogin2;
	TLCupstoxlogin3 uplogin3;

	@BeforeClass
	public void openBrowser() {
		invokeBrowser();
		maillogin1 = new TLCmaillogin1(driver);
		maillogin2 = new TLCmaillogin2(driver);
		uplogin1 = new TLCupstoxlogin1(driver);
		uplogin2 = new TLCupstoxlogin2(driver);
		uplogin3 = new TLCupstoxlogin3(driver);
	}

	@Test
	public void tlcLogin() throws EncryptedDocumentException, IOException, InterruptedException {

		// open upstox
		driver.get("https://login.upstox.com/");
		// first page to enter mobile and click get otp
		uplogin1.setTLCupstoxlogin1mobNo();
		Thread.sleep(1500);
		uplogin1.clickTLCupstoxlogin1getotpBtn();
		Thread.sleep(1500);

		driver.switchTo().newWindow(WindowType.TAB);

		driver.get("https://tractorlearningcenter.in:2096/");

		Set<String> winIds = driver.getWindowHandles();

		// enter email
		maillogin1.setTLCmaillogin1mailid(TLCmailUtilityClass.getmaildata(0, 0));
		// enter password
		maillogin1.setTLCmaillogin1password(TLCmailUtilityClass.getmaildata(0, 1));
		// click on login button
		Thread.sleep(1500);
		maillogin1.clickTLCmaillogin1signBtn();
		// capture Otp
		String capOtp = maillogin2.getOptfrommail(driver, wait);

		ArrayList<String> arWinIds = new ArrayList<String>(winIds);

		driver.switchTo().window(arWinIds.get(0));

		uplogin2.setTLCupstoxlogin1otpNo(capOtp);
		Thread.sleep(1500);
		uplogin2.clickTLCupstoxlogin1otpBtn();
		Thread.sleep(1500);
		uplogin3.setTLCupstoxlogin1passCode();
		Thread.sleep(1500);
		uplogin3.clickTLCupstoxlogin1getcontiBtn();
		Thread.sleep(1500);
		uplogin3.clickUpstoxlogin3noBtn();

	}

}
