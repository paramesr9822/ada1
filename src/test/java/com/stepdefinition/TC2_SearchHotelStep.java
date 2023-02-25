package com.stepdefinition;

import java.awt.AWTException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanagers.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TC2_SearchHotelStep extends BaseClass {
	
	PageObjectManager pom = new PageObjectManager();

	@When("User needs to search hotel using {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_needs_to_search_hotel_using_and(String location, String hotels, String roomType, String noOfRooms,
			String checkIn, String checkOut, String noOfAdults, String noOfChild) throws AWTException, InterruptedException {
		pom.getSearchHotelpage().searchHotels(location, hotels, roomType, noOfRooms, checkIn, checkOut, noOfAdults, noOfChild);
		
	}

	@Then("User should navigate to select hotel and verify the success message {string}")
	public void user_should_navigate_to_select_hotel_and_verify_the_success_message(String expSuccessMsg) {
		WebElement searchHotelSuccessMsg = pom.getSearchHotelpage().getSearchHotelSuccessMsg();
		String textFromWebpage = getTextFromWebpage(searchHotelSuccessMsg);
		boolean b = textFromWebpage.contains(expSuccessMsg);
		Assert.assertTrue("navigate to select hotel and verify the success message", b);

	}

	@When("User needs to search hotel using mandatory fields {string},{string},{string},{string} and {string}")
	public void user_needs_to_search_hotel_using_mandatory_fields_and(String location, String noOfRooms, String checkIn,
			String checkOut, String noOfAdults) throws AWTException, InterruptedException {
		pom.getSearchHotelpage().searchHotelsWithMandatoryFields(location, noOfRooms, checkIn, checkOut, noOfAdults);
	}

	@Then("User should verify after search with the date error message {string} and {string}")
	public void user_should_verify_after_search_with_the_date_error_message_and(String checkInDateErrorMsg, String checkoutDateErrorMsg) {
		WebElement checkInDateErrorMsg1 = pom.getSearchHotelpage().getCheckInDateErrorMsg();
		String textFromWebpage = getTextFromWebpage(checkInDateErrorMsg1);
		boolean b = textFromWebpage.contains(checkInDateErrorMsg);
		Assert.assertTrue("verify after search with the date error message", b);
		WebElement checkOutDateErrorMsg2 = pom.getSearchHotelpage().getCheckOutDateErrorMsg();
		String textFromWebpage2 = getTextFromWebpage(checkOutDateErrorMsg2);
		boolean b1 = textFromWebpage2.contains(checkoutDateErrorMsg);
		Assert.assertTrue("verify after search with the date error message", b1);
	}

	@When("User should click search without entering any fields")
	public void user_should_click_search_without_entering_any_fields() {
		pom.getSearchHotelpage().searchHotelsWithoutAnyFields();

	}

	@Then("User should verify after search with the error message {string}")
	public void user_should_verify_after_search_with_the_error_message(String withoutAnyFieldErrorMsg1) {
		WebElement withoutAnyFieldErrorMsg = pom.getSearchHotelpage().getWithoutAnyFieldErrorMsg();
		String textFromWebpage = getTextFromWebpage(withoutAnyFieldErrorMsg);
		boolean b = textFromWebpage.contains(withoutAnyFieldErrorMsg1);
		Assert.assertTrue("verify after search with the error message", b);

	}

}
