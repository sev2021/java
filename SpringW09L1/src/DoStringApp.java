/* Create an app that takes in a String from a user and does the following:
* Assume the String can only take letters spaces and full stops
*  - Counts the letters
*  - Counts vowels
*  - Stores a new String that only contains every second letter
*  -  Stores the positions of each space
*  -  Alters the String so that all vowels are replaced by exclamation points
*/
import javax.swing.JOptionPane;
import java.util.Arrays;
public class DoStringApp {
	public static void main(String[] args) {
		////INPUT
		//variable declaration
		String userInput;

		//set method
		userInput = JOptionPane.showInputDialog("Enter string:");
		DoString doMyString = new DoString(userInput);
		
		////PROCESS
		//compute string
		doMyString.computeLettersCount();
		doMyString.computeVowelsCount();
		doMyString.computeEvenLetters();
		doMyString.computeSpacePositions();
		
		////OUTPUT
		//get method
		JOptionPane.showMessageDialog(null, "You entered string: : " + userInput
												+ "\nCounts the letters: " + doMyString.getLettersCount()
												+ "\nCounts vowels: " + doMyString.getVowelsCount()
												+ "\nEvery second letter: " + doMyString.getEvenLetters()
												+ "\nPositions of each space: " 
												+ Arrays.toString(doMyString.getSpacePositions())
												+ "\nVowels replaced by exclamation points: "
												+ userInput.replaceAll("[aeiouAEIOU]", "!"));	
	}
	
}

