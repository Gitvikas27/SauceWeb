package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//button[@id='finish']")
	private WebElement finish;
	
	
	public CheckoutPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public void clickFinish()
	{
		finish.click();
	}
	
	

}

