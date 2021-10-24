/* Create an application that takes in a number 
 * from a user 
 * and outputs whether it is positive or negative
*/

//input: takes in a number from a user

//process: calculate whether it is positive or negative

//output: prints whether it is positive or negative

import javax.swing.JOptionPane;
public class OddOrEvenApp {
	public static void main(String[] args) {
		//declare vars
		int usersNumber;
		String message;
		//declare and create objects
		OddOrEven checkNumber = new OddOrEven();
		//set
		usersNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
		checkNumber.setUsersNumber(usersNumber);
		//compute
		checkNumber.calcNumber();
		//get
		message = checkNumber.getMessage();
		//output
		JOptionPane.showMessageDialog(null, "Number " + usersNumber + " is " + message + ".");
	}
}
