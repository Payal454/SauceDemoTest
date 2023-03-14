package com.sauce.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.qa.base.TestBase;
import com.sauce.qa.pages.CartPage;
import com.sauce.qa.pages.HomePage;
import com.sauce.qa.pages.LoginPage;
import com.sauce.qa.pages.ProductDetailPage;

public class HoemPageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	CartPage cartpage;
	ProductDetailPage productpage;
	
	public HoemPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		cartpage = new CartPage();
		productpage =new ProductDetailPage();
		homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	@Test(priority = 1)
	public void VerifyHomaPageTitleTest() {
		String homePgeTitle = homepage.verifyHomePageTitle();
		Assert.assertEquals(homePgeTitle, "Swag Labs","HomePage title not matched");
	}
	
	@Test(priority = 2)
	public void VerifyClickOnFristItemTest() {
		productpage = homepage.clickOnFirstItem();
	}
	
	@Test(priority = 3)
	public void VerifyclickOnAddtoCartLinkTest() {
		cartpage = homepage.clickOnAddtoCartLink();
		
	}
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
