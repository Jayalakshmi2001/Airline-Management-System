package com.sigma.beans;

public class Complaint {
	private int complaintId;
	private static int id=101;
	private int userId;
	private static int uid=201;
	private String status;
	private String reason;
	
	
	public Complaint(String status, String reason) {
		super();
		this.complaintId = id++;
		this.userId = uid++;
		this.status = status;
		this.reason = reason;
	}
	public int getComplaintId() {
		return complaintId;
	}
	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
}

