package com.sauce.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce.qa.base.TestBase;

public class CartPage  extends TestBase{
	
	@FindBy(xpath="//span[contains(text(),'Your Cart')]")
	WebElement cartpagelabel;
	
	@FindBy(xpath="//button[contains(text(),'Checkout11')]")  //Here, i put wrong address
	WebElement  checkoutbtn;
	
	
	// Initialization pageObject
	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyYourcartPageLabel() {
		return cartpagelabel.isDisplayed();
		
	}
	
	public void clickOnCheckoutbtn() {
		checkoutbtn.click();
		
		
	}

}
