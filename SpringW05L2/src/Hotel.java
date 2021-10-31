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
