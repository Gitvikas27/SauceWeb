package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInfoPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement firstNameInput;
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastNameInput;
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement zipcodeInput;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continueButton;
	
	public PersonalInfoPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public void enterPersonalInfo(String firstName,String lastName,String zipcode)
	{
		firstNameInput.sendKeys(firstName);
		lastNameInput.sendKeys(lastName);
		zipcodeInput.sendKeys(zipcode);
	}
	
	public void clickContinue()
	{
		continueButton.click();
	}
	


}
