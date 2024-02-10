package com.sigma.service;


import com.sigma.beans.*;
import com.sigma.dao.*;

public class CarrierService {
	
	CarrierDao carrierDao = new CarrierDAOArrayImplementation();
	
	public int addCarrier(Carrier carrier)
	{
		carrierDao.addCarrier(carrier);
		return 0;
	}
	
	public Carrier[] fetchAllCarriers()
	{
		return carrierDao.fetchAllCarriers();
	}
	
	public int deleteCarrier(int carrierid,Flight[] flightdetails)
	{
		return carrierDao.deleteCarrier(carrierid,flightdetails);
	}
	
	public Carrier fetchCarriersById(int carrierid) 
	{
		return carrierDao.fetchCarriersById(carrierid);
	}

}

