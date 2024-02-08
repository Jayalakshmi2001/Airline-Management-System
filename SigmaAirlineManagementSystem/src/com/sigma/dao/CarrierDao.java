package com.sigma.dao;

import com.sigma.beans.Carrier;

public interface CarrierDao {

	public int addCarrier(Carrier carrier);
	public int updateCarrier(Carrier carrier);
	public int deleteCarrier(int carrierId);
	public void fetchAllCarriers();
	public Carrier fetchCarriersById(int carrierid);
}

