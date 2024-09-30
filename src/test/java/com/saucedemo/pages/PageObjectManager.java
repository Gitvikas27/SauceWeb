package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public LoginPage loginPage;
	public ProductsPage productsPage;
	public CartsPage cartsPage;
	public PersonalInfoPage personalInfoPage;
	public CheckoutPage checkoutPage;
	public CompletePage completePage;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver) 
	{
		this.driver=driver;
	}
	

	public LoginPage getLoginPage()
	{
		loginPage = new LoginPage(driver);
		return loginPage;
	}
	public ProductsPage getProductsPage()
	{
		productsPage = new ProductsPage(driver);
		return productsPage;
	}
	public CartsPage getCartsPage()
	{
		cartsPage = new CartsPage(driver);
		return cartsPage;
	}
	public PersonalInfoPage getPersonalInfoPage()
	{
		personalInfoPage = new PersonalInfoPage(driver);
		return personalInfoPage;
	}
	public CheckoutPage getCheckoutPage()
	{
		checkoutPage = new CheckoutPage(driver);
		return checkoutPage;
	}
	public CompletePage getCompletePage()
	{
		completePage = new CompletePage(driver);
		return completePage;
	}

}
