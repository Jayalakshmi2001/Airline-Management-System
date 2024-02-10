package com.sigma.service;

import com.sigma.beans.*;
import com.sigma.dao.*;
public class BookingService 
{
	BookingDao bookingdao = new BookingDAOArrayImplementation();
	
	public Flight[] searchFlightDetails(Flight[] flightdetails,String searchOrigin, String searchDestination)
	{
		return bookingdao.searchFlightDetails(flightdetails,searchOrigin,searchDestination);
	}
	
	public  int addTicket(Bookings booking)
	{
		bookingdao.addTicket(booking);
		return 0;
	}
	public  Bookings viewTicket(int id)
	{
		return bookingdao.viewTicket(id);
	}
	public boolean cancelTicket(int bookingId) {
		// TODO Auto-generated method stub
		return bookingdao.cancelTicket(bookingId);
	}
	
	public Bookings[] getBookingDetails()
	{
		return bookingdao.getBookingDetails();
	}
}
