/* Create an app that takes in a String from a user and does the following:
* Assume the String can only take letters spaces and full stops
*  - Counts the letters
*  - Counts vowels
*  - Stores a new String that only contains every second letter
*  -  Stores the positions of each space
*  -  Alters the String so that all vowels are replaced by exclamation points
*/
public class DoString {
	////INPUT
	//declare variable
	private String userInput, newString, evenLetters;
	private int lettersCount, vowelsCount;
	private int[] spacePositions;
	
	//constructor
	public DoString(String userInput) {
		this.userInput = userInput;
	}

	//compute
	public void computeLettersCount() {
		newString = userInput.replaceAll("[ ,.]", "");
		lettersCount  = newString.length();
		
	}
	
	public void computeVowelsCount() {
		newString = userInput.replaceAll("[^aeiouAEIOU]", "");
		vowelsCount  = newString.length();
	}
	
	public void computeEvenLetters() {
		newString = userInput.replaceAll("[ ,.]", "");
		for(int i=1; i<newString.length(); i += 2) {
			evenLetters += newString.charAt(i);
		}
	}
	
	public void computeSpacePositions() {		
		////Positions of each space
		//compute number of spaces inside userInput
		newString = userInput.replaceAll("[^ ]", "");
		//create array to store positions
		spacePositions = new int[newString.length()];
		//find all spaces position inside userInput
		int j = 0; //index for positions array
		for(int i=0; i<userInput.length(); i++) {
			if(userInput.charAt(i) == ' ') {
				spacePositions[j] = i;
				j++;
			}
		}
	}
	
	//get
	public int getLettersCount() {
		return lettersCount;
	}
	public int getVowelsCount() {
		return vowelsCount;
	}
	public String getEvenLetters() {
		return evenLetters;
	}
	public int[] getSpacePositions() {
		return spacePositions;
	}
}
