package com.sigma.dao;

import com.sigma.beans.Conveyor;

public interface ConveyorDao {
	public int mapConveyor(Conveyor conveyor);
	public void fetchAllConveyors();
	public Conveyor fetchConveyorsById(int flightid);
	
}
