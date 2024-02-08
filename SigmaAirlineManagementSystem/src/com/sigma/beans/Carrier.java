package com.sigma.beans;

public class Carrier 
{
	private static int id=301;
	private int carrierId;
	private String carrierName;
	private int discountPercentageThirtyDaysAdvanceBooking;
	private int discountPercentageSixtyDaysAdvanceBooking;
	private int discountPercentageNinetyDaysAdvanceBooking;
	private int bulkBookingDiscount;
	private int refundPercentageForTicketCancellation2DaysBeforeTravelDate;
	private int refundPercentageForTicketCancellation10DaysBeforeTravelDate;
	private int refundPercentageForTicketCancellation20DaysBeforeTravelDate;
	private int silverUserDiscount;
	private int GoldUserDiscount;
	private int PlatinumUserDiscount;
	
	public Carrier(
			String carrierName,
			int discountPercentageThirtyDaysAdvanceBooking,
			int discountPercentageSixtyDaysAdvanceBooking,
			int discountPercentageNinetyDaysAdvanceBooking,
			int bulkBookingDiscount,
			int refundPercentageForTicketCancellation2DaysBeforeTravelDate,
			int refundPercentageForTicketCancellation10DaysBeforeTravelDate,
			int refundPercentageForTicketCancellation20DaysBeforeTravelDate,
			int silverUserDiscount,
			int GoldUserDiscount,
			int PlatinumUserDiscount)
	
	{
		this.carrierId=id++;
		this.carrierName=carrierName;
		this.discountPercentageThirtyDaysAdvanceBooking=discountPercentageThirtyDaysAdvanceBooking;
		this.discountPercentageSixtyDaysAdvanceBooking=discountPercentageSixtyDaysAdvanceBooking;
		this.discountPercentageNinetyDaysAdvanceBooking=discountPercentageNinetyDaysAdvanceBooking;
		this.bulkBookingDiscount=bulkBookingDiscount;
		this.refundPercentageForTicketCancellation2DaysBeforeTravelDate=refundPercentageForTicketCancellation2DaysBeforeTravelDate;
		this.refundPercentageForTicketCancellation10DaysBeforeTravelDate=refundPercentageForTicketCancellation10DaysBeforeTravelDate;
		this.refundPercentageForTicketCancellation20DaysBeforeTravelDate=refundPercentageForTicketCancellation20DaysBeforeTravelDate;
		this.silverUserDiscount=silverUserDiscount;
		this.GoldUserDiscount=GoldUserDiscount;
		this.PlatinumUserDiscount=PlatinumUserDiscount;
	}

	public int getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(int carrierId) {
		this.carrierId = carrierId;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public int getDiscountPercentageThirtyDaysAdvanceBooking() {
		return discountPercentageThirtyDaysAdvanceBooking;
	}

	public void setDiscountPercentageThirtyDaysAdvanceBooking(int discountPercentageThirtyDaysAdvanceBooking) {
		this.discountPercentageThirtyDaysAdvanceBooking = discountPercentageThirtyDaysAdvanceBooking;
	}

	public int getDiscountPercentageSixtyDaysAdvanceBooking() {
		return discountPercentageSixtyDaysAdvanceBooking;
	}

	public void setDiscountPercentageSixtyDaysAdvanceBooking(int discountPercentageSixtyDaysAdvanceBooking) {
		this.discountPercentageSixtyDaysAdvanceBooking = discountPercentageSixtyDaysAdvanceBooking;
	}

	public int getDiscountPercentageNinetyDaysAdvanceBooking() {
		return discountPercentageNinetyDaysAdvanceBooking;
	}

	public void setDiscountPercentageNinetyDaysAdvanceBooking(int discountPercentageNinetyDaysAdvanceBooking) {
		this.discountPercentageNinetyDaysAdvanceBooking = discountPercentageNinetyDaysAdvanceBooking;
	}

	public int getBulkBookingDiscount() {
		return bulkBookingDiscount;
	}

	public void setBulkBookingDiscount(int bulkBookingDiscount) {
		this.bulkBookingDiscount = bulkBookingDiscount;
	}

	public int getRefundPercentageForTicketCancellation2DaysBeforeTravelDate() {
		return refundPercentageForTicketCancellation2DaysBeforeTravelDate;
	}

	public void setRefundPercentageForTicketCancellation2DaysBeforeTravelDate(int refundPercentageForTicketCancellation2DaysBeforeTravelDate) {
		this.refundPercentageForTicketCancellation2DaysBeforeTravelDate = refundPercentageForTicketCancellation2DaysBeforeTravelDate;
	}

	public int getRefundPercentageForTicketCancellation10DaysBeforeTravelDate() {
		return refundPercentageForTicketCancellation10DaysBeforeTravelDate;
	}

	public void setRefundPercentageForTicketCancellation10DaysBeforeTravelDate(int refundPercentageForTicketCancellation10DaysBeforeTravelDate) {
		this.refundPercentageForTicketCancellation10DaysBeforeTravelDate = refundPercentageForTicketCancellation10DaysBeforeTravelDate;
	}

	public int getRefundPercentageForTicketCancellation20DaysBeforeTravelDate() {
		return refundPercentageForTicketCancellation20DaysBeforeTravelDate;
	}

	public void setRefundPercentageForTicketCancellation20DaysBeforeTravelDate(int refundPercentageForTicketCancellation20DaysBeforeTravelDate) {
		this.refundPercentageForTicketCancellation20DaysBeforeTravelDate = refundPercentageForTicketCancellation20DaysBeforeTravelDate;
	}

	public int getSilverUserDiscount() {
		return silverUserDiscount;
	}

	public void setSilverUserDiscount(int silverUserDiscount) {
		this.silverUserDiscount = silverUserDiscount;
	}

	public int getGoldUserDiscount() {
		return GoldUserDiscount;
	}

	public void setGoldUserDiscount(int goldUserDiscount) {
		GoldUserDiscount = goldUserDiscount;
	}

	public int getPlatinumUserDiscount() {
		return PlatinumUserDiscount;
	}

	public void setPlatinumUserDiscount(int platinumUserDiscount) {
		PlatinumUserDiscount = platinumUserDiscount;
	}

	
}

