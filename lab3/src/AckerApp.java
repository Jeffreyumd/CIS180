import java.util.Scanner;

public class AckerApp {
	
	
	public static void main(String args[])
	{

		
		AckerFunction a = new AckerFunction();
		boolean check = true;
		Scanner input = new Scanner(System.in); //improt scanner class
		
		while(check == true)
		{
			System.out.println("Input 2 intergers seprated by a Space (Enter Q or q to quit):");
			
			String b; // store user input
			
			b = input.nextLine();
			
			 if(b.charAt(0) == 'q' || b.charAt(0) == 'Q')
			 	{
				check = false;
				System.out.println("Exit");
				System.exit(0);
			 	}
			
			 
			try
			{
				String[] parts = b.split(" "); // split the by a space 
				String m = parts[0];
				String n = parts[1];
				
				int numM = Integer.parseInt(m);
				int numN = Integer.parseInt(n);
				//System.out.println(numM);
				//System.out.println(numN);
				
				// run the acker function 
				a.acker(numM, numN);
				
				System.out.println("Total number of invocations = " + a.countOfInvocations() +
						", Result = " + a.printResult());
				
			}
			
			catch(Exception e)
			{
				System.out.println("You put in the wrong value");
			}// end of try chatch
			
		}// end of while 
		
		input.close();
		
		
		
		 
	}
}
