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
import javax.swing.JOptionPane;
public class TScramblerApp {
	public static void main(String[] args) {
		////IMPUT
		//declare vars and objects
		String[] inputArray = {"no data was entered"};
		String[] outputArray;
		String outputStrings;
		int inputArraySize = 0;
		int inputArrayLength = 0;
		
		//create object doScramble using TScrambler class
		TScrambler doScramble = new TScrambler();
		
		//set
		inputArraySize = Integer.parseInt(JOptionPane.showInputDialog("How many paragraphs? "));
		inputArrayLength = Integer.parseInt(JOptionPane.showInputDialog("How long paragraph? "));
		inputArray = new String[inputArraySize];
		
		for(int i = 1; i<inputArraySize + 1; i++) {
			inputArray[i - 1] = JOptionPane.showInputDialog("Enter string " + i + " of " + inputArraySize);
		}
		doScramble.setInputArray(inputArray);
		doScramble.setLengthArray(inputArray.clone(), inputArrayLength);
		
		//compute
		doScramble.computeInputArray();
		doScramble.checkLengthArray();
		
		
		////OUTPUT
		//get for scrambler
		outputArray = doScramble.getScrambledArray();
		
		outputStrings = "Scrambled strings are:\n";
		for(String outString: outputArray) {
			outputStrings += outString + "\n";
		}
		JOptionPane.showMessageDialog(null, outputStrings);
		
		
		//get for same length
		outputArray = doScramble.getLengthArray();
		
		outputStrings = "Strings having length " + inputArrayLength + " are:\n";
		for(String outString: outputArray) {
			outputStrings += outString + "\n";
		}		
		JOptionPane.showMessageDialog(null, outputStrings);
	}
}
