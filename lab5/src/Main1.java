
public class Main1 {
	
	public static void main(String args[])
	{
		//Thread a = new MyThread('J');
		//a.start();
		
		Thread t1 = new MyThread('h');
		Thread t2 = new MyThread('a');
		
		t1.start();
		t2.start();
	}

}
