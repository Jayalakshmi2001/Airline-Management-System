package ams;

public class Flight 
{
	static private int flightid;
	private int carrierid;
	private String origin;
	private String destination;
	private int airfare;
	private int businessseat;
	private int economyseat;
	private int executiveseat;
	
	public Flight(int carrierid,String origin,String destination,int airfare,int businessseat,int economyseat,int executiveseat)
	{
		
		this.carrierid=carrierid;
		this.origin=origin;
		this.destination=destination;
		this.airfare=airfare;
		this.businessseat=businessseat;
		this.economyseat=economyseat;
		this.executiveseat=executiveseat;
	}
} 
