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
 * - Third Task:
 * The method should take in 2 parameters; an array of words, and a length number. 
 * The method should search the array of words and find and output the words matching the given number. 
 * If there are multiple words with the same length as the given number, 
 * then the method should find all the words that have the same length as that number. 
 * The words computed by the method should be stored in an array of words. 
 * The method should return the computed array of words.
*/
import java.util.Arrays;
public class TScrambler {
	////INPUT
	//declare vars and methods
	private String userInput;
	private String[] inputArray;
	private String[] lengthArray;
	private String[] sameLengthArray;
	private int inputLength;
	
	public TScrambler(){
		inputArray = new String[0];
	}
	
	//set method
	public void setInputArray(String[] inputArray) {
		this.inputArray = inputArray;
	}
	
	public void setLengthArray(String[] lengthArray, int inputLength) {
		this.lengthArray = lengthArray;
		this.inputLength = inputLength;
	}
	
	//compute method
	public void computeInputArray() {
		//validation
		for(int i=0; i<inputArray.length; i++) {
			if(!Character.isUpperCase(inputArray[i].charAt(0))
			|| inputArray[i].charAt(inputArray[i].length() - 1) != '.') {
				System.out.println("Validation does not pass for: " +  inputArray[i]);
				//System.exit(0);
			}
		}
		
		for(int i=0; i<inputArray.length; i++) {
			inputArray[i] = inputArray[i].length() + inputArray[i];
			String[] vowels = {"a","e","i","o","u","A","I","U","E","O"};
			for(String vowel : vowels) {
				inputArray[i] = inputArray[i].replace(vowel, "##");
			}
		}
		
	}
	
	//third compute method
	public void checkLengthArray() {
		System.out.println(Arrays.toString(lengthArray));  //DEBUG
		int sameLength = 0;
		for(String s1: lengthArray) {
			if(s1.length() == inputLength) sameLength++;
		}
		System.out.println(sameLength);  //DEBUG
		sameLengthArray = new String[sameLength];
		int sameLengthIndex = 0;
		for(String s1: lengthArray) {
			if(s1.length() == inputLength) {
				sameLengthArray[sameLengthIndex] = s1;
				sameLengthIndex++;
			}
		}
	}
	
	
	//get method
	public String[] getScrambledArray() {
		return this.lengthArray;

	}
	public String[] getLengthArray() {
		return this.sameLengthArray;
	}
}
