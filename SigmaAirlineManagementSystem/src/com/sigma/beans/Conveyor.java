package com.sigma.beans;

public class Conveyor 
{
	private static int id=501;
	private int conveyor_id;
	private int flightid;
	private String date;
	
	public Conveyor(int flightid,String date)
	{
		this.conveyor_id=id++;
		this.flightid=flightid;
		this.date=date;
	}

	public int getConveyorId() {
		return conveyor_id;
	}

	public void setConveyorId(int conveyor_id) {
		this.conveyor_id = conveyor_id;
	}

	public int getFlightId() {
		return flightid;
	}

	public void setFlightd(int flightid) {
		this.flightid = flightid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
