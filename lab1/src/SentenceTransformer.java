/**
 * @author Jeffrey Alhassan
 * Date: 2/6/17
 *
 */
public class SentenceTransformer {
	
	private SentenceTransformer()
	{
		/**
		 * Private Constructor
		 */
	}
	

	
	static String firstWord (String thePhrase) {
		/* take 'thePhrase' and return only the first word*/
		return thePhrase.substring(0, 8);
	}

	static String lastWords (String thePhrase) {
		/* take 'thePhrase' and return the entire phrase except the first word */
		return thePhrase.substring(8);
	}

	static int countCharacter(String thePhrase,char letter){
		/* take 'thePhrase' and return the number of times 'letter' occurs in it 
		 * example:    SentenceTransformer.countCharacter("This is one boring lab", 'o') 
		 * would return 2
		 */
		
		int counter = 0; // keep count of count
		char temp; // store special character
		
		for(int i=0; i < thePhrase.length(); i++)
		{
			temp = thePhrase.charAt(i);
			if(temp == letter)
			{
				counter ++;
			}
		}
		
		//System.out.println(counter);
		return counter;

	}
	
	static String depunctuate (String thePhrase){
		/* take 'thePhrase' and remove '.' '!' and '?' characters
		 * from it and replace them with ' ' (spaces)
		 */
		
		char temp; //store special character
		
		// make an index for all the character in the string
		for(int i=0; i < thePhrase.length(); i++)
		{
			temp = thePhrase.charAt(i); // store the index of the character
			
			//identify the special characters
			if(temp == '.')
			{
				thePhrase = thePhrase.replace(temp, ' ');
			}
			
			if(temp == '!')
			{
				thePhrase = thePhrase.replace(temp, ' ');
			}
			
			if(temp == '?')
			{
				thePhrase = thePhrase.replace(temp, ' ');
			}
			
		}
		
		return thePhrase;
	}
}

