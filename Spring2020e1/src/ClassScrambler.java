/*  Input Validation:
•	The text must start with an upper-case letter and end with a full stop. 
*   Validation should take place in the instantiable class and will halt 
*   the running of the application if validation does not pass.
*   Scrambling:
•	The scrambled text should start with the number of characters in the initial text.
•	Replace each vowel with your initials. This should be hard coded into 
*   the application and is not required as user input
*/

public class TextScrambler {
	////INPUT
	//declare variable for instantiable class
	private String userText;
	
	//constructor
	public TextScrambler() {
		userText = "";
	}
	
	//set method
	public void setUserText(String userText) {
		this.userText = userText;
	}
	
	////PROCESS
	//compute method
	public void computeScrambledText() {
		userText = "";
	}
	
	
	////OUTPUT
	//get method
	public String getScrambledTExt() {
		return userText;
	}

	
}
