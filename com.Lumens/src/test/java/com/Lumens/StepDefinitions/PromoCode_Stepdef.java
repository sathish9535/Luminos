package com.Lumens.StepDefinitions;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import com.Lumens.ExcelData.ReadExcelFile;
import com.Lumens.PagObject.Login_PageObject;
import com.Lumens.PagObject.PromoCode_PageObject;
import com.Lumens.Util.BaseClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class PromoCode_Stepdef extends BaseClass {
	WebDriver driver;
	Login_PageObject Login;
	ReadExcelFile excelFile;
	PromoCode_PageObject  promoCode;
	

	 @Given("^user is able to signin$")
	    public void user_is_able_to_signin() throws Throwable {
		 Login=new Login_PageObject();
			Login.Account();
		 
			Login=new Login_PageObject();
			excelFile=new ReadExcelFile();
			ArrayList<String> testdata=excelFile.getData("user1");
			Login.logintoLumens(testdata.get(3), testdata.get(5));
			System.out.println("Login Successfully done ");
	    }

	    @Then("^User is able to go to cart$")
	    public void user_is_able_to_go_to_cart() throws Throwable {
	    	promoCode = new PromoCode_PageObject();
	    	promoCode.addToCart();
	    	promoCode.cart();
	    }

	    @And("^User is able to add promocode$")
	    public void user_is_able_to_add_promocode() throws Throwable {
	    	promoCode.addCouponCode();

	}
	
}
