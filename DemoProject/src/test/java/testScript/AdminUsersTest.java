package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUsersTest extends Base {

	@Test
	public void verifyIfUserIsAbleToSaveUserDetails() throws Exception
	{
		/*String username = "admin";
		String password = "admin";
		String username1 = "navamika s";
		String password1 = "navamika12";*/
		String username = ExcelUtility.readStringData(1, 0, "adminuser");
		String password = ExcelUtility.readStringData(1, 1, "adminuser");
	//	String username1 = ExcelUtility.readStringDat(1, 2, "adminuser");
	//	String password1 = ExcelUtility.readStringData(1, 3, "adminuser");
		FakerUtility fakerutility = new FakerUtility();
		String username1 = fakerutility.creatARandomFirstName();
		String password1 = fakerutility.creatARandomFirstName();
		LoginPage loginpage = new LoginPage(driver);//parameterized constrcuion need to create constructor in page class
		
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.clickSignIn();
		AdminUsersPage adminuserspage = new AdminUsersPage(driver);
		adminuserspage.adminUserInfo();
		adminuserspage.createNew();
		adminuserspage.username(username1);
		
		adminuserspage.password(password1);
		adminuserspage.userType();
		adminuserspage.save();
	boolean isgreenalertloaded =	adminuserspage.isAlertDisplayed();
	Assert.assertTrue(isgreenalertloaded);
		
	}
	
	
}
