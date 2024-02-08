package com.sigma.dao;
import java.util.Arrays;

//import com.sigma.beans.Carrier;
//import com.sigma.beans.Carrier;
import com.sigma.beans.Complaint;

public class ComplaintDAOArrayImplementation implements ComplaintDao {

	private Complaint[] complaintdetails= new Complaint[0];
	@Override
	public int RegisterComplaint(Complaint complaint) {
		// TODO Auto-generated method stub
		complaintdetails=Arrays.copyOf(complaintdetails,complaintdetails.length+1);
		complaintdetails[complaintdetails.length-1]=complaint;

		return 0;
	}
	
	public void ViewComplaint()
	{
		System.out.println("*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*");
		System.out.println("                                       Complaint DETAILS                                     ");
		System.out.println("*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*");
		System.out.println("COMPLAINT_ID         USER_ID        STATUS          REASON");
		
		for(Complaint obj:complaintdetails)
		{
			if(obj.getComplaintId()!=0)
			{
				System.out.println("   "+obj.getComplaintId()+"      "+obj.getUserId()+"      "+obj.getStatus()+"       "+obj.getReason());
				
			}
		}
	}
	
}
