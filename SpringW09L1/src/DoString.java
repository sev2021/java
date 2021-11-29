/* Create an app that takes in a String from a user and does the following:
* Assume the String can only take letters spaces and full stops
*  - Counts the letters
*  - Counts vowels
*  - Stores a new String that only contains every second letter
*  -  Stores the positions of each space
*  -  Alters the String so that all vowels are replaced by exclamation points
*/
public class DoString {
	////INPUT
	//declare variable
	private String userInput, newString;
	private StringBuffer userBuffer;
	private int lettersCount;
	
	//constructor
	public DoString(String userInput) {
		this.userInput = userInput;
	}

	//compute
	public void computeCount() {
		newString = userInput.replaceAll("[ ,.]", "");
		lettersCount  = newString.length();
	}
	
	//get
	public int getComputeCount() {
		return lettersCount;
	}
	
}
