
public class Rectangle extends Shape 
{
      int l;
      int b;
      
      @Override
	public double calArea()
  	{
  		return l*b;
  	}

      
	public Rectangle(int l, int b) {
		super();
		this.l = l;
		this.b = b;
	}


	public int getL() {
		return l;
	}


	public void setL(int l) {
		this.l = l;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	@Override
	public String toString() {
		return "Rectangle [l=" + l + ", b=" + b + "]";
	}
      
}