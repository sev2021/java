/* Ask a user to enter how many subjects they have. 
 * The application should then ask the user to enter the results for each subject. 
 * Store these results in an array and print them back to the user 
 * along with their overall average and grade for each module.
 */
public class GradesArray {
	////INPUT
	//declare variables
	private int subjectsNumber, allSubjects;
	//constructor
	//from GradesArrayApp INPUT with  number of subject <--
	public GradesArray(int subjectsNumber) {
		this.subjectsNumber = subjectsNumber;
	//back to GradesArrayApp INPUT -->
	}
	
	////PROCESS
	//compute grades
	//from GradesArrayApp with individual subject grade <--
	public void addGrades(int key, int oneGrade) {
		allSubjects += oneGrade;
		System.out.println("Subject " + (key + 1) + " = " + allSubjects);
	}
	//back to GradesArrayApp  fetch new value or  (-1)-->
	
	////OUTPUT
	//getter methods
	public double getGrades() {
		return (double)allSubjects / (double)subjectsNumber;
	}
	
}
