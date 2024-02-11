package com.sigma.dao;

import java.util.Arrays;

import com.sigma.beans.*;
import com.sigma.service.*;

public class CarrierDAOArrayImplementation implements CarrierDao {

	private static Carrier[] carrierdetails= new Carrier[0];

	@Override
	public int addCarrier(Carrier carrier) 
	{
		carrierdetails=Arrays.copyOf(carrierdetails,carrierdetails.length+1);
		carrierdetails[carrierdetails.length-1]=carrier;

		return 0;
	}
	
	
	public Carrier[] fetchAllCarriers()
	{
		if(carrierdetails.length==0)
		{
			return null;
		}
		return carrierdetails;
	}

	
	public int deleteCarrier(int carrierId,Flight[] flightdetails) 
	{	
		for(Carrier obj:carrierdetails)
		{
			if(obj.getCarrierId()==carrierId)
			{
				if(flightdetails!=null)
				{
					for(Flight obj2:flightdetails)
					{
						if(obj.getCarrierId()==obj2.getCarrierId()) 
						{
							return 1; //Carrier information can't be removed as there are Active Flight Bookings open in the system. Please attempt to remove this Carrier either by cancelling all open ticket on the particular flights or try after serving all open bookings.
						}
					}
				}
				obj.setCarrierId(0);
				return 0;	//Carrier Information successfully removed from the system		 
			}
		}
		return 2; //Invalid Carrier Id.
	}
	
	public Carrier fetchCarriersById(int carrierid) 
	{
		for(Carrier obj:carrierdetails)
		{
			if(obj.getCarrierId()==carrierid)
			{
				return obj;
			}
		}
		return null;
	}

}

