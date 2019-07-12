
public class MainClass {

	public static void main(String[] args) {
		
		Course course= Course.JEE;
		
		Trainee trainee= new Trainee("Abha",course);
		System.out.println("name ="+ trainee.getName());
		System.out.println("course ="+trainee.getCourse());
		System.out.println("no of seats ="+trainee.getCourse().getSeats());
		// TODO Auto-generated method stub

	}

}
