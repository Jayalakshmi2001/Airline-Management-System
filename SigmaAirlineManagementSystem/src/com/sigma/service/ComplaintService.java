package com.sigma.service;
import com.sigma.beans.Complaint;
import com.sigma.dao.ComplaintDAOArrayImplementation;
import com.sigma.dao.ComplaintDao;
public class ComplaintService {

ComplaintDao complaintDao = new ComplaintDAOArrayImplementation();
	
	public int registerComplaint(Complaint complaint)
	{
		complaintDao.registerComplaint(complaint);
		return 0;
	}
	
	public Complaint viewComplaint(int compid) 
	{
		return complaintDao.viewComplaint(compid);
	}
	public Complaint[] viewComplaints()
	{
		return complaintDao.viewComplaints();
	}
	
	public boolean resolveComplaint(int compid,String newStatus) 
	{
		return complaintDao.resolveComplaint(compid,newStatus);	
	}
}
