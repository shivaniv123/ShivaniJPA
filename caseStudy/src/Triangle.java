
public class Triangle extends Shape{
	int b;
	int h;
	
	@Override
	public double calArea()
	{
		return 0.5*b*h;
	}
	
	
	public Triangle(int b, int h) {
		super();
		this.b = b;
		this.h = h;
	}
	public int getBase() {
		return b;
	}
	public void setBase(int b) {
		this.b = b;
	}
	public int getHeight() {
		return h;
	}
	public void setHeight(int h) {
		this.h = h;
	}


	@Override
	public String toString() {
		return "Triangle [b=" + b + ", h=" + h + "]";
	}
	
	
	

}
