package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectHotel extends BaseClass {
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "radiobutton_0")
	private WebElement radioBtn;

	@FindBy(id = "continue")
	private WebElement continueBtn;
	
	@FindBy(id = "radiobutton_span")
	private WebElement withoutSelectHotelErrorMsg;

	public WebElement getRadio() {
		return radioBtn;
	}
	public WebElement getConte() {
		return continueBtn;
	}
	public void selectHotelCommonSteps() {
		elementclick(continueBtn);
	}
	
	public WebElement getWithoutSelectHotelErrorMsg() {
		return withoutSelectHotelErrorMsg;
	}

	public void selectHotel() throws InterruptedException {
		elementclick(radioBtn);
		selectHotelCommonSteps();
		Thread.sleep(3000);
	}

	public void withoutSelectHotel() {
		selectHotelCommonSteps();
	}


	

}
