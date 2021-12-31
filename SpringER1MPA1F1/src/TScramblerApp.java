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
import javax.swing.JOptionPane;
public class TScramblerApp {
	public static void main(String[] args){
		////INPUT
		//declare variables and objects
		String userInput;
		String userOutput;
		int userTurns, userInputLength;
		TScrambler doScramble = new TScrambler();
		
		////PROCESS Q1
		userTurns = Integer.parseInt(JOptionPane.showInputDialog("How many paragraphs?"));
		for(int i=0; i<userTurns; i++) {
			userInput = JOptionPane.showInputDialog("Enter paragraph " + (i+1) + " of " + userTurns);
			
			//calling Q1 setter
			doScramble.setUserInput(userInput);
			//calling computer
			doScramble.computeUserInput();
			
			//calling getter
			JOptionPane.showMessageDialog(null, "Original paragraph:\n"
					+ userInput + "\nScrambled paragraph:\n" + doScramble.getUserInput());	
		}
		
		////INPUT Q2
		//calling Q2 setter
		userInput = JOptionPane.showInputDialog("Enter words separated by coma without spaces(,): ");
		userInputLength = Integer.parseInt(JOptionPane.showInputDialog("Enter number of letters:"));
		doScramble.setUserInputArray(userInput.split(","), userInputLength);
		
		////PROCESS Q2
		doScramble.computeUserInputArray();
		
		
		////OUTPUT
		//calling Q2 getter
		userOutput = "Array of " + userInputLength + " letter long words:\n";
		for(String s: doScramble.getUserOutputArray()) userOutput += s + ", ";
		JOptionPane.showMessageDialog(null, userOutput);
	}
}
