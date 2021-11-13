import javax.swing.JOptionPane;
public class GradesArrayApp {
	public static void main(String args[]) {
		////INPUT
		//variable declaration
		int subjectsNumber, singleSubject, allGrades;
		//declare and create objects
		subjectsNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter number of subjects:"));
		//<-- to GradesArray constructor with  number of subject
		GradesArray myGrades = new GradesArray(subjectsNumber);
		//--> back from GradesArray
		//compute
		for(int i = 0; i < subjectsNumber; i++) {
			singleSubject = Integer.parseInt(JOptionPane.showInputDialog("Enter next subject result:"));
			//<-- to GradesArray constructor with individual subject grade
			myGrades.addGrades(i, singleSubject);
		}
		
		//get
		//allGrades = myGrades.getGrades;
		System.out.println("Your average grade is: " + myGrades.getGrades());
	}
	
}
