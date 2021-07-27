package com.Lumens.PagObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PromoCode_PageObject {
	
	WebDriver driver;
	
	@FindBy(xpath="	//*[@id='searchinput']")
	WebElement searchBar;
	
	@FindBy(xpath="//i[@aria-hidden='true']")
	WebElement search;
	
	@FindBy(xpath="//*[@title='Grace Chandelier']")
	WebElement chandelier;
	
	@FindBy(xpath="//*[@title='Add to Cart']")
	WebElement addTocart;
	
	@FindBy(xpath="//a[@title='View Cart']")
	WebElement checkout;

	@FindBy(xpath="//span[text()= 'Cart']")
	WebElement cart;
	
	@FindBy(xpath="//*[@name='dwfrm_cart_couponCode']")
	WebElement couponCode;
	
	@FindBy(xpath="//*[@name='addcoupons']")
	WebElement apply;
	
	public PromoCode_PageObject() {
		PageFactory.initElements(driver, this);
	}
	
	
public void search() {
	searchBar.sendKeys("Grace Chandelier");
	search.click();
}


public void addToCart(){
	chandelier.click();	
	addTocart.click();
	checkout.click();
}

public void cart() {
	cart.click();
}

public void addCouponCode() {
	couponCode.sendKeys("23456");
	apply.click();
	
}

}