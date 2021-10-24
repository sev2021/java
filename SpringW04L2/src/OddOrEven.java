/* Create an application that takes in a number 
 * from a user 
 * and outputs whether it is positive or negative
*/

//input: takes in a number from a user

//process: calculate whether it is positive or negative

//output: prints whether it is positive or negative

public class OddOrEven {
	//declare vars
	private int usersNumber;
	private String message;
	//constructor
	public OddOrEven() {
		usersNumber = 0;
		message = "";
	}
	//set method
	public void setUsersNumber(int usersNumber) {
		this.usersNumber = usersNumber;
	}
	//compute
	public void calcNumber() {
		if(usersNumber % 2 == 0) {
			message = "even";
		}
		else {
			message = "odd";
		}
	}
	//get method
	public String getMessage() {
		return message;
	}
}
