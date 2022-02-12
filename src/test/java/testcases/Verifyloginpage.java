package testcases;
//adding line for git demo purpose
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjectmodel.Loginpageobjects;
import resources.Baseclass;

public class Verifyloginpage extends Baseclass{
	@Test(dataProvider="getData")
	public void LaunchBrowser(String username,String password) throws IOException
	{
		driver=InitialiseDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Loginpageobjects obj=new Loginpageobjects(driver);
		obj.EnterUsername().sendKeys(username);
		obj.EnterPassword().sendKeys(password);
		obj.ClickLogin().click();
		
	}
	@DataProvider 
	public Object[][] getData() {
	
		Object[][] a1 = new Object[2][2];
		a1[0][0] = "test1";
		a1[0][1] = "pass1";
		a1[1][0] = "test2";
		a1[1][1] = "pass2";
		
		return a1;

}
}
