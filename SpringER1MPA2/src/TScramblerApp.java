/* - Task:
 * Ask the user at the beginning of the application how many paragraphs they would like to scramble, 
 * and ensure that the application scrambles that amount of sentences. 
 * This should be completed using a graphical interface such as JOptionPane 
 * - Input Validation: 
 * The text must contain at least 2 spaces. . 
 * Validation should take place in the instantiable class and will halt the running 
 *  of the application if validation does not pass
 * - Scrambling:
 * 	Every character that is not a vowel should be replaced by the last 3 digits of your student number. .
 •	This should be hard coded into the application and is not required as user input.
*/
import java.util.Arrays;
import javax.swing.JOptionPane;
public class TScramblerApp {
	public static void main(String[] agrs) {
		////INPUT
		//declare variable
		String userInput;
		String[] userInputArray;
		int inputArraySize;
		//create object
		TScrambler doScramble = new TScrambler();
		//set
		inputArraySize = Integer.parseInt(JOptionPane.showInputDialog("How many paragraphs \nyou would like to scramble?"));
		userInputArray = new String[inputArraySize];
		
		for(int i=0; i<inputArraySize; i++) {
			userInputArray[i] = JOptionPane.showInputDialog("Please enter " + (i+1) + " paragraph:");
		}
		doScramble.setInputArray(userInputArray);
		
		////PROCESS
		//compute
		doScramble.computeArray();
		
		
		////OUTPUT
		//get
		System.out.print(Arrays.toString(doScramble.getComputedArray()));
		
		
	}
}