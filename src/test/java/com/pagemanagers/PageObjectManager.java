package com.pagemanagers;

import com.pages.BookHotel;
import com.pages.BookingConfirmPage;
import com.pages.CancelBooking;
import com.pages.LoginPage;
import com.pages.SearchHotel;
import com.pages.SelectHotel;

public class PageObjectManager {
	private LoginPage loginpage;
	private SearchHotel searchhotel;
	private SelectHotel selecthotel;
	private BookHotel bookhotel;
	private CancelBooking cancelbooking;
	private BookingConfirmPage BookingConfirmPage;
	
public LoginPage getLoginpage() {
	return (loginpage==null) ? loginpage =new LoginPage(): loginpage ;
}
public SearchHotel getSearchHotelpage() {
	return (searchhotel==null) ? searchhotel =new SearchHotel(): searchhotel;
}
public SelectHotel getSelecthotelpage() {
	return (selecthotel==null) ? selecthotel =new SelectHotel(): selecthotel;
}
public BookHotel getBookhotelpage() {
	return (bookhotel==null) ? bookhotel =new BookHotel(): bookhotel;
}
public CancelBooking getCancelbookingpage() {
	return (cancelbooking==null) ? cancelbooking =new CancelBooking(): cancelbooking;
}
public BookingConfirmPage getBookingConfirmPage() {
	return (BookingConfirmPage==null) ? BookingConfirmPage =new BookingConfirmPage(): BookingConfirmPage;
}
}
