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
