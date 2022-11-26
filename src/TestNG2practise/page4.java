package TestNG2practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page4 {

	// intilize the variable globally as private and use @findBy annotation

	@FindBy(xpath = "//span[text()='mayur j.']")
	private WebElement verifyuser;

// intilize the variable Within constructor by using pagefactory class with public access control

	public page4(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String verifyuser()// Stringvalue//result
	{
		String result = verifyuser.getText();
		return result;
	}

}
