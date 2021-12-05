import javax.swing.JOptionPane;

/* Create an application that takes in 2 numbers and a String from user.
 * Based on the submitted character (a,s,m or d),
 * the application should output the 2 numbers either added,
 * subtracted, multiplied or divided.
 * The application should also take the final amount and return whether it is odd or even.
 * - This application should have 2 instantiable classes
 * - Each instantiable class will only have 1 method that combines set, compute and get
 */
public class Calc {
	////INPUT
	//declare variables
	private double userNumber1, userNumber2, result;
	private String userOperator;
	
	//constructor
	public Calc() {}
	
	//set method
	public void setData(double userNumber1, double userNumber2, String userOperator) {
		this.userNumber1 = userNumber1; 
		this.userNumber2 = userNumber2;
		this.userOperator = userOperator;
	}
	
	//compute method
	public void computeData() {
		if(userOperator.equalsIgnoreCase("A")) result = userNumber1 + userNumber2;
		if(userOperator.equalsIgnoreCase("S")) result = userNumber1 - userNumber2;
		if(userOperator.equalsIgnoreCase("M")) result = userNumber1 * userNumber2;
		if(userOperator.equalsIgnoreCase("D") && userNumber2 != 0) result = userNumber1 / userNumber2;
		
	}
	
	//get method
	public double getData() {
		return result;
	}
}
