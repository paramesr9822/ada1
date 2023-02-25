package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanagers.PageObjectManager;

import io.cucumber.java.en.Then;

public class CommonStep extends BaseClass{

	PageObjectManager pom = new PageObjectManager();
	

	@Then("User should verify after login success message {string}")
	public void userShouldVerifyAfterLoginSuccessMessage(String expLoginSuccessMesage) {
		WebElement txtLoginMsg = pom.getSearchHotelpage().getTxtLoginMsg();
		String textFromWebpage = getAttributeValue(txtLoginMsg);
		Assert.assertEquals("verify after login success message", expLoginSuccessMesage, textFromWebpage);
	}



}
