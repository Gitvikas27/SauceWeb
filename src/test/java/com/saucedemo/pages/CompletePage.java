package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompletePage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//h2[@class='complete-header']")
	private WebElement completeMessage;
	
	
	
	
	public CompletePage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public String getConfirmMessage()
	{
		return completeMessage.getText();
	}
	

}

