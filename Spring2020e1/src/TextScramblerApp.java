/*  Input Validation:
•	The text must start with an upper-case letter 
*   and end with a full stop. Validation should take 
*   place in the instantiable class and will halt the 
*   running of the application if validation does not pass.
*   Scrambling:
•	The scrambled text should start with the number 
*   of characters in the initial text.
•	Replace each vowel with your initials. This should 
*   be hard coded into the application and is not required 
*   as user input.
*/
public class TextScramblerApp {
	public static void main(String[] args) {
		////INPUT
		//declare variable
		String userInput;
		
		
		TextScrambler myScrambler = new TextScrambler();
		
		myScrambler.computeScrambledText();
		
		System.out.print(myScrambler.getScrambledText());
	}
}
