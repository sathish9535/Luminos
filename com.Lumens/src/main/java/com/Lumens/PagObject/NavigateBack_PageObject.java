package com.Lumens.PagObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigateBack_PageObject {

	WebDriver driver;
	
	@FindBy(xpath="	//*[@id='searchinput']")
	WebElement searchBar;
	
	@FindBy(xpath="//i[@aria-hidden='true']")
	WebElement search;
	
	@FindBy(xpath="//*[@title='Grace Chandelier']")
	WebElement chandelier;
	
	
	@FindBy(xpath="//*[@class='logo-link lu-sprite']")
	WebElement logo;
			
	public NavigateBack_PageObject() {
		PageFactory.initElements(driver, this);
	}
	
	public void productPage() {
	searchBar.sendKeys("Grace Chandelier");
	search.click();
	chandelier.click();	
	}
	
	public void homepage() {
		logo.click();
	}
}
