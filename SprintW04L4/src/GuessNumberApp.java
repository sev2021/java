/* Create a guessing game where the computer 
 * comes up with a random number and the user guesses 
 * (output winner or loser)
 */

//input: user guesses

//process: computer comes up with a random number
// check user guesses

//output: winner or loser

import javax.swing.JOptionPane;
public class GuessNumberApp {
	public static void main(String[] args) {
		//declare vars
		int usersNumber = 0, computersNumber = 0, count = 10;
		String message = "";
		//declare and create objects
		GuessNumber myGame = new GuessNumber();
		//loop
		while(count > 0) {
			//set
			usersNumber = Integer.parseInt(JOptionPane.showInputDialog("Guess a number from 1 to 20. You have " 
					+ count + " tries left."));
			myGame.setUsersNumber(usersNumber);
			//compute
			myGame.calcComuterAndUser();
			//get
			message = myGame.getMessage();
			computersNumber = myGame.getComputersNumber();
			//loop control
			if(message == "winner") {
				break;
			}
			count --;
		}
		//output
		JOptionPane.showMessageDialog(null, "Computer's number: " + computersNumber + ". Your number: " 
					+ usersNumber + ". You are a " + message + "!");
	}
}