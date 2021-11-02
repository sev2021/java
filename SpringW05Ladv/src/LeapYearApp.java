import javax.swing.JOptionPane;
public class LeapYearApp {
	public static void main(String[] agrs) {
		////INPUT
		//declare vars
		int userYear;
		String result;
		
		//declare and create object
		LeapYear yearCalculator = new LeapYear();
		userYear = Integer.parseInt(JOptionPane.showInputDialog("Enter year to calculate.")); 
		
		////PROCESS
		//set
		yearCalculator.setUserYear(userYear);
		
		//compute
		yearCalculator.computeYear();
		
		//get
		result = yearCalculator.getUserYear();
		
		
		////OUTPUT
		JOptionPane.showMessageDialog(null, "Year " + userYear + result + " leap year.");
	}
}
