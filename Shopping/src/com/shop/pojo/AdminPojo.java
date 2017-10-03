package com.shop.pojo;

public class AdminPojo {

	private String adminname;
	private String adminpass;
	
	
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getAdminpass() {
		return adminpass;
	}
	public void setAdminpass(String adminpass) {
		this.adminpass = adminpass;
	}
	@Override
	public String toString() {
		return "AdminPojo [adminname=" + adminname + ", adminpass=" + adminpass + "]";
	}
	public AdminPojo(String adminname, String adminpass) {
		super();
		this.adminname = adminname;
		this.adminpass = adminpass;
	}
	public AdminPojo() {
		super();
	}
	
	
}
