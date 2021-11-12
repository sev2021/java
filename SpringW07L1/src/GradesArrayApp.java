import javax.swing.JOptionPane;
public class GradesArrayApp {
	public static void(String args[]) {
		////INPUT
		//variable declaration
		int subjectsNumbers, singleSubject;
		
		//declare and create objects
		subjectsNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter number of subjects:"));
		GradesArray myGrades = new GradesArray(subjectsNumber);
		
		//set
		singleSubject = Integer.parseInt(JOptionPane.showInputDialog("Enter your subject result:"));
		myGrades.setSubject(singleSubject);
		
		//compute
		myGrades.computeGrades();
		
		//get
		System.out.println(Your grades: myGrades.getGrades);
	}
	
}
