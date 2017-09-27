package com.test;

public class Traingle {
	private String type;
	private int area;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getArea() {
		return area;
	}
	
	
	
	
	public Traingle(int area) {
		
		this.area = area;
	}
public Traingle(String type,int area) {
	this.type = type;
		this.area = area;
	}
	
	
	public void draw()
	{
		System.out.println(getType()+"   traingle drawn with area " +getArea());
	}
	

}
