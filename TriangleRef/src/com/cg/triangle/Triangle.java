package com.cg.triangle;

public class Triangle implements ITriangle {

	private Point point1;
	private Point point2;
	private Point point3;
	
	public Triangle()
	{
		System.out.println("Triangle Constructor");
	}
	
	
	public Point getPoint1() {
		return point1;
	}


	public void setPoint1(Point point1) {
		this.point1 = point1;
	}


	public Point getPoint2() {
		return point2;
	}


	public void setPoint2(Point point2) {
		this.point2 = point2;
	}


	public Point getPoint3() {
		return point3;
	}


	public void setPoint3(Point point3) {
		this.point3 = point3;
	}


	@Override
	public String draw() {
		// TODO Auto-generated method stubP
   
    return "Point 1 :" +point1.getPoint1()+"  Point 2 : "+point2.getPoint2()+"  Point 3 : "+point3.getPoint3();
	}

}
