package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanagers.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC4_BookHotelStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	@Then("User should book hotel {string},{string} and {string}")
	public void userShouldBookHotelAnd(String firstName, String lastName, String billingAddress,
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(2);
		String ccNo = map.get("ccNo");
		String ccType = map.get("ccType");
		String expMonth = map.get("expMonth");
		String expYear = map.get("expYear");
		String ccv = map.get("CVV");
		pom.getBookhotelpage().bookHotel(firstName, lastName, billingAddress, ccNo, ccType, expMonth, expYear, ccv);

	}

	@Then("User should verify after booking success message {string} and save order id")
	public void userShouldVerifyAfterBookingSuccessMessageAndSaveOrderId(String expBookingSuccessMsg) {
		WebElement bookHotelsuccessMsg = pom.getBookingConfirmPage().getBookConformSuccessMsg();
		String textFromWebpage = getTextFromWebpage(bookHotelsuccessMsg);
		Assert.assertEquals("Verify After Selecting Hotel Success Message", expBookingSuccessMsg, textFromWebpage);

	}

	@Then("User should click Book Now without entering any fields")
	public void userShouldClickBookNowWithoutEnteringAnyFields() {
		pom.getBookhotelpage().bookHotleWithoutAnyFields();

	}

	@Then("User should verify after click Book Now error message {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void userShouldVerifyAfterClickBookNowErrorMessageAnd(String expFstNameErrMsg, String expLstNameErrMsg,
			String expAddErrMsg, String expccNoErrorMsg, String expccTypeErrorMsg, String expMonErrMsg,
			String expcvvErrorMsg) {
		WebElement fstNameErrorMsg = pom.getBookhotelpage().getFstNameErrorMsg();
		String txtFstNa = getTextFromWebpage(fstNameErrorMsg);
		boolean b = txtFstNa.contains(expFstNameErrMsg);
		Assert.assertTrue("Verify After Book Now Button Error Messag", b);

		WebElement lstNameErrorMsg = pom.getBookhotelpage().getLstNameErrorMsg();
		String txtLstNa = getTextFromWebpage(lstNameErrorMsg);
		boolean b1 = txtLstNa.contains(expLstNameErrMsg);
		Assert.assertTrue("Verify After Book Now Button Error Messag", b1);

		WebElement addErrorMsg = pom.getBookhotelpage().getAddErrorMsg();
		String address = getTextFromWebpage(addErrorMsg);
		boolean b2 = address.contains(expAddErrMsg);
		Assert.assertTrue("Verify After Book Now Button Error Messag", b2);

		WebElement ccNOErrorMsg = pom.getBookhotelpage().getCcNoErrorMsg();
		String txtCC = getTextFromWebpage(ccNOErrorMsg);
		boolean b3 = txtCC.contains(expccNoErrorMsg);
		Assert.assertTrue("Verify After Book Now Button Error Messag", b3);

		WebElement ccTypeErrorMsg = pom.getBookhotelpage().getCcTypeErrorMsg();
		String txtType = getTextFromWebpage(ccTypeErrorMsg);
		boolean b4 = txtType.contains(expccTypeErrorMsg);
		Assert.assertTrue("Verify After Book Now Button Error Messag", b4);

		WebElement ccExpErrorMsg = pom.getBookhotelpage().getCcExpiryErrorMsg();
		String txtExp = getTextFromWebpage(ccExpErrorMsg);
		boolean b5 = txtExp.contains(expMonErrMsg);
		Assert.assertTrue("Verify After Book Now Button Error Messag", b5);

		WebElement cvvErrorMsg = pom.getBookhotelpage().getCvvErrorMsg();
		String txtcvv = getTextFromWebpage(cvvErrorMsg);
		boolean b6 = txtcvv.contains(expcvvErrorMsg);
		Assert.assertTrue("Verify After Book Now Button Error Messag", b6);

	}

}
