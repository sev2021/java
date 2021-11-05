/* Create an application that asks a user how many subjects they take, 
 * and what marks they got in each subject. 
 * The application should then output their results
 */
import javax.swing.JOptionPane;
public class L2GradesApp {
	public  static void main(String args[]) {
		////INPUT
		//declare variables
		int numSubjects;
		String message;
		
		//declare and create objects
		L2Grades myGrades = new L2Grades();
		numSubjects = Integer.parseInt(JOptionPane.showInputDialog("How many subjects you have?"));
			
		//set
		myGrades.setNumSubjects(numSubjects);

		//compute
		myGrades.computeGrades();
		
		//get
		message = myGrades.getTotalGrades();
		
		////OUTPUT
		System.out.println(message);
		
	}
}
