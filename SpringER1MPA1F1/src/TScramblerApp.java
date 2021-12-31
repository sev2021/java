/*MPA1 (App class)
Ask the user at the beginning of the application how many paragraphs they would like to scramble, 
and ensure that the application scrambles that amount of sentences. 
This should be completed using a graphical interface such as JOptionPane.
ER1 
Input Validation:
The text must start with an upper-case letter and end with a full stop. 
Validation should take place in the instantiable class and will halt the 
running of the application if validation does not pass
Scrambling:
The scrambled text should start with the number of characters in the initial text.
Replace each vowel with your initials. 
This should be hard coded into the application and is not required as user input.
*/
import javax.swing.JOptionPane;
public class TScramblerApp {
	public static void main(String[] args){
		////INPUT
		//declare variables and objects
		String userInput;
		int userTurns;
		TScrambler doScramble = new TScrambler();
		
		////PROCESS Q1
		userTurns = Integer.parseInt(JOptionPane.showInputDialog("How many paragraphs?"));
		for(int i=0; i<userTurns; i++) {
			userInput = JOptionPane.showInputDialog("Enter paragraph " + (i+1) + " of " + userTurns);
			
			doScramble.setUserInput(userInput);
			doScramble.computeUserInput();
			
			JOptionPane.showMessageDialog(null, "Original paragraph:\n"
					+ userInput + "\nScrambled paragraph:\n" + doScramble.getUserInput());	
		}
		
		////PROCESS Q2
		
		
	}
}
