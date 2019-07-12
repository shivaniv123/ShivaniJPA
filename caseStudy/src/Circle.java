
public class Circle extends Shape {

	int r;
	
	@Override
	public double calArea()
	{
		return 3.14*r*r;
	}

	public Circle(int r) {
		super();
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}
	
	
}
