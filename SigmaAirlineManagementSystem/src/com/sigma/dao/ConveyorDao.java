package com.sigma.dao;

import com.sigma.beans.Conveyor;

public interface ConveyorDao {
	public int mapConveyor(Conveyor conveyor);
	public Conveyor[] fetchAllConveyors();
	public Conveyor fetchConveyorsById(int flightid);
	
}
