
public class MyThread implements Runnable {
	
	@Override
	public  void run()
	{
		System.out.println("current thread in run = "+
	Thread.currentThread().getName());
		
		System.out.println("Priority = "+Thread.currentThread().getPriority());
		System.out.println("Alive ="+Thread.currentThread().isAlive());
		
		synchronized(this)
		{System.out.println("current thread in run in block = "+
				Thread.currentThread().getName());
		for(int i=0;i<10;i++)
		{
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("i = "+i);
		}
	}
	}

}
