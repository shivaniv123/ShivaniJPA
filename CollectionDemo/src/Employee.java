
public class Employee {
 
	String name;
	String Address;
    int Id;
    int Salary;
    
    
	
	public Employee(String name, String address, int id, int salary) {
		super();
		this.name = name;
		Address = address;
		Id = id;
		Salary = salary;
	}
	



	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getAddress() {
		return Address;
	}




	public void setAddress(String address) {
		Address = address;
	}




	public int getId() {
		return Id;
	}




	public void setId(int id) {
		Id = id;
	}




	public int getSalary() {
		return Salary;
	}




	public void setSalary(int salary) {
		Salary = salary;
	}
	




	@Override
	public String toString() {
		return "Employee [name=" + name + ", Address=" + Address + ", Id=" + Id
				+ ", Salary=" + Salary + "]";
	}




	


}
