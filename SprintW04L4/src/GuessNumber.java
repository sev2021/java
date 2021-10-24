/* Create a guessing game where the computer 
 * comes up with a random number and the user guesses 
 * (output winner or loser)
 */

//input: user guesses

//process: computer comes up with a random number
// check user guesses

//output: winner or loser

public class GuessNumber {
	//declare vars
	private int computersNumber, usersNumber;
	private String message;
	//constructor
	public GuessNumber() {
		computersNumber = (int)(Math.random() * 20);
		usersNumber = 0;
		message = "";
	}
	//set method
	public void setUsersNumber(int usersNumber) {
		this.usersNumber = usersNumber;
	}
	//compute
	public void calcComuterAndUser() {
		if(computersNumber == usersNumber) {
			message = "winner";
		}
		else {
			message = "looser";
		}
	}
	//get method
	public String getMessage() {
		return message;
	}
	public int getComputersNumber() {
		return computersNumber;
	}
}
