package TestNG2practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page1
{
//intilize the variable globally as private and use @findBy annotation
	
	    @FindBy(xpath="//input[@name='userId'] ")    private   WebElement Userid;
	    @FindBy(xpath="//input[@name='password']")    private   WebElement pwd;
	    @FindBy(xpath="//button[@id='submit-btn']")    private   WebElement button;
	// intilize the variable Within constructor by using pagefactory class with public access control
	
public	  page1(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	
	// utilize variable within method 	
	public void user(String userid1)
	{
		Userid.sendKeys(userid1);
	}
	public void password(String pwd1)
	{
		pwd.sendKeys(pwd1);
	}
	public void signin()
	{
		 button.click();
	}
	
	
	
	
}
