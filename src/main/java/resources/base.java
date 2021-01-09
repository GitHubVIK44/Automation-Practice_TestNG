package resources;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	    public static WebDriver driver;
	    public Properties prop;
		public WebDriver initializeDriver() throws IOException
		{
			prop=new Properties();
			FileInputStream fis=new FileInputStream("E:\\Vivek_ST\\oxygen\\framework\\Framework\\src\\main\\java\\resources\\data.properties");
			prop.load(fis);
			String browserName=prop.getProperty("browser");
			if(browserName.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "E:\\Vivek_ST\\chromedriver.exe");
				driver=new ChromeDriver();	
			}
			else if(browserName.equalsIgnoreCase("firefox"))
			{
				System.out.println("firefox");
			}
		
			return driver;
		}
		
}
		/*public static String getScreeenshotPath(WebDriver driver, String testCaseName)
		{
			TakesScreenshot ts=(TakesScreenshot) driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			String destinationFile=System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
			try {
				FileHandler.copy(source,new File(destinationFile));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			try {
			File snapshotDest =new File(destinationFile);
	        
				FileUtils.copyFile(source, snapshotDest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return destinationFile;*/
		
		

	

