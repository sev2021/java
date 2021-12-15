/*  Input Validation:
•	The text must start with an upper-case letter 
*   and end with a full stop. Validation should take 
*   place in the instantiable class and will halt the 
*   running of the application if validation does not pass.
*   Scrambling:
•	The scrambled text should start with the number 
*   of characters in the initial text.
•	Replace each vowel with your initials. This should 
*   be hard coded into the application and is not required 
*   as user input.
*/
public class TextScrambler {
	////INPUT
	//declare variable
	private String userInput;
	private String scrambledTetxt;
	private int userTextLength;
	private String userInitials;
	private char iterateChar; 
	
	//constructor
	public TextScrambler() {	
		userInput = "Name: Sam Cogan\r\nSentence: I love Java.";
		scrambledTetxt = "";
		userTextLength = 0;
		userInitials = "SS";
		iterateChar = ' ';
	}
	
	//set method
	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}
	
	////PROCESS
	//compute method
	public void computeScrambledText() {
		// validate for "text must start with an upper-case letter"
		if(!Character.isUpperCase(userInput.charAt(0))) {
			System.exit(0);  // halt the running of the application
		}
		//validate for "text must end with a full stop"
		else if(userInput.charAt(userInput.length() - 1) != '.'){
			System.exit(0);	 // halt the running of the application
		}
		
		//follow if validation correct
		
		//compute the number of characters in the initial text
		userTextLength = userInput.length();
		
		//iterate each characters in the initial text
		for(int i=0; i<userInput.length(); i++) {
			
			if("aiueo".indexOf(userInput.charAt(i)) == -1) {
				scrambledTetxt += userInput.charAt(i); 
			}
			else {
				scrambledTetxt += "_";
			}
		}
		scrambledTetxt = userTextLength + scrambledTetxt;
	}
	
	
	////OUTPUT
	//get method
	public String getScrambledText() {
		return scrambledTetxt;
	}
	
	
}
