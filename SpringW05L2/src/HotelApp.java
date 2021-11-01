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

import javax.swing.JOptionPane;
public class HotelApp {
	public static void main(String[] args) {
		////INPUT
		//declare vars
		String userName, confMessage;
		int userAge, numNights;
		
		//declare and create object
		Hotel bookHotel = new Hotel();
		userName = JOptionPane.showInputDialog("What is your name?");
		numNights = Integer.parseInt(JOptionPane.showInputDialog("How many nights you would like to book?"));
		userAge = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
		
		
		////PROCESS
		//set
		bookHotel.setNumNights(numNights);
		bookHotel.setUserAge(userAge);
		
		//compute
		bookHotel.computeTotalPrice();
		
		//get
		confMessage = bookHotel.getMessage();
		
		
		////OUTPUT
		JOptionPane.showMessageDialog(null, "Dear " + userName + ".\n" + confMessage);
		
	}
}
