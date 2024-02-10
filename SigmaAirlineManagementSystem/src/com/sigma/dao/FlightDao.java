package com.sigma.dao;

import com.sigma.beans.Bookings;
import com.sigma.beans.Flight;

public interface FlightDao {

	public int addFlight(Flight flight);
	public Flight[] fetchAllFlights();
	public int deleteFlight(int flightId,Bookings[] bookingdetails);
	public Flight fetchFlightsbyId(int flightid);
}


