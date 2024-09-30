package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	
	public WebDriver driver;
	public Properties properties;
	
	
	public WebDriver WebDriverManager() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Global.properties");
		properties = new Properties();
		properties.load(fis);
		
		String browser = properties.getProperty("browser");
		
		if(driver==null)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			else
			{
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
		}
		
		driver.manage().window().maximize();;
		return driver;
		
	}
	
	public void naviagateToUrl()
	{
		String url = properties.getProperty("url");
		driver.get(url);
	}
	public String getUsername()
	{
		return properties.getProperty("username");
	}
	public String getPassword()
	{
		return properties.getProperty("password");
	}

}
