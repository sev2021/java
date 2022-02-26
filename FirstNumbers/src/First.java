public class First {
	//declare variables
	private int userInput;
	
	public First() {}
	
	public boolean isFirst(int userInput) {
		this.userInput = userInput;
		for(int i = 2; i < (userInput/2); i++) {
			if(userInput % i == 0) return false;
		}
		return true;
	}
}