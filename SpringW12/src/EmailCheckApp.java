/*Create an application that takes in 2 pieces of information from a user; 
 * a single email address 
 * and an array of 3 character domain extensions (eg com, edu, org). 
 * These should be taken in as parameters into a single method. 
 * This application only needs 2 methods; 1 that sets and computes and 1 that returns information.
 * The method should then do the following to validate the email address:
 * -Check that there is an @ symbol in the email address
 * -Check that there is a . before the 3 character extension
 * -Ensure that the domain extension is one of the 3 character Strings from the array
 * The method should return a String that states whether or not the email address is valid, and why.
*/
import javax.swing.JOptionPane;
public class EmailCheckApp {
	public static void main(String[] args) {
		////INPUT
		//declare variable
		String userEmail, userInput;
		
		//create object
		EmailCheck myEmail = new EmailCheck();
		
		//set
		userEmail = JOptionPane.showInputDialog("Please enter email address");
		userInput = JOptionPane.showInputDialog("Please enter 3 character domain extensions\nseparated by coma - for example: com,edu,org");
		
		////PROCESS
		//setter and computer
		myEmail.computeUserEmail(userEmail, userInput.split(","));
		
		////OUTPUT
		//get
		JOptionPane.showMessageDialog(null, myEmail.getUserEmail());
		
		
	}
}
