package com.shop.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="shopping")
public class ShoppingPojo {
	
	@Column(name="fname")
	private String fname;
	
	@Column(name="lname")
	private String lname;
	
	@Column(name="email")
	private String email;
	
	@Column(name="pass")
	private String pass;
	
	@Column(name="country")
	private String country;
	
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	public ShoppingPojo(String fname, String lname, String email, String pass, String country) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pass = pass;
		this.country = country;
	}
	public ShoppingPojo(String email, String pass) {
		super();
		
		this.email = email;
		this.pass = pass;
		
	}
	public ShoppingPojo(){
		
		super();
	}
	
	@Override
	public String toString() {
		return "ShoppingPojo [fname=" + fname + ", lname=" + lname + ", email=" + email + ", pass=" + pass
				+ ", country=" + country + "]";
	}
	
	

}
