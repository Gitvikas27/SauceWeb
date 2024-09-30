

package com.saucedemo.stepdefinitions;

import com.saucedemo.pages.CartsPage;
import com.saucedemo.pages.PageObjectManager;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class CartSteps {
	
	TestContextSetup testcontextsetup;
	PageObjectManager pageObjectManager;
	CartsPage cartsPage;
	
	public CartSteps(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
		cartsPage = testcontextsetup.pageObjectManager.getCartsPage();

	}
	@When("the user navigates to the cart page")
	public void the_user_navigates_to_the_cart_page() {
		testcontextsetup.pageObjectManager.getCartsPage().goToCart();
	}
	
	@When("the user proceeds to checkout")
	public void the_user_proceeds_to_checkout() {
	    
		testcontextsetup.pageObjectManager.getCartsPage().proceedToCheckout();
	  
	}
	
	


}
