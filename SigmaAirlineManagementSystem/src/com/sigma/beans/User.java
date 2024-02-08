package com.sigma.beans;

public class User {
	private int id=1;
	private String user_name;
	private String user_pwd;
	private String customer_category;
	private long phn_no;
	private String email;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String country;
	private int zipcode;
	private String dob;
	public User(String user_name, String user_pwd, String customer_category, long phn_no, String email,
			String address1, String address2, String city, String state, String country, int zipcode, String dob) {
		super();
		this.id = id++;
		this.user_name = user_name;
		this.user_pwd = user_pwd;
		this.customer_category = customer_category;
		this.phn_no = phn_no;
		this.email = email;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getCustomer_category() {
		return customer_category;
	}
	public void setCustomer_category(String customer_category) {
		this.customer_category = customer_category;
	}
	public long getPhn_no() {
		return phn_no;
	}
	public void setPhn_no(long phn_no) {
		this.phn_no = phn_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	

}

