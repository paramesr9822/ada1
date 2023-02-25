package com.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanagers.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TC1_LoginStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	@Given("User is on the Adactin page")
	public void user_is_on_the_adactin_page() throws FileNotFoundException, IOException {
	
	}

	@When("User should perform login {string} , {string}")
	public void userShouldPerformLogin(String userName, String password) {
		pom.getLoginpage().login(userName, password);
	}

	@When("User should perform login {string},{string} with Enter key")
	public void user_should_perform_login_with_enter_key(String userName, String password) throws AWTException {
		pom.getLoginpage().loginWithEnter(userName, password);

	}

	@Then("User should verify after login with Invalid Credential error message contains {string}")
	public void user_should_verify_after_login_with_invalid_credential_error_message_contains(
			String expLoginErrorMessage) {
		WebElement txtErrorLogin = pom.getLoginpage().getTxtErrorLogin();
		String text = getTextFromWebpage(txtErrorLogin);
		boolean b = text.contains(expLoginErrorMessage);
		Assert.assertTrue("verify after login with Invalid Credential error message contains", b);
	}

}
