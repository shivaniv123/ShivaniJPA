
public class CreateStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("No of object="+Student.getCnt());
     Student ref=null;
     ref=new Student();
     System.out.println("No of object="+Student.getCnt());
    // ref.setStuName("Rimali");
    // ref.setRollNo(11);
     System.out.println("Roll Number ="+ref.getRollNo());
     System.out.println("Name="+ref.getStuName());
     
     Student obj = new Student(12,"Priya");
    System.out.println("obj Name ="+obj.getStuName());
    System.out.println("obj rollno ="+obj.getRollNo());
	}

}
