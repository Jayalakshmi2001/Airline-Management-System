package com.sigma.service;

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
	public void deleteFlight(int flightId)
	{
		flightDao.deleteFlight(flightId);
	}
	
	/*public  void updateFlight(Flight[] flightdetails,int flightid)
	{
		flightDao.updateFlight(flightdetails, flightid);
	}*/
	
	public  void fetchAllFlights()
	{
		flightDao.fetchAllFlights();
	}
	
	public void viewParticularFlightDetails(Flight obj)
	{
		flightDao.viewParticularFlightDetails(obj);
	}
	
	public Flight fetchFlightsbyId(int flightid) 
	{
		// TODO Auto-generated method stub
		Flight obj=flightDao.fetchFlightsbyId(flightid);
		return obj;
		
	}
	public void searchFlightdetails(String searchOrigin,String searchDestination,String searchDate)
	{
		flightDao.searchFlightDetails(searchOrigin,searchDestination,searchDate);
	}

}


