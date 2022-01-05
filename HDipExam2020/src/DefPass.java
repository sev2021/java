
public class DefPass {
	////INPUT
	//declare variables
	private String userInput, userOutput;
	private int userNo;
	
	public DefPass() {
		userInput = "";
		userNo = 1;
	}
	
	//setter method
	public void setUserInput(String userInput, int userNo) {
		this.userInput = userInput;
		this.userNo = userNo;

	}
	
	//compute method
	public void computeUserInput() {
		userOutput = "";
		//System.out.println(userInput + "-" + userNo); //DEBUG
		for(int i=0; i<userInput.length(); i++) {
			if((i + 1)%userNo != 0) {
				userOutput += userInput.charAt(i);
			}
			
		}
		userOutput = userOutput.replace(" ", "!");
		//System.out.println(userOutput); //DEBUG
	}
	
	//getter method
	public String getUserInput() {
		return userOutput;
	}
}
