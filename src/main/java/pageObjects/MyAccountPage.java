package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage 
{
	public WebDriver driver;
	
	
	
	@FindBy(xpath="//*[@class='page-heading']")
	WebElement myaccount;
	
	@FindBy(xpath="//*[@class='icon-heart']")
	WebElement hearticon;
	
	
	public MyAccountPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMyAccount()
	{
		return myaccount;
	}
	public WebElement getHeartIcon()
	{
		return hearticon;
	}
	
	

}
