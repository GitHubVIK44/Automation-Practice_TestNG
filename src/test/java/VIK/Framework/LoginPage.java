package VIK.Framework;


import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class LoginPage extends base 
{
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
	}
	@Test(dataProvider="getData")
	public void signIn(String username,String password,String text) throws IOException, Exception
	{
	   LandingPage l=new LandingPage(driver);
	   l.getUsername().clear();
	   l.getUsername().sendKeys(username);
	   l.getPassword().clear();
	   l.getPassword().sendKeys(password);
	   System.out.println(text);
	   l.getLogin().click();
	   Thread.sleep(3000);
	   
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][3];
		data[0][0]="abc";
		data[0][1]="123";
		data[0][2]="Restricted User";
		
		data[1][0]="manojvip259@gmail.com";
		data[1][1]="practicevik";
		data[1][2]="Non-Restricted User";
		
		return data;		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	
}
