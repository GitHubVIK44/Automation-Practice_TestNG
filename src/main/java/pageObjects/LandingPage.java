package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage 
{
	public WebDriver driver;
    
	
	@FindBy(xpath="//*[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//*[@id='passwd']")
	WebElement password;
	
	@FindBy(xpath="//*[@class='icon-lock left']")
	WebElement login;
	
	
	public LandingPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername()
	{
		return email;
	}
	public WebElement getPassword()
	{
		return password;
	}
	public WebElement getLogin()
	{
		return login;
	}
	

}
