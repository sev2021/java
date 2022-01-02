/*MPA2 (App class)
Ask the user to provide a paragraph and after the paragraph is encoded, 
create a popup that asks the user if they would like to encode another paragraph. 
As long as the user clicks “yes” the application repeat. When the user clicks “no”, 
no other sentences are scrambled. 
This should be completed using a graphical interface such as JOptionPane.
* ER2  (Instantiable class)
Input Validation:
The text must contain at least 2 spaces. Validation should take place in the instantiable 
class and will halt the running of the application if validation does not pass.
Scrambling:
Every character that is not a vowel should be replaced by the last 3 digits of your student number. 
This should be hard coded into the application and is not required as user input.
The encoded String ends with the number of characters in the initial text.
* F2 (Instantiable class, extra method)
The method should accept as parameters an array of words and a character. 
The method should then search the array of words and find the words that begin with that character. 
If there are multiple words with the same starting character, 
then the method should find all the words that have the same given starting character. 
The words computed by the method should be stored in an array of words. 
The method should return the computed array of words.
*/
import java.util.Arrays;
public class TScrambler {
	////INPUT
	//input
	private String userInput, userOutput;
	private String[] userInputArray;
	private String[] userOutputArray;
	private int userInputLenght, letterCheckLength;
	private char userChekLetter;
	
	//constructor
	TScrambler() {}
	
	//set methods
	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}
	
//	public void setUserInput(String[] userInputArray, char checkLetter) {
//		this.userInputArray = userInputArray;
//		this.userChekLetter = checkLetter;	
//	}
	
	//compute methods
	public void computeUserInput() {
		//validation
	    if(userInput.indexOf(" ",userInput.indexOf(" ") + 1) == -1) {
	    	System.out.println("BAD VALIDATION - no 2 spaces!");
	    }
	    
	    //scrambling
	    userInputLenght = userInput.length();
	    userInputArray = userInput.split("");
	    String key = "aeiuoAEIUO";
	    for(int i=0; i<userInputLenght; i++) {
	    	if(key.indexOf(userInputArray[i]) == -1) {
	    		userInputArray[i] = "<>";
	    	}
	    }
	    
	    userOutput = "";
	    for(String s: userInputArray) userOutput += s;
	    userOutput += userInputLenght;
	    System.out.println(userOutput); //DEBUG
	    
	} // end of computeUserInput()
	
	public void computerLetterCheck(String[] userInputArray, char checkLetter) {
		this.userInputArray = userInputArray;
		this.userChekLetter = checkLetter;
		letterCheckLength = 0;
		for(int i=0; i<userInputArray.length-1; i++) {
			if(userInputArray[i].charAt(0) == userChekLetter) {
				System.out.println(userInputArray[i]); //DEBUG
				letterCheckLength ++;
			}
		}
		
		userOutputArray = new String[letterCheckLength];
		letterCheckLength = 0;
		
		for(int i=0; i<userInputArray.length-1; i++) {
			if(userInputArray[i].charAt(0) == userChekLetter) {
				userOutputArray[letterCheckLength] = userInputArray[i];
				letterCheckLength ++;
			}
		}
		
		System.out.println(Arrays.toString(userOutputArray));
		
	} // end of computerLetterCheck()
	
	//get method
	public String getUserInput() {
		return userOutput;
	}
}
