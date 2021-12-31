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
import java.util.Arrays;
public class TScrambler {
	////INPUT
	//declare variable
	private String userInput, userOutput;
	private String[] userInputArray;
	private int userInputLength;
	
	//constructor
	public TScrambler() {
	}
	
	//set method
	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}
	
	////PROCESS
	//compute method
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
	
	//get method
	public String getUserInput() {
		return userOutput;
	}
}
