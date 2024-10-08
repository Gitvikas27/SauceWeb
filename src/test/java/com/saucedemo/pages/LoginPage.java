package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement usernameInput;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwordInput;
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public void enterUsername(String username)
	{
		usernameInput.sendKeys(username);
	}
	
	public void enterPasword(String password)
	{
		passwordInput.sendKeys(password);
	}
	
	public void clickLoginButton()
	{
		loginButton.click();
	}
	
	public void login(String username, String password)
	{
		enterUsername(username);
		enterPasword(password);
		clickLoginButton();
	}

}
