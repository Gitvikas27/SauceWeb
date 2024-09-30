package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartsPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement cartButton;
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkout;
	
	
	public CartsPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public void goToCart()
	{
		cartButton.click();
	}
	
	public void proceedToCheckout()
	{
		checkout.click();
	}

}

