package com.sigma.dao;

import com.sigma.beans.Bookings;
import com.sigma.beans.Flight;


public interface BookingDao{
	public Flight[] searchFlightDetails(Flight[] flightdetails,String searchOrigin, String searchDestination);
	public int addTicket(Bookings booking);
	public Bookings viewTicket(int id);
	public boolean cancelTicket(int bookingId);
	public Bookings[] getBookingDetails();
}
