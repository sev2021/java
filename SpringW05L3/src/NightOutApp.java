import javax.swing.JOptionPane;
public class NightOutApp {
	public static void main(String[] args) {
		////INPUT
		//declare vars
		String programmeCode, msg;
		int studyYear;
		
		//declare and create object
		NightOut findVenue = new NightOut();
		programmeCode = JOptionPane.showInputDialog("What is your programme code?");
		studyYear = Integer.parseInt(JOptionPane.showInputDialog("What is your year of study?"));
		
		
		////PROCESS
		//set
		findVenue.setProgrammeCode(programmeCode);
		findVenue.setStudyYear(studyYear);
		
		//compute
		findVenue.computeVenueName();
		
		//get
		msg = findVenue.getMessage();
		
		
		////OUTPUT
		JOptionPane.showMessageDialog(null, msg);
	}	
}
