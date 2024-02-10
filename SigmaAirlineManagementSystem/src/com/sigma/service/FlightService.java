package com.sigma.service;

import com.sigma.beans.Bookings;
import com.sigma.beans.Flight;
import com.sigma.dao.FlightDAOArrayImplementation;
import com.sigma.dao.FlightDao;

public class FlightService 
{

	FlightDao flightDao = new FlightDAOArrayImplementation();

	public int addFlight(Flight flight)
	{
		flightDao.addFlight(flight);
		return 0;
	}
	
	public  Flight[] fetchAllFlights()
	{
		return flightDao.fetchAllFlights();
	
	}
	
	public int deleteFlight(int flightId,Bookings[] bookingdetails)
	{
		return flightDao.deleteFlight(flightId,bookingdetails);
		
	}
	
	public Flight fetchFlightsbyId(int flightid) 
	{
		return flightDao.fetchFlightsbyId(flightid);
	}

}


