package TestNG2practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page2
{
	//intilize the variable globally as private and use @findBy annotation
	
    @FindBy(xpath="//input[@name='yob']")    private   WebElement pin;
 
// intilize the variable Within constructor by using pagefactory class with public access control

public	  page2(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }

// utilize variable within method 	
public void pin(String pin1)
{
	pin.sendKeys(pin1);
}
}
