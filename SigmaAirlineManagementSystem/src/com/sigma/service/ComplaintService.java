package com.sigma.service;
import com.sigma.beans.Complaint;
import com.sigma.dao.ComplaintDAOArrayImplementation;
import com.sigma.dao.ComplaintDao;
public class ComplaintService {

ComplaintDao complaintDao = new ComplaintDAOArrayImplementation();
	
	public int RegisterComplaint(Complaint complaint)
	{
		complaintDao.RegisterComplaint(complaint);
		return 0;
	}
	
	public void ViewComplaint()
	{
		complaintDao.ViewComplaint();
	}
}
