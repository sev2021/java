import javax.swing.JOptionPane;
public class GradesArrayApp {
	public static void main(String args[]) {
		////INPUT
		//variable declaration
		int subjectsNumber, singleSubject, allGrades;
		
		//declare and create objects
		subjectsNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter number of subjects:"));
		GradesArray myGrades = new GradesArray(subjectsNumber);
		
		//set
		singleSubject = Integer.parseInt(JOptionPane.showInputDialog("Enter your subject result:"));
		myGrades.setSubject(singleSubject);
		
		//compute
		myGrades.computeGrades();
		
		//get
		//allGrades = myGrades.getGrades;
		System.out.println("Your grades: " + myGrades.getGrades());
	}
	
}
