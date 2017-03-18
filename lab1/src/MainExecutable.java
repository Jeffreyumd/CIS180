import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * @author Jeffrey Alhassan
 * Date: 2/6/17
 *
 */


public class MainExecutable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		try {
			
			// instance for the file being created 
			PrintWriter item = new PrintWriter(new FileWriter("file.txt", false));
			
			String s = new String("Dr.Nick: \"Hello everybody!\"");
			
			// print the data on a text file

			item.println("firstWord: " + SentenceTransformer.firstWord(s));
			item.println("lastWords: " + SentenceTransformer.lastWords(s));
			item.println("countCharacter: " +SentenceTransformer.countCharacter(s, 'e')+" - e characters");
			item.println("depunctuate: " + SentenceTransformer.depunctuate(s));
			
			s = "philanthropist"; 
			String encrypted = WordTransformer.ezEncrypt(s);
			item.println("ezEncrpt: "+encrypted);
			item.println("ezDecrypt: " + WordTransformer.ezDecrypt(encrypted));
			item.println("lowerCaser: " + WordTransformer.lowerCaser(s));
			item.println("lowerCase: " + WordTransformer.lowerCase(s));
			item.println("upperCaser: " + WordTransformer.upperCaser(s));
			item.println("makeCapital: " + WordTransformer.makeCapital(s));
			
			item.close();

			
		} catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}


