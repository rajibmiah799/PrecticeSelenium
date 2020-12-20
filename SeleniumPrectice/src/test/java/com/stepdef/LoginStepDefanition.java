package com.stepdef;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefanition extends Base {
	LoginPage lp;

	// instance veriable or referance veriable
	@Given("^user on facebook homepage$")
	public void user_on_facebook_homepage() throws Throwable {
		getDriver();
		lp = PageFactory.initElements(driver, LoginPage.class);
		// PageFactory.initElements(webdriver driver, objectpage);
	}

	@When("^user enter \"([^\"]*)\"$")
	public void user_enter(String email) throws Throwable {
		lp.enterEmail(email);

	}

	@When("^user enter \"([^\"]*)\" in box$")
	public void user_enter_in_box(String password) throws Throwable {
		lp.enterPass(password);

	}

	@When("^user click on login$")
	public void user_click_on_login() throws Throwable {
		lp.Loginclick();
	

	}

	@Then("^user login successfully$")
	public void user_login_successfully() throws Throwable {
		// Assert is testNG class
		Assert.assertEquals(driver.getTitle(), "(1) Facebook");
		// Assert.assertEquals(String actual, String excepted)
		// System.out.println(driver.getTitle());

		driver.close();

	}

}
