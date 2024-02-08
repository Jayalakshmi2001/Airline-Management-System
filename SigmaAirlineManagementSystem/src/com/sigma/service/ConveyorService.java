package com.sigma.service;


import com.sigma.beans.Carrier;
import com.sigma.beans.Conveyor;
import com.sigma.beans.Flight;
import com.sigma.dao.ConveyorDAOArrayImplementation;
import com.sigma.dao.ConveyorDao;

public class ConveyorService {
	
	ConveyorDao conveyorDao = new ConveyorDAOArrayImplementation();
	
	public int mapConveyor(Conveyor conveyor)
	{
		conveyorDao.mapConveyor(conveyor);
		return 0;
	}
	
	public void fetchAllConveyors()
	{
		conveyorDao.fetchAllConveyors();
	}
	
	public Conveyor fetchConveyorsById(int flightId) 
	{
		// TODO Auto-generated method stub
		Conveyor obj=conveyorDao.fetchConveyorsById(flightId);
		return obj;
		
	}
	
	
}
	