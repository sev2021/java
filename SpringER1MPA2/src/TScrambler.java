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
//		validation
		for(String validString: userInputArray) {
			System.out.println(validString);
			int charOn = validString.indexOf('a');
			if( charOn == -1) System.out.println("BAD Validating!");
			if( validString.indexOf('a', charOn) == -1) System.out.println("BAD Validating!");
			System.out.println("END Validating!");
		}
	}
		
//		validation2
//		for(String validString: userInputArray) {
//			System.out.println("Validate string:" + validString);
//			if(validString.length() - validString.replaceAll(" ", "").length() < 2) {
//				System.out.println("String without at least 2 spaces:" + validString);
//				System.exit(0);
//			}
//		}
	
	
	//getter method
	public String[] getComputedArray() {
		return userInputArray;
	}
	
	
}
