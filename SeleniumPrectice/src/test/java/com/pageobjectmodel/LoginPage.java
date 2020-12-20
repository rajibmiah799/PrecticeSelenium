package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// initElements(ElementLocatorFactory factory, objectpage)

	}

	@FindBy(xpath = "//input[@id='email']")
	WebElement editEmail;

	public void enterEmail(String email) {
		editEmail.sendKeys(email);
	}

	@FindBy(xpath = "//input[@id='pass']")
	WebElement editpass;

	public void enterPass(String password) {
		editpass.sendKeys(password);
	}
	@FindBy(xpath="//input[@id='u_0_b']")
	WebElement clicklog;
	
	public void Loginclick() {
		clicklog.click();
	}

}