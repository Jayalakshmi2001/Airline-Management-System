package com.sigma.dao;
import java.util.Arrays;

import com.sigma.beans.*;
public class ConveyorDAOArrayImplementation implements ConveyorDao 
{
		private static Conveyor[] conveyorDetails=new Conveyor[0];
		
		public int mapConveyor(Conveyor conveyor) 
		{
			conveyorDetails=Arrays.copyOf(conveyorDetails,conveyorDetails.length+1);
			conveyorDetails[conveyorDetails.length-1]=conveyor;

			return 0;
		}
		
		public Conveyor[] fetchAllConveyors()
		{
			if(conveyorDetails.length>0)
			{
				return conveyorDetails;
			}
			else
				return null;
		}
		
		
		public Conveyor fetchConveyorsById(int flightId) 
		{
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

