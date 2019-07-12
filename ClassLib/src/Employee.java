
public class Employee {

	private int empId;
	private String empName;
	@Override
	public boolean equals(Object obj)
	{
		Employee ref=(Employee)obj; //type casting
		boolean flag=false;
		if(this.empId==ref.empId && this.empName.equals(ref.empName))
		{
			flag=true;
		}
		return flag;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", getEmpId()=" + getEmpId() + ", getEmpName()="
				+ getEmpName() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
}
