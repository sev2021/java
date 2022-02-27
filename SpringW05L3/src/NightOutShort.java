import javax.swing.JOptionPane;
public class Party {
	public static void main(String[] args) {
		//declare variables
		String studentYear, studentCourse;
		
		//input
		do {
			studentYear = JOptionPane.showInputDialog("What year (1 or 2): ");
		}while(!studentYear.equals("1") && !studentYear.equals("2"));
		
		do {
		studentCourse= JOptionPane.showInputDialog("What course code (HDAIML or HDBC): ");
		}while(!studentCourse.equalsIgnoreCase("HDAIML") && !studentCourse.equalsIgnoreCase("HDBC"));	
		
		//compute and output
		if((studentYear + studentCourse).equalsIgnoreCase("1HDAIML") || (studentYear + studentCourse).equalsIgnoreCase("2HDBC")) {
			JOptionPane.showMessageDialog(null, "Your venue is Lagona");
		}
		else JOptionPane.showMessageDialog(null, "Your venue is Harbourmaster");
	}
}
