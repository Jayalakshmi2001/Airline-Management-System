package com.sigma.beans;

public class Bookings {
	private int id=101;
	private int bookingid;
	private int flightid;
	private int tcount;
	private String username;
	private int noseats;
	private String scategory;
	private String ccategory;
	private String tdate;
	private String bookingstatus;
	private int bookingamt=10000;
	public Bookings(int flightid,int tcount,String scategory,String ccategory,String tdate)
	{
		this.bookingid=id++;
		this.flightid=flightid;
		this.tcount=tcount;
		this.ccategory=ccategory;
		this.tdate=tdate;
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public int getFlightid() {
		return flightid;
	}
	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}
	public int getTcount() {
		return tcount;
	}
	public void setTcount(int tcount) {
		this.tcount = tcount;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getNoseats() {
		return noseats;
	}
	public void setNoseats(int noseats) {
		this.noseats = noseats;
	}
	public String getScategory() {
		return scategory;
	}
	public void setScategory(String scategory) {
		this.scategory = scategory;
	}
	public String getCcategory() {
		return ccategory;
	}
	public void setCcategory(String ccategory) {
		this.ccategory = ccategory;
	}
	public String getTdate() {
		return tdate;
	}
	public void setTdate(String tdate) {
		this.tdate = tdate;
	}
	public String getBookingstatus() {
		return bookingstatus;
	}
	public void setBookingstatus(String bookingstatus) {
		this.bookingstatus = bookingstatus;
	}
	public int getBookingamt() {
		return bookingamt;
	}
	public void setBookingamt(int bookingamt) {
		this.bookingamt = bookingamt;
	}
	

}


