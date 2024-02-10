package com.sigma.dao;
import com.sigma.beans.Complaint;


public interface ComplaintDao {
	public int registerComplaint(Complaint complaint);
	public Complaint viewComplaint(int compid);
	public Complaint[] viewComplaints();
	public boolean resolveComplaint(int compid,String newStatus);
}
