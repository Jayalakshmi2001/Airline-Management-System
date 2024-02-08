package com.sigma.dao;
import java.util.Arrays;

import com.sigma.beans.Carrier;
import com.sigma.beans.Conveyor;
import com.sigma.beans.Flight;
import com.sigma.dao.ConveyorDao;
public class ConveyorDAOArrayImplementation implements ConveyorDao {
		private Conveyor[] conveyorDetails=new Conveyor[0];
		
		public int mapConveyor(Conveyor conveyor) {
			// TODO Auto-generated method stub
			conveyorDetails=Arrays.copyOf(conveyorDetails,conveyorDetails.length+1);
			conveyorDetails[conveyorDetails.length-1]=conveyor;

			return 0;
		}
		
		public void fetchAllConveyors()
		{
			System.out.println("*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*");
			System.out.println("                                          Conveyor DETAILS                                     ");
			System.out.println("*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*");
			System.out.println("CONVEYORID     FLIGHTID   DATE ");
			
			for(Conveyor obj:conveyorDetails)
			{
				if(obj.getConveyorId()!=0)
				{
					System.out.println("   "+obj.getConveyorId()+"            "+obj.getFlightId()+"        "+obj.getDate());
					
				}
			}
		}
		
		
		public Conveyor fetchConveyorsById(int flightId) {
			// TODO Auto-generated method stub
			
			for(Conveyor obj:conveyorDetails)
			{
				if(obj.getFlightId()==flightId)
				{
					return obj;
				}
			}
			
		
			return null;
		}
}
