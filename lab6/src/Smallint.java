
public class Smallint {
	
	int k = 0;
	
	public Smallint(){
		
	}
	
	public int setValue(String s)
	{
		if(s.matches("[0-9]+"))
		{
			int num = Integer.parseInt(s); 
			if((num >= Integer.MIN_VALUE || num <= Integer.MIN_VALUE))
			{
				return k = num;
			} 
				else return 0;
		}
			else return -1;
	}
	
	public int getValue(){
		return k;
	}
	
	public int add(Smallint sInt)
	{
		int sum = this.getValue() + sInt.getValue();
		if(sum < Integer.MIN_VALUE || sum > Integer.MAX_VALUE){
			return 0;
		}
		
		else{
			return sum;
		}
	}
	
	public int subtract(Smallint sInt)
	{
		int sum = this.getValue() - sInt.getValue();
		if(sum < Integer.MIN_VALUE || sum > Integer.MAX_VALUE){
			return 0;
		}
		
		else{
			return sum;
		}
	}
	
	public int multiply(Smallint sInt)
	{
		int sum = this.getValue() * sInt.getValue();
		if(sum < Integer.MIN_VALUE || sum > Integer.MAX_VALUE){
			return 0;
		}
		
		else{
			return sum;
		}
	}
	
	public int divide(Smallint sInt)
	{
		int sum = this.getValue() / sInt.getValue();
		if(sum < Integer.MIN_VALUE || sum > Integer.MAX_VALUE){
			return 0;
		}
		
		else{
			return sum;
		}
	}

	
	
}
