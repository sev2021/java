/* user should be asked for their name, the required number of nights, and their age. 
 * The application should assume that each room costs 90 euro per night 
 * and then calculate and output the total cost to confirm the booking. 
 * Please note: a booking can only be confirmed if the user is at least 18
 * 
 * INPUT: users enter their name, the required number of nights, and their age
 * PRICESS: calculate and output the total cost to confirm the booking
 * 				assuming that each room costs 90 euro per night and that
 * 				a booking can only be confirmed if the user is at least 18
 * OUTPUT:  display total costs
 */

public class Hotel {
	////INPUT
	//declare vars
	private String msg;
	private int userAge, numNights;

	//constructor
	public Hotel() {
		msg = "";
		userAge = 0;
		numNights = 0;
	}
		
	//set method
	public void setUserAge(int userage) {
		this.userAge = userage;
	}
	public void  setNumNights(int numNights) {
		this.numNights = numNights;
	}
	
	////PROCESS
	//compute
	public void computeTotalPrice() {
		if(userAge < 18) {
			msg = "You have to be over 18 to book a room.";
		}
		else {
			msg = "Total price for " + numNights + " nights is " + numNights * 90 + " Euro.";
		}
	}
	
	////OUTPUT
	//get method
	public String getMessage() {
		return msg;
	}
	
}
