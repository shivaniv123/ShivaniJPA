
public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Rectangle r=new Rectangle(56,67);
       System.out.println("Area of Rectangle = "+r.calArea());
       
       Circle c=new Circle(97);
       System.out.println("Area of circle = "+c.calArea());
       
       Triangle t=new Triangle(18,14);
       System.out.println("Area of triangle = "+t.calArea());
	}

}
