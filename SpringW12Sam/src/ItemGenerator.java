/* MFNA2 (app class)
 * Ask the user at the beginning of the application how many items they would like to create,
 * and ensure that the application enables the user to provide that amount of full 
 * names and for each full name creates the corresponding item.
 * 
 * PASSWORD (instantiable class)
 * The password is created using the following rules:
 * The letters ‘a’, ’e’, and ‘t’ from the given full name
 * will not be used in the password.
 * Each vowel (except ‘a’ and ‘e’ which are eliminated)
 * is going to be added twice.
 * Each space is replaced by the letter ‘S’ followed by a ‘&’ and a ‘?’.
 * All the other characters will remain the same as in the given full name.
 * The password ends with the total number of letters eliminated
 * (i.e. the total number of letters ‘a’, ’e’, and ‘t’ from the given
 * full name that were not used in the password).
 * 
 * F3 (paragraphs array)
 * The method should traverse the array of paragraphs 
 * and calculate the total number of consonants per paragraph.
 * The total number of consonants per paragraph should be stored in an array of numbers.
 * The method should return the computed array of numbers.
 */
public class ItemGenerator {
	////INPUT
	//declare variables Question 1
	private String userItem;
	private String computedItem;
	private int lettersEliminated;
	//declare variables Question 2
	private String[] paragraphsArray;
	private int[] consonantsArray;
	
	//constructor (for default object settings)
	public ItemGenerator() {}
	
	//setter method (to set private variable userItem)
	public void setUserInput(String userItem) {
		this.userItem = userItem;
	}
	
	
	////PROCESS
	//compute method (generate password - Question 1)
	public void computeUserInput() { 
		computedItem = ""; // new password to be generated
		lettersEliminated = 0; // for last password element 
		String lettersToEliminate = "aetAET";
		String vowelsToDouble = "iouIOU";
		
		
		for(int i=0; i<userItem.length(); i++) {  //iterate each letter of input
			
			//password rule 1
			if(lettersToEliminate.indexOf(userItem.charAt(i)) > -1) {
				lettersEliminated ++;
			}
			
			//password rule 2
			else if(vowelsToDouble.indexOf(userItem.charAt(i)) > -1) {
				computedItem += userItem.charAt(i);
				computedItem += userItem.charAt(i);
			}
			
			//password rule 3
			else if(userItem.charAt(i) == ' ') {
				computedItem += "S&?";
			}
			
			//default if no rules in action
			else computedItem += userItem.charAt(i);
			
		}
		// last password element
		computedItem += Integer.toString(lettersEliminated);
		
	}
	
	//set-compute-get method (paragraph array - Question 2)
	public int[] computeParaArray(String[] paragraphArray) { 
		////INPUT
		//declare local variables
		this.paragraphsArray = paragraphArray;
		consonantsArray = new int[paragraphArray.length];
		String vowels = "aeiouAEIOU";

		////PROCESS
		//compute number of consonants in each paragraph
		for(int i=0; i<paragraphsArray.length; i++) { //iterate each paragraph
			for(int j=0; j<paragraphsArray[i].length(); j++) { //iterate each character
				if(vowels.indexOf(paragraphsArray[i].charAt(j)) == -1
						&& Character.isLetter(paragraphsArray[i].charAt(j))) {
					consonantsArray[i] ++;
				}
			}	
		}	
		
		////OUTPUT
		//get array of consonant numbers (Question 2)
		return consonantsArray;
	}
	
	
	////OUTPUT
	//getter method (Question 1)
	public String getUserInput() {
		return computedItem;
	}

}
