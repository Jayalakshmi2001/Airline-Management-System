package com.sigma.dao;

import com.sigma.beans.Flight;

public interface FlightDao {

	public int addFlight(Flight flight);
	//public void updateFlight(Flight[] flightdetails,int flightid);
	public void deleteFlight(int flightId);
	public void fetchAllFlights();
	public Flight fetchFlightsbyId(int flightid);
	public void viewParticularFlightDetails(Flight obj);
	public void searchFlightDetails(String searchOrigin,String searchDestination,String searchDate);
}


