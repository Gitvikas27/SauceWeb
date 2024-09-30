

package com.saucedemo.stepdefinitions;

import java.util.List;
import java.util.Map;

import com.saucedemo.pages.CartsPage;
import com.saucedemo.pages.PageObjectManager;
import com.saucedemo.pages.PersonalInfoPage;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class PersonalInfoSteps {
	
	TestContextSetup testcontextsetup;
	PageObjectManager pageObjectManager;
	PersonalInfoPage personalInfo;
	
	public PersonalInfoSteps(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
		personalInfo = testcontextsetup.pageObjectManager.getPersonalInfoPage();

	}
	
	@When("the user enters personal information")
	public void the_user_enters_personal_information(io.cucumber.datatable.DataTable dataTable) {
	    
	    List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

	    String firstName = data.get(0).get("First Name");
	    String lastName = data.get(0).get("Last Name");
	    String zipCode = data.get(0).get("Zip Code");
	    
	    testcontextsetup.pageObjectManager.getPersonalInfoPage().enterPersonalInfo(firstName, lastName, zipCode);
	    testcontextsetup.pageObjectManager.getPersonalInfoPage().clickContinue();

}
}