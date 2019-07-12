
public class Student {
	
	int rollNo;
	String stuName;
	public Student(int rollNo, String stuName) {
		super();
		this.rollNo = rollNo;
		this.stuName = stuName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", stuName=" + stuName + "]";
	}
	
	

}
