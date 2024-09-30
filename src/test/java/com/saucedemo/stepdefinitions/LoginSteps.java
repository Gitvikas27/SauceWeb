

package com.saucedemo.stepdefinitions;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.PageObjectManager;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class LoginSteps {
	
	TestContextSetup testcontextsetup;
	PageObjectManager pageObjectManager;
	LoginPage loginPage;
	
	public LoginSteps(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
        loginPage = testcontextsetup.pageObjectManager.getLoginPage();

	}
	
	@Given("the user is on the Sauce Demo login page")
	public void the_user_is_on_the_sauce_demo_login_page() 
	{
		testcontextsetup.testBase.naviagateToUrl();
	}
	@When("the user logs in with valid credentials")
	public void the_user_logs_in_with_valid_credentials() 
	{
	    String username=testcontextsetup.testBase.getUsername();
	    String password=testcontextsetup.testBase.getPassword();
	    loginPage.login(username, password);
	}

}
