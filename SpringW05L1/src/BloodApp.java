/* develop an application that allows a user to enter their age and blood type. 
 * The app will then display a message outlining which blood groups the user 
 * can donate to and receive from. Please note that only 18+ can donate. public 
 * 
 * INPUT: users enter their age and blood type
 * PROCESS: compute which blood groups the user can donate to and receive from.
 * 				based on given blood type table. Note that only 18+ can donate
 * OUTPUT: display a message outlining which blood groups the user 
 * 				can donate to and receive from
*/

import javax.swing.JOptionPane;
public class BloodApp {
		public static void main(String[] args) {
				////INPUT
				//declare vars
				int userAge;
				String bloodType, message;
				
				//declare and create object
				Blood bloodCheck = new Blood();
				userAge = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
				bloodType = JOptionPane.showInputDialog("What is your blood type?");
				
				
				////PROCESS
				//set
				bloodCheck.setUserAge(userAge);
				bloodCheck.setBloodType(bloodType);
				
				//compute
				bloodCheck.computeMessage();
				
				//get
				message = bloodCheck.getMessage();
				
				
				////OUTPUT
				JOptionPane.showMessageDialog(null, message);
				
		}
}
