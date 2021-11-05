/* Create an application that asks a user how many subjects they take, 
 * and what marks they got in each subject. 
 * The application should then output their results
 */
import javax.swing.JOptionPane;
public class L2Grades {
	////INPUT
	//declare variables
	private int numSubjects;
	private String singleGrade, totalGrades;
	
	//constructor
	public L2Grades() {
		numSubjects = 0;
		singleGrade = "";
		totalGrades = "";
	}
	
	//set method
	public void setNumSubjects(int numSubjects) {
		this.numSubjects = numSubjects;
		totalGrades = "These are results of your " + numSubjects + " subjects:\n\t";
		
	}
	
	
	////PROCESS
	//compute grades
	public void computeGrades() {
		for(int i = 1; i <= numSubjects; i++) {	
			singleGrade = JOptionPane.showInputDialog("Please enter grade (A-F) for subject." + i);
			totalGrades = totalGrades + "Subject " + i + ": " + singleGrade + "\n\t";
		}
	}
	
	////OUTPUT
	//get method
	public String getTotalGrades() {
		return totalGrades;
	}
	
}
