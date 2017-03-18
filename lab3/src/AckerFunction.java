

/***********************************************************
* Lab #3 (CIS 181) *
* Submitted By: Your name here !!! *
* SID: Your new SID starting with "00" *
* Date: Your submission date *
***********************************************************/
public class AckerFunction{
	
	
 private int spaces = 0;
 private int numberOfInvocations = 0;
 // get results 
 private int results = 0;
 // getter for data field "numberOfInvocations"
 
 public int countOfInvocations(){
 return numberOfInvocations;
 }
 
 public int printResult(){
	 return results;
 }
 
 
 
 public int acker(int m, int n){
	 
 //int result = 0;
 //TODO: implement the Ackermann's function to trace the method
//invocation
 // history and count the totoal number of invocations.
 
 

 if(m == 0)
 {
	 printSpaces(); 
	 spaces++;
	 System.out.println("Enter method acker: m = "+ m + ", "+"n = " + n);
	 results = n+1;
	 numberOfInvocations++;
 }
	 
 else if(n == 0)
 {
	 printSpaces(); 
	 spaces++;
	 System.out.println("Enter method acker: m = "+ m + ", "+"n = " + n);
	 acker(m-1,1);
	 numberOfInvocations++;
 }
	 
 else
 {
	 printSpaces(); 
	 spaces++;
	 System.out.println("Enter method acker: m = "+ m + ", "+"n = " + n);
	 acker(m-1,acker(m,n-1));
	 numberOfInvocations++;
 }
	
 
 spaces--;
 printSpaces();
 System.out.println("Leave method acker: ("+ m + ", " + n + ")" + " = " + results);
 
 return results;
 }
 
 
 // Indent the trace messages according to how "deep" the current
//recursive call is.
 // To be called by method acker only.
 
 
 private void printSpaces(){
 for (int i = 0; i < spaces; i++)
 System.out.print("	");
 }

}