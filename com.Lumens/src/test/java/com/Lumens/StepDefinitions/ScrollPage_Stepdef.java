package com.Lumens.StepDefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.Lumens.Util.BaseClass;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ScrollPage_Stepdef extends BaseClass{
	
	WebDriver driver;
	
	 @And("^User is able to scroll up and down$")
	    public void user_is_able_to_scroll_up_and_down() throws Throwable {
	    
	        JavascriptExecutor js =(JavascriptExecutor) driver;  //using java script executer 
	        js.executeScript("window.scrollBby(0,350)", "");  //scroll down
	        js.executeScript("window.scrollBby(0,-350)", "");  //scroll up
	    }

}
