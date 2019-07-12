
public class WageEmp extends Employee
{
      int hour;
      int rate;
      
      @Override
      public double calSal()
      {
    	  
    	 return hour*rate;
      }
      
	public WageEmp(int empId, String name, String address, int hour, int rate) 
	{
		super(empId, name, address);
		this.hour = hour;
		this.rate = rate;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return super.toString()+"WageEmp [hour=" + hour + ", rate=" + rate + "]";
	}
	
      
      
}
