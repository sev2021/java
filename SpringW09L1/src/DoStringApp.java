/* Create an app that takes in a String from a user and does the following:
* Assume the String can only take letters spaces and full stops
*  - Counts the letters
*  - Counts vowels
*  - Stores a new String that only contains every second letter
*  -  Stores the positions of each space
*  -  Alters the String so that all vowels are replaced by exclamation points
*/
import javax.swing.JOptionPane;
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
		doMyString.computeCount();
		
		////OUTPUT
		//get method
		
		JOptionPane.showMessageDialog(null, doMyString.getComputeCount());
		
	}
}
