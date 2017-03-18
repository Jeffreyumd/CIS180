import java.util.concurrent.Semaphore;

public class MyThread extends Thread{
	
	public char letter;
	static Semaphore s = new Semaphore(1,true);
	
	public MyThread(char a)
	{
		letter = a;
	}
	
	public char getLetter()
	{
		return letter;
	}
	
	
	public void run()
	{
		for(int i=0; i < 1000; i++)
		{
			
			try {
				s.acquire();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			Thread.yield();
			System.out.print(getLetter());
			
			
			

			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}// end of try
			
			s.release();
			
		} // end of for loop
	}
	
	
	


}
