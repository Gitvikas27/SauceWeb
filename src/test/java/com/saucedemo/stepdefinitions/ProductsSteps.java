

package com.saucedemo.stepdefinitions;

import org.testng.Assert;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class ProductsSteps {
	
	TestContextSetup testcontextsetup;
	PageObjectManager pageObjectManager;
	LoginPage loginPage;
	
	public ProductsSteps(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
        loginPage = testcontextsetup.pageObjectManager.getLoginPage();

	}
	@When("the user adds a product to the cart")
	public void the_user_adds_a_product_to_the_cart() {
		testcontextsetup.pageObjectManager.getProductsPage().selectProduct();
	}
	
	@Then("the user should see the page title as {string}")
	public void the_user_should_see_the_page_title_as(String string) {
	    String actualTitle = testcontextsetup.testBase.properties.getProperty("order.app.title");
	    String expectedTitle = testcontextsetup.pageObjectManager.getProductsPage().getAppTitle();
	    Assert.assertEquals(actualTitle, expectedTitle);
	}

}
