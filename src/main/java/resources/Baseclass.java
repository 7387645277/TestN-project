package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	public WebDriver driver;
	public WebDriver InitialiseDriver() throws IOException
	{
	FileInputStream f1=new FileInputStream("C:\\Users\\VIKRAM\\eclipse-workspace\\EtoEdemo\\src\\main\\java\\resources\\data.properties");
	Properties prop=new Properties();
	prop.load(f1);
	String browsername=prop.getProperty("browser");
	if(browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIKRAM\\Desktop\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browsername.equals("Firefox"))
	{
		//firefox code
	}
	else if(browsername.equals("Internet Explorer"))
	{
		//IE code
	}
	return driver;
	
}

}
