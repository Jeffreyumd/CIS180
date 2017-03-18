/***********************************************************
 * Lab #1 (CIS 181, Fall 2017)                             *
 * Submitted By: Jeffrey Alhassan                       				*
 * SID:                    *
 * Date: 2/7/2017                              *
 ***********************************************************/

/*
 * Created on September 16, 2006
 * @author Haiping Xu
 */

public class Date {
    private int month;
    private int day;
    private int year;

    public Date() {
        month = 1;
        day = 1;
        year =2006;
    }

    public Date (int m, int d, int y){
        month = m;
        day = d;
        year =y;
    }

    // -----------------------------------------------------------------------------
    // Check if a date is valid.
    // Preconditon: mon, day and year are integers.
    // Postcondtion: If the combination of mon, day and year represents a valid date,
    //       a true value is returned; othereise, a false value is returned.
    // -----------------------------------------------------------------------------
    public static boolean isLegitimate(int mon, int day, int year){

        // February has 29 days in any year evenly divisible by four,
        // EXCEPT for centurial years which are not also divisible by 400.
    	
    	
    	
    	// check to see if the month is a valid number
    	if(mon <= 0 || mon > 12)
    	{
    		return false;
    	}
    	
    	// check to see if the year is a valide number
    	if(year <= 0)
    	{
    		return false;
    	}
    	
    	// check for months with 30 days
    	if(mon == 4 || mon == 6 || mon == 9 || mon == 11)
    	{
    		if(day <= 0 || day > 30)
    		{
    			return false;
    		}
    		
    		day = 30;
    	}
    	
    	// check for months with 31 days 
    	if(mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12 )
    	{
    		if(day < 0 || day > 31)
    		{
    			return false;
    		}
    		
    		day = 31;
    	}
    	
    	// check for leap years and it conditions 
		if(mon == 2)
		{
			//if is a leap year 
			if( ((year % 4 == 0) && ((!(year % 100 == 0))) || (year % 400 == 0)) )
			{
				if(day < 0 || day > 29)
				{
					return false;
				}
				
				day = 29;
			}
			
			//none leap year 
			else{
				
				if(day < 0 || day > 28)
				{
					return false;
				}
				
				day = 28;
			}
		}
    	
        // TODO 1: Check if a date is valid.

        return true;
    }

    // -----------------------------------------------------------------------------
    // Advance a given date by one day
    // Preconditon: aDate is a valid date
    // Postcondtion: aDate is a new valid date that is increased by one day
    // -----------------------------------------------------------------------------
    public static void advanceDate(Date aDate) {


        // TODO 2: Implement this method to advance aDate by one day.
    	
    	
    	// check to see if it is the last day of the month and increment by 1
    	if(aDate.day == 31 && aDate.month == 1 || aDate.month == 3 || aDate.month == 5 ||
    	aDate.month == 7 || aDate.month == 8 || aDate.month == 10 || aDate.month == 12)
    	{
    		aDate.day = 0;
    		aDate.month = aDate.month + 1;
    	}
    	
    	// check to see if it is the last day of the month and increment by 1
    	if(aDate.day == 30 && aDate.month == 4 || aDate.month == 6 || aDate.month == 9 || aDate.month == 11)
    	{
    		aDate.day = 0;
    		aDate.month = aDate.month + 1;
    	}
    	
    	// check for leap year
    	if(aDate.month == 2)
    	{
    		if( ((aDate.year % 4 == 0) && ((!(aDate.year % 100 == 0))) || (aDate.year % 400 == 0)) )
			{
    			if(aDate.day == 29)
    			{
        			aDate.day = 0;
            		aDate.month = aDate.month + 1;
    			}
			}
    		
    		else if(aDate.day >= 28)
        	{
        		aDate.day = 0;
        		aDate.month = aDate.month + 1;
        	}
    		
    		
    	}

    	// check to see if it is a new month 
    	if(aDate.month > 0 && aDate.month <= 12)
    	{
    		aDate.day++;
    	}
    	
    	// check to see if it is a new year
    	if(aDate.month > 12)
    	{
    		aDate.day = 1;
    		aDate.month = 1;
    		aDate.year++;
    	}
    	
    	
    	
    }

    public void display(String s){
        System.out.println(s + month + "/" + day + "/" + year);
    }
}
