import javax.swing.JOptionPane;
public class GradesAverageApp {
	public static void main(String[] agrs) {
		////INTPUT
		//declare variables
		int subjectsNumber = 0, subjectGrade;
		//create objects
		GradesAverage calcMyGrades = new GradesAverage ();
		
		//set
		while(subjectsNumber == 0) {
			subjectsNumber = Integer.parseInt(JOptionPane.showInputDialog("How many subjects you have? "));
		}
		calcMyGrades.setSubjectsNumber(subjectsNumber);
		
		////PROCESS ?
		//compute
		for(int i = 0; i < subjectsNumber; i++) {
			subjectGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter grade for subject " + (i+1) + " : "));
			calcMyGrades.setSubjectsArray(subjectGrade, i);
		}
		
		////OUTPUP
		//get
		JOptionPane.showMessageDialog(null, "Average grade: " + calcMyGrades.getFinalGradesAverage());
		JOptionPane.showMessageDialog(null, "Your grades: " + calcMyGrades.getFinalGradesList());
	}
}
