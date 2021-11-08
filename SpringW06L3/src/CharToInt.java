
public class CharToInt {
	////class to translate character to number
	private char inChar;
	private int outInt;
	
	///CONSTRUCTOR
	public CharToInt() {
		this.inChar = 'a';
		this.outInt = 1;
	}
	
	////OUTPUT
	public int getCharToInt(char inChar) {
		this.inChar = inChar;
		for(char i='a'; i<='z'; i++) {
			if(i == inChar) {
				return outInt;
			}
			outInt ++;
		}
		return -1;
	}
}
