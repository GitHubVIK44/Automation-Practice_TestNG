package VIK.Framework;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import pageObjects.LandingPage;
import pageObjects.MyAccountPage;
import resources.base;

public class ValidateTitle extends base 
{
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
		LandingPage a=new LandingPage(driver);
		a.getUsername().sendKeys("manojvip259@gmail.com");
		a.getPassword().sendKeys("practicevik");
		a.getLogin().click();	
	}
	
	@Test
	public void failedTC() throws IOException, Exception
	{
	   Thread.sleep(2000);
	   MyAccountPage t=new MyAccountPage(driver);
	   Assert.assertEquals(t.getMyAccount().getText(), "my account");
	   
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
    
}
