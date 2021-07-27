package com.Lumens.StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.Lumens.PagObject.NavigateBack_PageObject;
import com.Lumens.Util.BaseClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class NavigateBack_Stepdef extends BaseClass {

	WebDriver driver;
	
	NavigateBack_PageObject  navigateback;
	
	

    @Then("^User is able to go to product page$")
    public void user_is_able_to_go_to_product_page() throws Throwable {
    	navigateback= new NavigateBack_PageObject();
    	navigateback.productPage();
    	
    }

    @And("^User is able to navigate back to homepage$")
    public void user_is_able_to_navigate_back_to_homepage() throws Throwable {
    	navigateback.homepage();
    }

	
}
