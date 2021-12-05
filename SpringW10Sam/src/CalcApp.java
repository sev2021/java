/* Create an application that takes in 2 numbers and a String from user.
 * Based on the submitted character (a,s,m or d),
 * the application should output the 2 numbers either added,
 * subtracted, multiplied or divided.
 * The application should also take the final amount and return whether it is odd or even.
 * - This application should have 2 instantiable classes
 * - Each instantiable class will only have 1 method that combines set, compute and get
 */
import javax.swing.JOptionPane;
public class CalcApp {
	public static void main(String[] args) {
		////INPUT
		//declare variables and objects
		double userNumber1, userNumber2;
		String userOperator;
		
		Calc myCalc = new Calc();
		
		//set 
		userNumber1 = Double.parseDouble(JOptionPane.showInputDialog("Enter first number: "));
		userNumber2 = Double.parseDouble(JOptionPane.showInputDialog("First number you entered is: "
				+ userNumber1
				+ "\nEnter second number: "));
		do {
				userOperator = JOptionPane.showInputDialog("You entered numbers "
					+ userNumber1 + " and " + userNumber2
					+ "\nEnter letter for operation [A]dd [S]ubtract [M]ultiply [D]ivide ");
		}while("asmdASMD".indexOf(userOperator) ==  -1 );
		
		myCalc.setData(userNumber1, userNumber2, userOperator);
		
		////PROCESS
		//compute calculation
		myCalc.computeData();
		
		////OUTPUT
		//get
		JOptionPane.showMessageDialog(null, myCalc.getData());
		
	}
}
