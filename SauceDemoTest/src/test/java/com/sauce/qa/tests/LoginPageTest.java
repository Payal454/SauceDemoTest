package com.sauce.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.qa.base.TestBase;
import com.sauce.qa.pages.HomePage;
import com.sauce.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();

	}

	@Test(priority = 1)
	public void LoginPageTitleTest() {
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Swag Labs");
	}

	@Test(priority = 2)
	public void ImageLogoTest() {
		boolean logo = loginpage.validateimglogo();
		Assert.assertTrue(logo);
	}

	@Test(priority = 3)
	public void loginTest() {
		homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
