package com.cg.triangle;

public class Triangle implements ITriangle {
  
	int x1,x2,x3,y1,y2,y3;

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getX3() {
		return x3;
	}

	public void setX3(int x3) {
		this.x3 = x3;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public int getY3() {
		return y3;
	}

	public void setY3(int y3) {
		this.y3 = y3;
	}

	@Override
	public String toString() {
		return "Triangle [x1=" + x1 + ", x2=" + x2 + ", x3=" + x3 + ", y1="
				+ y1 + ", y2=" + y2 + ", y3=" + y3 + "]";
	}

	@Override
	public void Draw(int x1, int y1, int x2, int y2, int x3, int y3) {
		// TODO Auto-generated method stub
		System.out.println("point 1 ="+x1+","+y1);
		System.out.println("point 2 ="+x2+","+y2);
		System.out.println("point 3 ="+x3+","+y3);
	} 
	
	
}
