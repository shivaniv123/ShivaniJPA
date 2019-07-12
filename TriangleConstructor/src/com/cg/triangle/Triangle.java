package com.cg.triangle;

public class Triangle  implements ITriangle{

	int x1,x2,x3,y1,y2,y3;
	
	public Triangle(int x1, int x2, int x3, int y1, int y2, int y3) {
		super();
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
		/*System.out.println("point 1 ="+x1+","+y1);
		System.out.println("point 2 ="+x2+","+y2);
		System.out.println("point 3 ="+x3+","+y3);*/
	}


	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("point 1 ="+x1+","+y1);
		System.out.println("point 2 ="+x2+","+y2);
		System.out.println("point 3 ="+x3+","+y3);
	}

}
