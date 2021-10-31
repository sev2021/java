public class NightOut {
	////INPUT
	//declare vars
	private String programmeCode, venueName;
	private int studyYear;
	
	//constructor
	public NightOut() {
		programmeCode = "";
		studyYear = 0;
	}
	
	//set method
	public void setProgrammeCode(String programmeCode) {
		this.programmeCode = programmeCode;
	}
	public void setStudyYear(int studyYear) {
		this.studyYear = studyYear;
	}
	
	////PROCESS
	//compute
	public void computeVenueName() {
		if(studyYear == 1) {
			if(programmeCode.equalsIgnoreCase("HDAIML")) {
				venueName = "Your night out will take place in Lagoona.";
			}
			else if(programmeCode.equalsIgnoreCase("HDBC")) {
				venueName = "Your night out will take place in Harbourmaster.";
			}
			else {
				venueName = "You entered wrong course code.";
			}
		}
		else if(studyYear == 2) {
			if(programmeCode.equalsIgnoreCase("HDAIML")) {
				venueName = "Your night out will take place in Harbourmaster.";
			}
			else if(programmeCode.equalsIgnoreCase("HDBC")) {
				venueName = "Your night out will take place in Lagoona.";
			}
			else {
				venueName = "You entered wrong course code.";
			}
		}
		else {
			venueName = "You entered wrong year of study.";
		}		
	}
	
	////OUTPUT
	//get method
	public String getMessage() {
		return venueName;
	}
}
