
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable runnable=new MyThread();
		Thread t1=new Thread(runnable);
		
		t1.setPriority(4);
		t1.setName("First Thread");
		t1.start();
		
       Thread t2=new Thread(runnable);
	   t2.setPriority(8);
	   t2.setName("Second-Thread");
	   t2.start();
	   try {
		t2.join(100);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
