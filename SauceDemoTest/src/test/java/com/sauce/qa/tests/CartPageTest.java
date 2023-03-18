/*
 * @author name 
 * this is my second commit
 * 
 * 
 */

package com.sauce.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.qa.base.TestBase;
import com.sauce.qa.pages.CartPage;
import com.sauce.qa.pages.HomePage;
import com.sauce.qa.pages.LoginPage;

public class CartPageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	CartPage cartpage;
	
	public CartPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		cartpage = new CartPage();
		homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		cartpage=homepage.clickOnAddtoCartLink();
	
		
	}
	
	@Test(priority=1)
	public void verifyYourcartLabelTest() {
		Assert.assertTrue(cartpage.verifyYourcartPageLabel(),"Your Cart Label is missing on the Page");	
	}
	
	@Test(priority=2)
	public void VerifyCheckOutButton() {
		cartpage.clickOnCheckoutbtn();
	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	} 

}
