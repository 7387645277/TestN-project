package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Signuppageobject {
public WebDriver driver;
	
	By firstname = By.xpath("//input[@name='UserFirstName']");
	By lastname = By.xpath("//input[@name='UserLastName']");
	By workemail = By.xpath("//input[@name='UserEmail']");
	By jobtitle = By.xpath("//select[@name='UserTitle']");
	By companyname = By.xpath("//input[@name='CompanyName']");
	By empno = By.xpath("//select[@name='CompanyEmployees']");
	By phone = By.xpath("//input[@name='UserPhone']");
	By country = By.xpath("//select[@name='CompanyCountry']"); 
	By checkbox = By.xpath("(//div[@class='checkbox-ui'])[1]");
	By signupButton = By.xpath("//button[@type='submit']");
	
	public Signuppageobject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	
		this.driver = driver2;
	}

	public WebElement enterfirstname()
	{
		return driver.findElement(firstname);
	}
	
	public WebElement enterlastname()
	{
		return driver.findElement(lastname);
		
	}
	
	public WebElement enterworkemail()
	{
		return driver.findElement(workemail);
	}
	
	public void selectjobtitle(String title)             
	{
		Select obj = new Select(driver.findElement(jobtitle));
		obj.selectByValue(title);
		
	}
	
	public WebElement entercompanyname()
	{
		return driver.findElement(companyname);
		
	}
	
	public void selectEmpNo(int index)
	{
		Select obj = new Select(driver.findElement(empno));
		obj.selectByIndex(index);
		
		
		
	}
	
	public WebElement Enterphone()
	{
		return driver.findElement(phone);
	}
	
	public void selectCountry(String c)
	{
		Select obj = new Select(driver.findElement(country));
		obj.selectByVisibleText(c);
		//return driver.findElement(country);
	}
	
	public WebElement checkbox()
	{
		return driver.findElement(checkbox);
	}
	
	public WebElement Signupbutton()
	{
		return driver.findElement(signupButton);
	}
}
