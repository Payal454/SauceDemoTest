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

public class ProductDetailsPageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	ProductDetailPage productdetail;
	
	public ProductDetailsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		homepage =new HomePage();
		productdetail = new ProductDetailPage();
		homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		productdetail=homepage.clickOnFirstItem();
		
	}
	
	@Test
	public void VerifyforProductnameTest() {
		Assert.assertTrue(productdetail.VerifyforProductname(),"First Product details page not availabel");
		
	}
	
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	} 

	

}
