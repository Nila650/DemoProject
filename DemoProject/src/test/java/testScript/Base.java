package testScript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constants.Constants;
import utilities.ScreenShotUtility;



public class Base {

	public WebDriver driver;
	public ScreenShotUtility scrshot;
	public Properties properties;
	public FileInputStream fileinputstream ;
	@BeforeMethod(alwaysRun = true)
	@Parameters("browser")
	public void browserInitilization(String browser) throws Exception
	{
		// driver = new ChromeDriver();//browser initilization
		try {
			properties = new Properties();
			fileinputstream = new FileInputStream(Constants.CONFIGFILE);
			properties.load(fileinputstream);
		}
		catch (Exception e) {
			System.out.println("invalid");
		}
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else {
			throw new Exception("invalid browser") ;
		}
		//driver.get("https://groceryapp.uniqassosiates.com/admin/login");//launch url
		driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();//maximize window
		//driver.close();//tso close current window
		
		
		
	}
	@AfterMethod(alwaysRun = true)
	public void driverQuit(ITestResult iTestResult) throws IOException
	{
		if (iTestResult.getStatus() == ITestResult.FAILURE) {
			scrshot = new ScreenShotUtility();
			scrshot.getScreenShot(driver, iTestResult.getName());
		//driver.quit();//to close all window
	}
		driver.quit();

}
}
	
