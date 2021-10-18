import javax.swing.JOptionPane;
//variables
//objects
//inputs
//set
//compute
//get
//output
public class WagesApp {
	public static void main(String[] args) {
		//variables
		double wageMonth, wageYear, wageHour, hoursPerWeek;
		//objects
		Wages calcWages = new Wages(); 
		//inputs
		wageMonth = Double.parseDouble(JOptionPane.showInputDialog("Enter your monthly wage:"));
		hoursPerWeek = Double.parseDouble(JOptionPane.showInputDialog("Enter number of hours per week:"));
		//set
		calcWages.setWageMonth(wageMonth);
		calcWages.setHoursPerWeek(hoursPerWeek);
		//compute
		calcWages.computeWageYear();
		calcWages.computeWageHour();		
		//get
		wageYear = calcWages.getWageYear();
		wageHour = calcWages.getWageHour();
		//output
		JOptionPane.showMessageDialog(null, "Your annual salary is: " + wageYear);
		JOptionPane.showMessageDialog(null, "Your hourly wage is: " + Math.round(wageHour * 100) / 100.0);
	}

}