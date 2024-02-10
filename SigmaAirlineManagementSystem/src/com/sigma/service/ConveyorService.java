package com.sigma.service;


import com.sigma.beans.*;

import com.sigma.dao.*;

public class ConveyorService {
	
	ConveyorDao conveyorDao = new ConveyorDAOArrayImplementation();
	
	public int mapConveyor(Conveyor conveyor)
	{
		conveyorDao.mapConveyor(conveyor);
		return 0;
	}
	
	public Conveyor[] fetchAllConveyors()
	{
		return conveyorDao.fetchAllConveyors();
	}
	
	public Conveyor fetchConveyorsById(int flightId) 
	{
		return conveyorDao.fetchConveyorsById(flightId);
	}
	
	
}
	