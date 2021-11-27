public class Reverse {
	////INPUT
	//variable declaration
	private String userInput, reversed, reversedMy = "";
	private StringBuffer strBuff = new StringBuffer();
	
	public Reverse(String userInput) {
		this.userInput = userInput;
	}
	
	public void doReverse() {
		//userInput += userInput;
		for(int i = userInput.length() - 1; i>=0; i-- ) {
			strBuff.append(userInput.charAt(i));
			reversedMy +=userInput.charAt(i);
		}
		reversed = strBuff.toString();
	}
	
	public String getReverse() {
		return reversed;
	}
	public String getReverseMy() {
		return reversedMy;
	}
}
