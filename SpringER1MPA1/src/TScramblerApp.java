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
import javax.swing.JOptionPane;
public class TScramblerApp {
	public static void main(String[] args) {
		////IMPUT
		//declare vars and objects
		String[] inputArray = {"no data was entered"};
		String[] outputArray;
		String outputStrings = "";
		int inputArraySize = 0;
		
		//create object doScramble using TScrambler class
		TScrambler doScramble = new TScrambler();
		
		//set
		inputArraySize = Integer.parseInt(JOptionPane.showInputDialog("How many paragraphs? "));
		inputArray = new String[inputArraySize];
		
		for(int i = 1; i<inputArraySize + 1; i++) {
			inputArray[i - 1] = JOptionPane.showInputDialog("Enter string " + i + " of " + inputArraySize);
		}
		doScramble.setInputArray(inputArray);
		
		//compute
		doScramble.computeInputArray();
		
		////OUTPUT
		//get
		outputArray = doScramble.getScrambledArray();
		
		for(String outString: outputArray) {
			outputStrings += outString + "\n";
		}
		
		JOptionPane.showMessageDialog(null, outputStrings);
	}
}
