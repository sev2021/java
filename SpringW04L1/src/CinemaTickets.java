/* Create the IPO and code for a program that takes in a 
user's age and a number of cinema tickets they need. 
Display the price it will cost for them to buy their 
tickets based on below
Under 18: 10 euro
Over 18: 15 euro */

//input: user's age and a number of cinema tickets they need

//process: cost for them to buy their tickets based on below
// Under 18: 10 euro
// Over 18: 15 euro

//output: Display the price it will cost for them to buy their tickets


public class CinemaTickets {
	//declare vars
	private int userAge, numTickets, ticketsPrice;
	//constructor
	public CinemaTickets() {
		userAge = 0;
		numTickets = 0;
	}
	//set method
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public void setNumTickets(int numTickets) {
		this.numTickets = numTickets;
	}
	//compute
	public void calcNumTickets() { 
		if(userAge < 18) {
			ticketsPrice = numTickets * 10;
		}
		else {
			ticketsPrice = numTickets * 15;
		}
	}
	//get method
	public int getTicketsPrice() {
		return ticketsPrice;
	}
	
}
