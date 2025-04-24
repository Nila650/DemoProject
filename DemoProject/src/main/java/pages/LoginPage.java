package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(xpath="//input[@name='username']")WebElement username;  // to locate webelement
	@FindBy(xpath="//input[@name='password']")WebElement password;
	@FindBy(xpath="//button[text()='Sign In']")WebElement signin;
	@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboard;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement alert;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//pagefactory - tolocate webelement /initelements-to initialize webelement,a static method
	}
	public void enterUserName(String usernamevalue)
	{
		username.sendKeys(usernamevalue);//username  - webelement name
	}
	public void enterPassword(String passwordvalue)
	{
		password.sendKeys(passwordvalue);
	}
	public void clickSignIn()
	{
		signin.click();
	}
	public boolean isHomePageLoaded()
	{
		return dashboard.isDisplayed();
	}
	
	public boolean isAlertDisplayed()
	{
		return alert.isDisplayed();
	}
	
}
