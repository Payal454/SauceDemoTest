package com.sauce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce.qa.base.TestBase;

public class LoginPage extends TestBase {

	// Page Factory

	@FindBy(xpath="//input[@id='user-name']")
	WebElement username;

	@FindBy(xpath="//input[@id='password']")
	WebElement password;

	@FindBy(name="login-button")
	WebElement loginbtn;

	@FindBy(xpath="//input[@type='submit']")
	WebElement imagelogo;

	// Initialization
	public LoginPage() {
		PageFactory.initElements(driver, this);// this is pointing to the current class of object
	}

	// Action
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validateimglogo() {
		return imagelogo.isDisplayed();

	}

	public HomePage login(String unm, String pass) {
		username.sendKeys(unm);
		password.sendKeys(pass);
		loginbtn.click();
		return new HomePage();

	}

}
