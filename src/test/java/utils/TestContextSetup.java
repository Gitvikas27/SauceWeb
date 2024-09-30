package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.saucedemo.pages.PageObjectManager;

public class TestContextSetup {
	
	public TestBase testBase;
	public PageObjectManager pageObjectManager;
    public WebDriver driver;	
	
	public TestContextSetup() throws IOException
	{
		testBase = new TestBase();
		driver = testBase.WebDriverManager();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
	}

}
