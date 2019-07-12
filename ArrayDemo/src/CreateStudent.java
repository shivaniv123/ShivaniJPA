
public class CreateStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student [] stu =new Student[3];//allocating memory for 3 student 
    stu[0]=new Student(12,"Ram");
    stu[1]=new Student(17,"shaliu");
    System.out.println(stu[0].getStuName());
	}

}
