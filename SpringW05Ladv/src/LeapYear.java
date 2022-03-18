import java.time.LocalDate;
public class LeapYear {
	////INPUT
	//declare vars
	private int userYear;
	private String isLeap;
	LocalDate currentDate = LocalDate.now();
	int currentYear = (int)(currentDate.getYear());
	
	//constructor
	public LeapYear() {
		userYear = 0;
		isLeap = "not a";
	}
	
	
	////PROCESS
	//set method
	public void setUserYear(int userYear) {
		this.userYear = userYear;
	}
	
	//compute
	// correct compute: y%4?
	// 		false: notLeap
	//		true: y%100?
	//			false: isLeap
	//			true: y%100?
	//				true: isLeap
	//				false: notLeap
	// see 1st Nov 2021
	public void computeYear() {
		if(userYear % 400 == 0) {
			isLeap = "a";
		}
		else if(userYear % 4 == 0) {
			if(userYear % 100 != 0) {
				isLeap = "a";
			}
		}
	
		if(userYear < currentYear) {
			isLeap = " was " + isLeap;
		}
		else if (userYear > currentYear){
			isLeap =  " will be " + isLeap;
		}
		else {
			isLeap = " is " + isLeap; 
		}
	}
	
	////OUTPUT
	//get method
	public String getUserYear() {
		return isLeap;
	}
}
