package com;

public class User {
	private String name;
	private String roll;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public void init(){
		System.out.println("init method calling.......");
	}
	public void destory(){
		System.out.println("destory method calling......");
	}
}
