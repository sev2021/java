/* - Task:
 * Ask the user at the beginning of the application how many paragraphs they would like to scramble, 
 * and ensure that the application scrambles that amount of sentences. 
 * This should be completed using a graphical interface such as JOptionPane 
 * - Input Validation: 
 * The text must contain at least 2 spaces. . 
 * Validation should take place in the instantiable class and will halt the running 
 *  of the application if validation does not pass
 * - Scrambling:
 * 	Every character that is not a vowel should be replaced by the last 3 digits of your student number. .
 •	This should be hard coded into the application and is not required as user input.
*/
public class TScrambler {
	////INPUT
	//declare variable
	private String[] userInputArray;
	
	
	//constructor
	public TScrambler() {
	}
	
	//setter method
	public void setInputArray(String[] userInputArray) {
		this.userInputArray = userInputArray;
	}
	
	//compute method
	public void computeArray() {
		for(String validString: userInputArray) {
			int valNumber = 0;
			for(int i=0; i<validString.length(); i++) {
				if(validString.charAt(i) == ' ') valNumber ++;
				if(valNumber > 1) break;
			}
			if(valNumber < 2) System.out.println("BAD validation!");
		}
		
//		validation2  // double check for space in string
//		for(String validString: userInputArray) {
//			System.out.println("Validate string:" + validString);
//			int letterOn = validString.indexOf(" ");
//			if(letterOn == -1) System.exit(0);
//			if(validString.indexOf(" ", letterOn) == -1) System.exit(0);
//			System.out.println("GOOD Validating!");
//		}

		
//		validation3  // using strings lengths
//		for(String validString: userInputArray) {
//			System.out.println("Validate string:" + validString);
//			if(validString.length() - validString.replaceAll(" ", "").length() < 2) {
//				System.out.println("String without at least 2 spaces:" + validString);
//				System.exit(0);
//			}
//		}

		String key = "aeiuoAEIUO";  // all vowels
		for(int i=0; i<userInputArray.length; i++) { // iterate each string
			
			for(String s1: userInputArray[i].split("")) { //iterate each letter s1
				if(key.indexOf(s1) == -1) {
					System.out.println("No letter" + s1);
					// replaceAll() below takes only Strings
					// replace() takes only chars so can't be used for "<>"
					userInputArray[i] = userInputArray[i].replaceAll(s1, "<>");
					
				}
				else System.out.println("Letter" + s1 + " at " + key.indexOf(s1));
			}
			
		}
		
	}
	
	//getter method
	public String[] getComputedArray() {
		return userInputArray;
	}
	
	
}
