package com.classss.pack;

public class Registration {

	private String name,email,password;
	public Registration() {
		super();
	}
	public Registration(String name, String email, String password) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
	}
	public String getname() {
		return name;
	}
	public void setname(String uname) {
		this.name = name;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	
	
}
