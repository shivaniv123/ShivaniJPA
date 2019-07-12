
public abstract class Employee extends Person
{
private  int empId;

public abstract double calSal();
 
public Employee(int empId, String name,String address)
{
	super(name,address);
	this.empId= empId;
	}

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

@Override
public String toString() {
	return super.toString()+"Employee [empId=" + empId + "]";
}


}
