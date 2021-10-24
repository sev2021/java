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

import javax.swing.JOptionPane;
public class CinemaTicketsApp {
	public static void main(String[] agrs) {
		//declare vars
		int userAge, numTickets, ticketsPrice;
		//declare and create objects
		CinemaTickets ourTickets = new CinemaTickets();
		//set
		userAge = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
		numTickets = Integer.parseInt(JOptionPane.showInputDialog("Enter number of tickets:"));
		ourTickets.setNumTickets(numTickets);
		ourTickets.setUserAge(userAge);
		//compute
		ourTickets.calcNumTickets();
		//get
		ticketsPrice = ourTickets.getTicketsPrice();
		//output
		JOptionPane.showMessageDialog(null, "Price for " + numTickets + " tickets will be " + ticketsPrice + " euro.");
	}
}
