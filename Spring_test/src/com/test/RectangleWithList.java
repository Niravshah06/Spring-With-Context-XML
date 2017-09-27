package com.test;

import java.util.List;

public class RectangleWithList {

	private List<Point> pointList;
	

	public List<Point> getPointList() {
		return pointList;
	}

	public void setPointList(List<Point> pointList) {
		this.pointList = pointList;
	}
	
	public void drawfromList()
	{
		for(Point p:pointList)
			System.out.println(p.getX()  +" " + p.getY());
	}
}
