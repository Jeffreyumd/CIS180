/**
 * 
 * @author Jeffrey A
 * Date: 3/21/17
 */
public class Calculator implements Process{
	
    protected final String PROMPT = "Input two small integers !";
	protected GUI gui;
	
	//instance for the Smallint 
    Smallint a = new Smallint();
	Smallint b = new Smallint();
	
	private int j=0; // keep track of first or second input
	private int k=1; // keep track of switch
	
	public Calculator()
	{
		 gui = new GUI (this);
         gui.println(PROMPT);
         
         gui.print("Enter the first integer: ");
        
	}

	@Override
	public void processInput(String s) {
		// TODO Auto-generated method stub
        final String CLOSE_WINDOW_PROMPT = "\nThe execution of this project has " +
                     "been completed.\nPlease close this window when you are ready.";
        
        // switch the time of math done on the values
        switch(k)
        {
        case 1: // addition
            if(j == 0){
            	
            	gui.println(s);
            	a.setValue(s);
            	gui.print("Enter the second integer: ");
            	j++;
            }
            else if(j == 1){
            	
            	gui.println(s);
            	b.setValue(s);
            	
            	gui.println("Results: "+ a.getValue()+" + " + b.getValue() + " = " + a.add(b));
            	gui.print("Enter the first integer: ");
            	j=0;
                k++;
            }
            
        	break;
        case 2: //subtraction
        	if(j == 0){
            	
            	gui.println(s);
            	a.setValue(s);
            	gui.print("Enter the second integer: ");
            	j++;
            }
            else if(j == 1){
            	
            	gui.println(s);
            	b.setValue(s);
            	
            	gui.println("Results: "+ a.getValue()+" - " + b.getValue() + " = " + a.subtract(b));
            	gui.print("Enter the first integer: ");
            	j=0;
                k++;
            }
            
        	break;
        case 3: //Multiplication
        	if(j == 0){
            	
            	gui.println(s);
            	a.setValue(s);
            	gui.print("Enter the second integer: ");
            	j++;
            }
            else if(j == 1){
            	
            	gui.println(s);
            	b.setValue(s);
            	
            	gui.println("Results: "+ a.getValue()+" * " + b.getValue() + " = " + a.multiply(b));
            	gui.print("Enter the first integer: ");
            	j=0;
                k++;
            }
        	break;
        case 4: // Division
        	if(j == 0){
            	
            	gui.println(s);
            	a.setValue(s);
            	gui.print("Enter the second integer: ");
            	j++;
            }
            else if(j == 1){
            	
            	gui.println(s);
            	b.setValue(s);
            	
            	// if the user trys to divide by 0
            	if(b.getValue() == 0 || a.getValue() == 0)
            	{
            		gui.print("Undifine");
            	} else {
            	
            	gui.println("Results: "+ a.getValue()+" / " + b.getValue() + " = " + a.divide(b));
            	gui.println(CLOSE_WINDOW_PROMPT);
            	gui.freeze(); // end the questions
            	}
            }
        	break;
        } // end of switch
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator a = new Calculator();
	}

}
