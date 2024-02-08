package com.sigma.dao;

import java.util.Arrays;
import java.util.Scanner;

import com.sigma.beans.Flight;
import com.sigma.dao.FlightDao;

public class FlightDAOArrayImplementation implements FlightDao {

	public static Flight[] flightdetails = new Flight[0];

	@Override
	public int addFlight(Flight flight) {
		// TODO Auto-generated method stub
		flightdetails=Arrays.copyOf(flightdetails,flightdetails.length+1);
		flightdetails[flightdetails.length-1]=flight;
		
		return 0;
	}


	/*public void updateFlight(Flight[] flightdetails,int flightid)
	{
		int flag=0;
		Scanner sc=new Scanner(System.in);
		for(Flight obj:flightdetails)
		{
			if(obj.getFlightId()==flightid)
			{
				
				viewParticularFlightDetails(obj);
			
				flag++;
				boolean loop=true;
				while(loop)
				{
					System.out.println("\n\n");
					System.out.println("Enter your choice to edit in flight "+obj.getFlightId());
					System.out.println("1.Edit Airfare");
					System.out.println("2.Edit Seat Capacity of Business Class");
					System.out.println("3.Edit Seat Capacity of Economy Class");
					System.out.println("4.Edit Seat Capacity of Executive Class");
					System.out.println("5.Exit");
					
					int ch=sc.nextInt();
					switch(ch)
					{
						case 1:
						{
							System.out.println("Enter airfare you want to edit:");
							int value=sc.nextInt();
							obj.setAirfare(value);
							System.out.println("Successfully edited");
							break;
						}
						case 2:
						{
							System.out.println("Enter seat capacity of business class you want to edit:");
							int value=sc.nextInt();
							obj.setBusinessSeat(value);
							System.out.println("Successfully edited");
							break;
						}
						case 3:
						{
							System.out.println("Enter seat capacity of economy class you want to edit:");
							int value=sc.nextInt();
							obj.setEconomySeat(value);
							System.out.println("Successfully edited");
							break;
						}
						case 4:
						{
							System.out.println("Enter seat capacity of executive class you want to edit:");
							int value=sc.nextInt();
							obj.setExecutiveSeat(value);
							System.out.println("Successfully edited"); 
							break;
						}
						case 5:
						{
							loop=false;
							break;
						}
						default:
							System.out.println("Invalid Choice. Please try again");
					}
				}
				System.out.println("Successfully updated all your details in "+obj.getFlightId());
				System.out.println("**************************************************");
				viewParticularFlightDetails(obj);
				System.out.println("**************************************************");
			}
		
			
		}
		if(flag==0)
		{
			System.out.println("Invalid flight id");
		}
	}
	*/

	public void deleteFlight(int flightid)
	{
		int count=0;
		for(Flight obj:flightdetails)
		{
			if(obj.getFlightId()==flightid)
			{
				count++;
				int seatcount=obj.getBusinessSeat()+obj.getEconomySeat()+obj.getExecutiveSeat();
				if(seatcount==0)
				{
					obj.setFlightId(0);
					System.out.println("Flight information successfully removed from system.");
					

				}
				else
				{
					System.out.println("Flight information can't be removed as there are Active Booking open in the system. Please attempt to remove this flight either by cancelling all open ticket or try after serving all open bookings.");
				}
			}
			
		}
		if(count==0)
		{
			System.out.println("No flight information is avialable for given flight id");
		}
	}
	
	
	public  void fetchAllFlights()
	{
		System.out.println("*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*");
		System.out.println("                                          FLIGHT DETAILS                                     ");
		System.out.println("*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*");
		System.out.println("FLIGHTID     CARRIERID     ORIGIN     DESTINATION     AIRFARE     BUSINESS CLASS SEAT     ECONOMY CLASS SEAT     EXECUTIVE CLASS SEAT	 DATE");
		
		for(Flight obj:flightdetails)
		{
			if(obj.getFlightId()!=0)
			{
				System.out.println("   "+obj.getFlightId()+"            "+obj.getCarrierId()+"        "+obj.getOrigin()+"       "+obj.getDestination()+"         "+obj.getAirfare()+"            "+obj.getBusinessSeat()+"                "+obj.getEconomySeat()+"                "+obj.getExecutiveSeat());
				
			}
		}
	}


	public Flight fetchFlightsbyId(int flightid) 
	{
		// TODO Auto-generated method stub
		for(Flight obj:flightdetails)
		{
			if(obj.getFlightId()==flightid)
			{
				return obj;
			}
		}
	
		return null;
	}
	
	public void viewParticularFlightDetails(Flight obj)
	{
		System.out.println("Flight Id : "+obj.getFlightId());
		System.out.println("Carrier Id : "+obj.getCarrierId()); 
		System.out.println("Origin : "+obj.getOrigin());
		System.out.println("Destination : "+obj.getDestination());
		System.out.println("Airfare : "+obj.getAirfare());
		System.out.println("SeatCapacityBusinessClass : "+obj.getBusinessSeat());
		System.out.println("SeatCapacityEconomyClass : "+obj.getEconomySeat());
		System.out.println("SeatCapacityExecutiveClass : "+obj.getExecutiveSeat());
	}


	@Override
	public void searchFlightDetails(String searchOrigin, String searchDestination, String searchDate) {
		// TODO Auto-generated method stub
		System.out.println("FLIGHTID     CARRIERID     ORIGIN     DESTINATION     AIRFARE     BUSINESS CLASS SEAT     ECONOMY CLASS SEAT     EXECUTIVE CLASS SEAT    DATE");
		for(Flight obj : flightdetails)
		{
			if(obj.getOrigin().equalsIgnoreCase(searchOrigin)&&obj.getDestination().equalsIgnoreCase(searchDestination))
			{
				System.out.println("   "+obj.getFlightId()+"            "+obj.getCarrierId()+"        "+obj.getOrigin()+"       "+obj.getDestination()+"         "+obj.getAirfare()+"            "+obj.getBusinessSeat()+"                "+obj.getEconomySeat()+"                "+obj.getExecutiveSeat());

			}
			
		}
	}

}


