package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Base {
	@Test
	public void loginMethod1()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		String username = "admin";
		String password = "admin";
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys(username);
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys(password);
		WebElement signin = driver.findElement(By.xpath("//button[text()='Sign In']"));
		signin.click();
		WebElement dashboard = driver.findElement(By.xpath("//p[text()='Dashboard']"));
		boolean ishomepageloaded = dashboard.isDisplayed();
		//assertion - for validation
		Assert.assertTrue(ishomepageloaded);//if assertTrue has false value tetcase will fail
		
	}
	@Test
	public void loginMethod2()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		String username = "admin";
		String password = "nila";
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys(username);
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys(password);
		WebElement signin = driver.findElement(By.xpath("//button[text()='Sign In']"));
		signin.click();
		WebElement alert = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean isAlertDisplayed = alert.isDisplayed();
		Assert.assertTrue(isAlertDisplayed);
		
	}
	@Test
	public void loginMethod3()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		String username = "nila";
		String password = "admin";
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys(username);
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys(password);
		WebElement signin = driver.findElement(By.xpath("//button[text()='Sign In']"));
		signin.click();
		WebElement alert = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean isAlertDisplayed = alert.isDisplayed();
		Assert.assertTrue(isAlertDisplayed);
	}
	@Test
	public void loginMethod4()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		String username = "nila";
		String password = "nila";
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys(username);
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys(password);
		WebElement signin = driver.findElement(By.xpath("//button[text()='Sign In']"));
		signin.click();
		WebElement alert = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean isAlertDisplayed = alert.isDisplayed();
		Assert.assertTrue(isAlertDisplayed);
	}
	//c u , w p = locate alert and check alert.isdisplayed
	//w u ,c p
	//w u , w p
	
	
}
