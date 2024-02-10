package com.sigma.dao;
import java.util.Arrays;

//import com.sams.beans.Carrier;
//import com.sams.beans.Carrier;
import com.sigma.beans.Complaint;
public class ComplaintDAOArrayImplementation implements ComplaintDao {

	private Complaint[] complaintdetails= new Complaint[0];
	@Override
	public int registerComplaint(Complaint complaint) 
	{
		complaintdetails=Arrays.copyOf(complaintdetails,complaintdetails.length+1);
		complaintdetails[complaintdetails.length-1]=complaint;

		return 0;
	}
	
	public Complaint[] viewComplaints()
	{
		if(complaintdetails.length>0)
		{
			return complaintdetails;
		}
		return null;
	}
	
	public Complaint viewComplaint(int compid) 
	{
		for(Complaint obj:complaintdetails)
		{
			if(obj.getComplaintId()==compid)
			{
				return obj;
			}
		}
		return null;
	}
	public boolean resolveComplaint(int compid,String newStatus) 
	{
		for(Complaint obj:complaintdetails)
		{
			if(obj.getComplaintId()==compid)
			{
				obj.setStatus(newStatus);
				return true;
			}
		}
		return false;
	}
	
}


