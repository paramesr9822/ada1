package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanagers.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC3_SelectHotelStep extends BaseClass {
	
	PageObjectManager pom = new PageObjectManager();

	@Then("User should Click the radiobtn and continue")
	public void user_should_click_the_radiobtn_and_continue() throws InterruptedException {
		pom.getSelecthotelpage().selectHotel();

	}

	@Then("User should verify after click continue success message {string}")
	public void user_should_verify_after_click_continue_success_message(String expSuccessMsg) {
		WebElement selectHotelsuccessMsg = pom.getBookhotelpage().getSelectHotelSuccessMsg();
		String textFromWebpage = getTextFromWebpage(selectHotelsuccessMsg);
		Assert.assertEquals("Verify After Selecting Hotel Success Message", expSuccessMsg, textFromWebpage);

	}

	@Then("User should Click the continue")
	public void user_should_click_the_continue() {
		pom.getSelecthotelpage().withoutSelectHotel();

	}

	@Then("User should verify after click continue error message {string}")
	public void user_should_verify_after_click_continue_error_message(String expErrorMsg) {
		WebElement withoutSelectErrorMsg = pom.getSelecthotelpage().getWithoutSelectHotelErrorMsg();
		String textFromWebpage = getTextFromWebpage(withoutSelectErrorMsg);
		boolean b = textFromWebpage.contains(expErrorMsg);
		Assert.assertTrue("Verify After Without Selecting Hotel Error Messag", b);

	}

}
