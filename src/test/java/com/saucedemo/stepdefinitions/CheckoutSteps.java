

package com.saucedemo.stepdefinitions;

import com.saucedemo.pages.CartsPage;
import com.saucedemo.pages.CheckoutPage;
import com.saucedemo.pages.PageObjectManager;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class CheckoutSteps {
	
	TestContextSetup testcontextsetup;
	PageObjectManager pageObjectManager;
	CheckoutPage checkoutPage;
	
	public CheckoutSteps(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
		checkoutPage = testcontextsetup.pageObjectManager.getCheckoutPage();

	}
	
	@When("the user confirms the order")
	public void the_user_confirms_the_order() {
		testcontextsetup.pageObjectManager.getCheckoutPage().clickFinish();
	}

}
