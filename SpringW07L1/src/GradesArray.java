/* Ask a user to enter how many subjects they have. 
 * The application should then ask the user to enter the results for each subject. 
 * Store these results in an array and print them back to the user 
 * along with their overall average and grade for each module.
 */
public class GradesArray {
	////INPUT
	//declare variables
	private int subjectsNumber, singleSubject, allSubjects;
	
	//constructor
	public GradesArray(int subjectsNumber) {
		this.subjectsNumber = subjectsNumber;
		this.singleSubject = 0;
		this.allSubjects  =0;
	}
	
	//set method
	public setSubject(int singleSubject) {
		this singleSubject = singleSubject;
	}
	
	
	////PROCESS
	//compute grades
	public void computeGrades() {
		System.out.print("PROCESS");
	}
	
	////OUTPUT
	//getter methods
	public int getGrades() {
		return allSubjects;
	}
	
}
