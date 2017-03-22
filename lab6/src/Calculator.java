
public class Calculator implements Process{
	
    protected final String PROMPT = "Input two small integers !";
    
	protected final int SENTINEL = -1;
	protected int highestAge;
	protected GUI gui;
	
    Smallint a = new Smallint();
	Smallint b = new Smallint();
	
	private int j=0;
	private int k=1;
	
	public Calculator()
	{
		 gui = new GUI (this);
         gui.println(PROMPT + SENTINEL + "): ");
         gui.print("Enter the first integer: ");
        
	}



	@Override
	public void processInput(String s) {
		// TODO Auto-generated method stub
        final String CLOSE_WINDOW_PROMPT = "\nThe execution of this project has " +
                     "been completed.\nPlease close this window when you are ready.";

        switch(k)
        {
        case 1:
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
        case 2:
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
        case 3:
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
        case 4:
        	if(j == 0){
            	
            	gui.println(s);
            	a.setValue(s);
            	gui.print("Enter the second integer: ");
            	j++;
            }
            else if(j == 1){
            	
            	gui.println(s);
            	b.setValue(s);
            	
            	gui.println("Results: "+ a.getValue()+" / " + b.getValue() + " = " + a.divide(b));
            	gui.println(CLOSE_WINDOW_PROMPT);
            	gui.freeze();
            }
        	break;
        } 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator a = new Calculator();
	}

}
