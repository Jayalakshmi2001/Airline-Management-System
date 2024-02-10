package com.sigma.beans;


public class Flight 
{
	private static int id=1;
	private int flightid;
	private int carrierid;
	private String origin;
	private String destination;
	private int airfare;
	private int businessseat;
	private int economyseat;
	private int executiveseat;

	public Flight(int carrierid,String origin,String destination,int airfare,int businessseat,int economyseat,int executiveseat)
	{
		this.flightid=id++;
		this.carrierid=carrierid;
		this.origin=origin;
		this.destination=destination;
		this.airfare=airfare;
		this.businessseat=businessseat;
		this.economyseat=economyseat;
		this.executiveseat=executiveseat;
	}
	
	public int getFlightId() {
		return flightid;
	}

	public void setFlightId(int flightid) {
		this.flightid = flightid;
	}

	public int getCarrierId() {
		return carrierid;
	}

	public void setCarrierId(int carrierid) {
		this.carrierid = carrierid;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getAirfare() {
		return airfare;
	}

	public void setAirfare(int airfare) {
		this.airfare = airfare;
	}

	public int getBusinessSeat() {
		return businessseat;
	}

	public void setBusinessSeat(int businessseat) {
		this.businessseat = businessseat;
	}

	public int getEconomySeat() {
		return economyseat;
	}

	public void setEconomySeat(int economyseat) {
		this.economyseat = economyseat;
	}

	public int getExecutiveSeat() {
		return executiveseat;
	}

	public void setExecutiveSeat(int executiveseat) {
		this.executiveseat = executiveseat;
	}
	
}


