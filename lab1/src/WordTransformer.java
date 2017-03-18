/**
 * @author Jeffrey Alhassan
 * Date: 2/6/17
 *
 */
public class WordTransformer {
	
	
	private WordTransformer()
	{
		/**
		 * private constructor
		 */
	}

	
	static String makeCapital (String theWord){
		/* return 'theWord' with the first letter capitalized */
		
		String tempC; // store the string 
		char str[] = theWord.toCharArray();
		tempC = String.valueOf(str[0]).toUpperCase();
		char temp[] = tempC.toCharArray();
		
		str[0] = temp[0];
	
		return theWord = new String(str);
	}

	static String lowerCase (String theWord){
		/* return 'theWord' with the first letter in lowercase */
		
		return theWord.toLowerCase();
	}

	static String upperCaser (String theWord) {
		/* return 'theWord' in all uppercase */
		return theWord.toUpperCase();
	}

	static String lowerCaser (String thePhrase) {
		/* return 'theWord' in all lowerCase */
		return thePhrase.toLowerCase();
	}

	static String ezEncrypt (String theWord) {
		/* this method will take the every even/odd pair of letters and swaps them.
		 * In the case of an odd length word, the last letter will not move.
		 * Example theWord = "Super"
		 * returns "uSper"
		 */
		
		char str[] =  theWord.toCharArray(); // Convert and store the string in a char array
	    char temp; // store a index of a char 
	    
	    // swap the index of the char
	    for(int i=0; i < str.length; i=i+2)
	    {
	    	int x=i+1;
	    	
	    	temp = str[i];
	    	str[i] = str[x];
	    	str[x] = temp;    	 	
	    }
	    
		return theWord = new String(str);

	}
	
	static String ezDecrypt (String theWord){
		/**
		 * THis method reverse the effect of the ezEncrpt and fix it to normal 
		 */
		char str[] =  theWord.toCharArray();
	    char temp;

	    for(int i=0; i < str.length; i=i+2)
	    {
	    	int x=i+1;
	    	
	    	temp = str[i];
	    	str[i] = str[x];
	    	str[x] = temp;    	 	
	    }
	    
		return theWord = new String(str);
	}
	
	
}
