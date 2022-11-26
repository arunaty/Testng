package TestNG2practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page3 
{


	//intilize the variable globally as private and use @findBy annotation
	
    @FindBy(xpath="//div[text()='No, I’m good']")    private   WebElement wel;
 
// intilize the variable Within constructor by using pagefactory class with public access control

public	  page3(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
	public void wcbtn()
	{
		wel.click();
	}
	
}
