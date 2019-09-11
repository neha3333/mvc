package com.springonemvcone;

public class User {

	String name, password;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName()+" "+getPassword();
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
