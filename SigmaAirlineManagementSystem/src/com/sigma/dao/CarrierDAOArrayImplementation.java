package com.sigma.dao;

import java.util.Arrays;

import com.sigma.beans.Carrier;
import com.sigma.beans.Flight;
import com.sigma.dao.CarrierDao;

public class CarrierDAOArrayImplementation implements CarrierDao {

	private Carrier[] carrierdetails= new Carrier[0];
	
	@Override
	public int addCarrier(Carrier carrier) {
		// TODO Auto-generated method stub
		carrierdetails=Arrays.copyOf(carrierdetails,carrierdetails.length+1);
		carrierdetails[carrierdetails.length-1]=carrier;

		return 0;
	}
	
	
	public void fetchAllCarriers()
	{
		System.out.println("*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*");
		System.out.println("                                          Carrier DETAILS                                     ");
		System.out.println("*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*");
		System.out.println("CARRIERID     CARRIERNAME    discountPercentageThirtyDaysAdvanceBooking      discountPercentageSixtyDaysAdvanceBooking    discountPercentageNinetyDaysAdvanceBooking  bulkBookingDiscount 	refundPercentageForTicketCancellation2DaysBeforeTravelDate   refundPercentageForTicketCancellation10DaysBeforeTravelDate  refundPercentageForTicketCancellation20DaysBeforeTravelDate   silverUserDiscount	goldUserDiscount  platinumUserDiscount");
		
		for(Carrier obj:carrierdetails)
		{
			if(obj.getCarrierId()!=0)
			{
				System.out.println("   "+obj.getCarrierId()+"            "+obj.getCarrierName()+"        "+obj.getDiscountPercentageThirtyDaysAdvanceBooking()+"       "+obj.getDiscountPercentageSixtyDaysAdvanceBooking()+"         "+obj.getDiscountPercentageNinetyDaysAdvanceBooking()+"            "+obj.getBulkBookingDiscount()+"                "+obj.getRefundPercentageForTicketCancellation2DaysBeforeTravelDate()+"                "+obj.getRefundPercentageForTicketCancellation10DaysBeforeTravelDate()+"         "+obj.getRefundPercentageForTicketCancellation20DaysBeforeTravelDate()+"            "+obj.getSilverUserDiscount()+"                "+obj.getGoldUserDiscount()+"                "+obj.getPlatinumUserDiscount());
				
			}
		}
	}

	
	public int deleteCarrier(int carrierId) {
		// TODO Auto-generated method stub
		
		for(Carrier obj:carrierdetails)
		{
			if(obj.getCarrierId()==carrierId)
			{
				obj.setCarrierId(0);
				return 0;
			}
		}
		return 1;
	}
	
	@Override
	public int updateCarrier(Carrier carrier) {
		// TODO Auto-generated method stub
		return 0;
	}

	


	public Carrier fetchCarriersById(int carrierid) {
		// TODO Auto-generated method stub
		
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

