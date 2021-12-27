/* - Task:
 * Ask the user at the beginning of the application how many paragraphs they would like to scramble, 
 * and ensure that the application scrambles that amount of sentences. 
 * This should be completed using a graphical interface such as JOptionPane 
 * - Input Validation: 
 * The text must start with an upper-case letter and end with a full stop. 
 * Validation should take place in the instantiable class and will halt the running 
 *  of the application if validation does not pass
 * - Scrambling:
 * 	The scrambled text should start with the number of characters in the initial text.
 •	Replace each vowel with your initials. This should be hard coded into the application and is not required as user input.
*/
public class TScrambler {
	////INPUT
	//declare vars and methods
	private String userInput;
	private String[] inputArray;
	
	public TScrambler(){
		inputArray = new String[0];
	}
	
	//set method
	public void setInputArray(String[] inputArray) {
		this.inputArray = inputArray;
	}
	
	
	//get method
	public String[] getScrambledArray() {
		return this.inputArray;
	}

}
