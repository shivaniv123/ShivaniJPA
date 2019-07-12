
public enum Course {
	JEE(12),VNV(10),SAP(10),BI(10);
	int seats;
	
	Course(int seats)
	{
	this.seats= seats;
	}
	int getSeats()
	{
		return this.seats;
		
		
	}

}
