package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement backpackCart;
	
	@FindBy(xpath="//div[@class='app_logo']")
	private WebElement appTitle;
	
	
	public ProductsPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public void selectProduct()
	{
		backpackCart.click();
	}
	
	public String getAppTitle()
	{
		return appTitle.getText();
	}
	
	

}
