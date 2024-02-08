package com.sigma.service;


import com.sigma.beans.Carrier;
import com.sigma.beans.Flight;
import com.sigma.dao.CarrierDAOArrayImplementation;
import com.sigma.dao.CarrierDao;

public class CarrierService {
	
	CarrierDao carrierDao = new CarrierDAOArrayImplementation();
	
	public int addCarrier(Carrier carrier)
	{
		carrierDao.addCarrier(carrier);
		return 0;
	}
	
	public void fetchAllCarriers()
	{
		carrierDao.fetchAllCarriers();
	}
	
	public int deleteCarrier(int carrierid)
	{
		int res=carrierDao.deleteCarrier(carrierid);
		return res;
	}
	
	public Carrier fetchCarriersById(int carrierid) 
	{
		// TODO Auto-generated method stub
		Carrier obj=carrierDao.fetchCarriersById(carrierid);
		return obj;
		
	}

}

