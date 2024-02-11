package com.sigma.dao;

import java.util.Arrays;

import com.sigma.beans.*;
import com.sigma.service.*;

public class FlightDAOArrayImplementation implements FlightDao {

	private  static Flight[] flightdetails = new Flight[0];

	@Override
	public int addFlight(Flight flight) 
	{
		// TODO Auto-generated method stub
		flightdetails=Arrays.copyOf(flightdetails,flightdetails.length+1);
		flightdetails[flightdetails.length-1]=flight;
		
		return 0;
	}
	
	public Flight[] fetchAllFlights()
	{
		if(flightdetails.length==0)
		{
			return null;
		}
		return flightdetails;
		
	}

	public int deleteFlight(int flightid,Bookings[] bookingdetails)
	{
		
		for(Flight obj:flightdetails)
		{
			if(obj.getFlightId()==flightid)
			{
				if(bookingdetails!=null)
				{
					for(Bookings obj2:bookingdetails)
					{
						if(obj.getFlightId()==obj2.getFlightid())
						{
							return 1; //Flight information can't be removed as there are Active Booking open in the system. Please attempt to remove this flight either by cancelling all open ticket or try after serving all open bookings.
						}
					}
				}
				obj.setFlightId(0);
				return 0;  //Flight information successfully removed from system.
			}
		}
		return 2; //Invalid Flight Id.
	}
	
	public Flight fetchFlightsbyId(int flightid) 
	{
		for(Flight obj:flightdetails)
		{
			if(obj.getFlightId()==flightid)
			{
				return obj;
			}
		}
		return null;
	}
	

}


