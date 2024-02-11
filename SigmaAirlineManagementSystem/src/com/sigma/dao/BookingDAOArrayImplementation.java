
package com.sigma.dao;

import java.util.Arrays;

import com.sigma.beans.*;
import com.sigma.service.*;

public class BookingDAOArrayImplementation implements BookingDao {

	public static Bookings[] book = new Bookings[0];
	FlightService flightservice=new FlightService();
	public Flight[] searchFlightDetails(Flight[] flightdetails,String searchOrigin, String searchDestination) 
	{
		Flight[] availableFlights=new Flight[0];
		for(Flight obj : flightdetails)
		{
			if(obj.getOrigin().equalsIgnoreCase(searchOrigin)&&obj.getDestination().equalsIgnoreCase(searchDestination))
			{
				availableFlights=Arrays.copyOf(availableFlights,availableFlights.length+1);
				availableFlights[availableFlights.length-1]=obj;
			}	
		}
		if(availableFlights.length>0)
		{
			return availableFlights;
		}
		return null;
	}
	
	public int addTicket(Bookings booking) 
	{
		book=Arrays.copyOf(book,book.length+1);
		book[book.length-1]=booking;
		for(int i=0;i<book.length;i++)
		{
			if(book[i].getCcategory()=="Economy" || book[i].getCcategory()=="economy")
			
			{
				book[i].setBookingamt(1000);
				book[i].setBookingstatus("BOOKED");
				
			}
			else if(book[i].getCcategory()=="Business" || book[i].getCcategory()=="business")
				
			{
				int business_amt = 1000*2;
				book[i].setBookingamt(business_amt);
				book[i].setBookingstatus("BOOKED");
				
			}
			else if(book[i].getCcategory()=="Executive" || book[i].getCcategory()=="executive")
				
			{
				int executive_amt=1000*5;
				book[i].setBookingamt(executive_amt);
				book[i].setBookingstatus("BOOKED");	
			}
		}
		return 0;
	}
	@Override
	public Bookings viewTicket(int id) {
		// TODO Auto-generated method stub
		for(Bookings obj:book)
		{
			if(id==obj.getBookingid())
			{
				return obj;
			}
		}
		return null;	
	}

	public boolean cancelTicket(int bookingId)
	{
		for(Bookings obj:book)
		{
			if(obj.getBookingid()==bookingId)
			{
				obj.setBookingid(0);
				return true;
			}
		}
		return false;
	}
	
	public Bookings[] getBookingDetails()
	{
		if(book.length==0)
		{
			return null;
		}
		return book;
	}
}