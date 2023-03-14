package com.sauce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce.qa.base.TestBase;

public class HomePage extends TestBase{
	
	
	//@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	WebElement firstItem;
	
	//@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	//WebElement firstItemsDetails;
	
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement addtoCartLink;	
	
	// Initialization pageObject
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
	
		public String verifyHomePageTitle() {
			return driver.getTitle();
		}
	
		public ProductDetailPage clickOnFirstItem() {
			firstItem.click();
			return new ProductDetailPage();
			
		}
		public CartPage clickOnAddtoCartLink() {
			addtoCartLink.click();
			return new CartPage();
			
		}
		
		
	
	

	
	

}
