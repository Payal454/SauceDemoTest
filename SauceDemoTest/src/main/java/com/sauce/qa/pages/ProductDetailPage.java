package com.sauce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce.qa.base.TestBase;

public class ProductDetailPage extends TestBase
{
	
	//@FindBy(xpath="//div[@class='left_component']")
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	WebElement firstproductDetailpage;

	
	// Initialization pageObject
		public ProductDetailPage() {

			PageFactory.initElements(driver, this);
		}
		
		public boolean VerifyforProductname() {
			return firstproductDetailpage.isDisplayed();
		}
}







































































