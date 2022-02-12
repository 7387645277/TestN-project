package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobjectmodel.Signuppageobject;
import resources.Baseclass;

public class verifysignuppage extends Baseclass {
	@Test
	public void fillSignupForm() throws IOException 
	{
		driver=InitialiseDriver(); //initialise driver method from base class which will set all the driver properties  and return driver
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		Signuppageobject A = new Signuppageobject(driver);
		A.enterfirstname().sendKeys("Vikram");
		A.enterlastname().sendKeys("Jadhav");
		A.enterworkemail().sendKeys("vicky4123@gmail.com");
		A.selectjobtitle("QAanalyst");
		A.entercompanyname().sendKeys("TCS");
		A.selectEmpNo(3);
		A.Enterphone().sendKeys("7387645277");
		A.selectCountry("India");
		A.checkbox().click();
		A.Signupbutton().click();
		
}
}
