package com.sigma.dao;

import com.sigma.beans.*;

public interface CarrierDao {

	public int addCarrier(Carrier carrier);
	public Carrier[] fetchAllCarriers();
	public int deleteCarrier(int carrierId,Flight[] flightdetails);
	public Carrier fetchCarriersById(int carrierid);
}

