package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookHotel extends BaseClass  {
	
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(id="first_name")
		private WebElement frstNa;
		
		@FindBy(id="last_name")
		private WebElement lastNa;
		
		@FindBy(id="address")
		private WebElement  billAdd;
		
		@FindBy(id="cc_num")
		private WebElement card;
		
		@FindBy(id="cc_type")
		private WebElement crdtype;
		
		@FindBy(id="cc_exp_month")
		private WebElement crdmnth;
		
		@FindBy(id="cc_exp_year")
		private WebElement crdyr;
		
		@FindBy(id="cc_cvv")
		private WebElement cvv;
		
		@FindBy(id="book_now")
		private WebElement book;
		
		@FindBy(xpath = "(//td[@class='login_title'])[2]")
		private WebElement selectHotelSuccessMsg;
		
		@FindBy(id="first_name_span")
		private WebElement fstNameErrorMsg;
		
		@FindBy(id="last_name_span")
		private WebElement lstNameErrorMsg;
		
		@FindBy(id="address_span")
		private WebElement addErrorMsg;
		
		@FindBy(id="cc_num_span")
		private WebElement ccNoErrorMsg;
		
		@FindBy(id="cc_type_span")
		private WebElement ccTypeErrorMsg;
		
		@FindBy(id="cc_expiry_span")
		private WebElement ccExpiryErrorMsg;
		
		@FindBy(id="cc_cvv_span")
		private WebElement cvvErrorMsg;
		
		public WebElement getFstNameErrorMsg() {
			return fstNameErrorMsg;
		}

		public WebElement getLstNameErrorMsg() {
			return lstNameErrorMsg;
		}

		public WebElement getAddErrorMsg() {
			return addErrorMsg;
		}

		public WebElement getCcNoErrorMsg() {
			return ccNoErrorMsg;
		}

		public WebElement getCcTypeErrorMsg() {
			return ccTypeErrorMsg;
		}

		public WebElement getCcExpiryErrorMsg() {
			return ccExpiryErrorMsg;
		}

		public WebElement getCvvErrorMsg() {
			return cvvErrorMsg;
		}

		public WebElement getFrstNa() {
			return frstNa;
		}

		public WebElement getLastNa() {
			return lastNa;
		}

		public WebElement getBillAdd() {
			return billAdd;
		}

		public WebElement getCard() {
			return card;
		}

		public WebElement getCrdtype() {
			return crdtype;
		}

		public WebElement getCrdmnth() {
			return crdmnth;
		}

		public WebElement getCrdyr() {
			return crdyr;
		}

		public WebElement getCvv() {
			return cvv;
		}

		public WebElement getBook() {
			return book;
		}
		
		public WebElement getSelectHotelSuccessMsg() {
			return selectHotelSuccessMsg;
		}
		
		public void bookHotelCommonStep() {
			elementclick(getBook());
		}

		public void bookHotel(String firstName, String lastName, String billingAddress, String ccNo, String ccType,
				String expMonth, String expYear, String CVV) throws InterruptedException {
			elementsendKeys(getFrstNa(), firstName);
			elementsendKeys(getLastNa(), lastName);
			elementsendKeys(getBillAdd(), billingAddress);
			elementsendKeys(getCard(), ccNo);
			selectbyvisibletext(getCrdtype(), ccType);
			selectbyvisibletext(getCrdmnth(), expMonth);
			selectbyvisibletext(getCrdyr(), expYear);
			elementsendKeys(getCvv(), CVV);
//			elementClick(getBook());
			bookHotelCommonStep();
			Thread.sleep(10000);
		}
		
		public void bookHotleWithoutAnyFields() {
			bookHotelCommonStep();
		}
	}



