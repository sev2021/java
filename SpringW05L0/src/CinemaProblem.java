public class CinemaProblem {

	//declare vars
	private String username, message;
	private int userage;
	//constructor
	public CinemaProblem() {
		String username = "", message = "";
		userage = 0;
	}
	
	//// INPUT
    //set method
	public void setUsername(String username) {
		this.username = username;
	}
	public void setUserAge(int userage) {
		this.userage = userage;
	}
	
	//// PROCESS
	//compute
	public void computeMessage() {
		if(userage >= 18 ) {
			if(username.equals("Sam")) {
				message = "Welcome, Sam!";
			}
			else {
				message = "Sorry, wrong username.";
			}
		}
		else {
			message = "You must be over 18.";
		}
	}
	
	//get method
	public String getMessage() {
		return message;
	}
}