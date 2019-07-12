
public class Student {

	private int rollNo;
	private String stuName;
	private static int cnt=0;
	
	public Student()
	{
		this.rollNo=90;
		this.stuName="Abc";
	}
	
	
	public Student(int rollNo, String stuName) {
		
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
	public static int getCnt()
	{
		return cnt;
	}
}
