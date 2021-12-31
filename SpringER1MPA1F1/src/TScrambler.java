/*MPA1 (App class)
Ask the user at the beginning of the application how many paragraphs they would like to scramble, 
and ensure that the application scrambles that amount of sentences. 
This should be completed using a graphical interface such as JOptionPane.
* ER1  (Instantiable class)
Input Validation:
The text must start with an upper-case letter and end with a full stop. 
Validation should take place in the instantiable class and will halt the 
running of the application if validation does not pass
Scrambling:
The scrambled text should start with the number of characters in the initial text.
Replace each vowel with your initials. 
This should be hard coded into the application and is not required as user input.
* F1 (Instantiable class, extra method)
The method should take in 2 parameters; an array of words, and a number. 
The method should search the array of words and find and output the words matching the given number. 
If there are multiple words with the same length as the given number, 
then the method should find all the words that have the same length as that number. 
The words computed by the method should be stored in an array of words. 
The method should return the computed array of words.
*/
import java.util.Arrays;  //DEBUG
public class TScrambler {
	////INPUT
	//declare variable
	private String userInput, userOutput;
	private String[] userInputArray;
	private String[] userOutputArray;
	private int userInputLength;
	
	//constructor
	public TScrambler() {
	}
	
	//set method
	public void setUserInput(String userInput) { //Q1
		this.userInput = userInput;
	}
	
	public void setUserInputArray(
			String[] userInputArray,
			int userInputLength) {  //Q2
		this.userInputArray = userInputArray;
		this.userInputLength = userInputLength;
	}
	
	////PROCESS
	//compute method Q1
	public void computeUserInput() {
		//validation
		if(!Character.isUpperCase(userInput.charAt(0)) 
				|| userInput.charAt(userInput.length() - 1) != '.') {
			System.out.println("System.exit(0)");
		} //validation end
		
		//scrambling
		userInputLength = userInput.length();
		userInputArray = userInput.split("");
		String key = "aeiouAEIOU";
		for(int i=0; i<userInputArray.length; i++) {
			if(key.contains(userInputArray[i])) userInputArray[i] = "<>";
			// System.out.println(Arrays.toString(userInputArray)); //DEBUG
		} //scrambling end
		
		userOutput = Integer.toString(userInputLength);
		for(String s: userInputArray)userOutput += s;
		System.out.println(userOutput);
	}
	
	//compute method Q2
	public void computeUserInputArray() {
		int userOutputLength = 0;
		for(String s: userInputArray) {
			if(s.length() == userInputLength)userOutputLength++;
		}
		
		userOutputArray = new String[userOutputLength];
		
		int userOutputIndex = 0;
		for(String s: userInputArray) {
			if(s.length() == userInputLength) {
				userOutputArray[userOutputIndex] = s;
				userOutputIndex ++;
			}
		}
		System.out.println(Arrays.toString(userOutputArray)); //DEBUG
	}
	
	
	//get method Q1
	public String getUserInput() {
		return userOutput;
	}
	
	//get method Q2
	public String[] getUserOutputArray() {
		return userOutputArray;
	}
}
