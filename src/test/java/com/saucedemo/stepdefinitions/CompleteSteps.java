

package com.saucedemo.stepdefinitions;

import org.testng.Assert;

import com.saucedemo.pages.CartsPage;
import com.saucedemo.pages.CompletePage;
import com.saucedemo.pages.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class CompleteSteps {
	
	TestContextSetup testcontextsetup;
	PageObjectManager pageObjectManager;
	CompletePage completePage;
	
	public CompleteSteps(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
		completePage = testcontextsetup.pageObjectManager.getCompletePage();

	}
	
	@Then("the user should see the order confirmation message")
	public void the_user_should_see_the_order_confirmation_message() {
		
		String expectedMessage = testcontextsetup.testBase.properties.getProperty("order.confirmation.message");
		String actualMessage = testcontextsetup.pageObjectManager.getCompletePage().getConfirmMessage();
		Assert.assertEquals(actualMessage, expectedMessage);
		
	}


}
