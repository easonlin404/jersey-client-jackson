package com.eason.jersey;

public class User {

	private String name;

	private String greet;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGreet() {
		return greet;
	}

	public void setGreet(String greet) {
		this.greet = greet;
	}
	
	public User(String name, String greet) {
		super();
		this.name = name;
		this.greet = greet;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", greet=" + greet + "]";
	}
}
