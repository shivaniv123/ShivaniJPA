package com.cg.triangle;

public class Point implements IPoint {
	
	private int x1,y1,x2,y2,x3,y3;

	
	public Point(int x1, int y1, int x2, int y2, int x3, int y3) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}

	@Override
	public String getPoint1() {
		// TODO Auto-generated method stub
		return "x "+x1+" "+"y "+y1;
	}

	@Override
	public String getPoint2() {
		// TODO Auto-generated method stub
		return "x "+x2+" "+"y "+y2 ;
	}

	@Override
	public String getPoint3() {
		// TODO Auto-generated method stub
		return "x "+x3+" "+"y "+y3;
	}

	

}
