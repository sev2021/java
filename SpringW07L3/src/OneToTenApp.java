/* Create an application that generates an array of 5 random numbers 1-10. 
 * The user should then guess a number and the app will tell them 
 * how many time that number exists within the array.
 */
import javax.swing.JOptionPane;
public class OneToTenApp {
	public static void main(String[] args) {
		////INPUT
		//declare variable
		int userNumber;
		//create object
		OneToTen myOneToTen = new OneToTen();
		
		//set
		userNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter number between 1 and 10: "));
		myOneToTen.setUserNumber(userNumber);
		
		////PROCESS
		//compute
		myOneToTen.computeCheckArray();
		
		////OUTPUT
		//get
		JOptionPane.showMessageDialog(null, myOneToTen.getResult());
	}
}
