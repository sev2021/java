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
import javax.swing.JOptionPane;
public class ItemGeneratorApp {
	public static void main(String[] args) {
		////INPUT
		//declare variables Question 1
		int itemsNumber;
		String userItem;
		String computedItem;
		//declare variables Question 2
		int paragraphsNumber;
		String[] paragraphsArray;
		int[] consonantsArray;
		String paragraphResult;
		
		//create object to be used in both Question 1 and Question 2
		ItemGenerator myGenerator = new ItemGenerator(); // create instance of ItemGenerator class
		
		//set + compute + get (generate full names for Question 1)
		////INPUT
		itemsNumber = Integer.parseInt(JOptionPane.showInputDialog("Question 1. How many items \nwould you like to create?"));
		
		//multiple ItemGenerator calls (Question 1)
		for(int i=0; i<itemsNumber; i++) {
			userItem = JOptionPane.showInputDialog("Please enter full name in format \"forename surname\"." 
					+ "\nThis is " + (i+1) + " name of " + itemsNumber + " required.");
			
			//call set method
			myGenerator.setUserInput(userItem);
			
			////PROCESS
			//call compute method
			myGenerator.computeUserInput();
			
			////OUTPUT
			//get computed userInput
			computedItem = myGenerator.getUserInput();
			JOptionPane.showMessageDialog(null, "For name:\n" + userItem + "\ncreated item (password) is:\n" + computedItem);
		}
		
		
		////INPUT
		//set(create paragraph array - Question 2)
		paragraphsNumber = Integer.parseInt(JOptionPane.showInputDialog("Question 2. How many paragraphs \nwould you like to create?"));
		paragraphsArray = new String[paragraphsNumber];
		
		for(int i=0; i<paragraphsNumber; i++) {
			paragraphsArray[i] = JOptionPane.showInputDialog("Please enter paragraph \n(at least one sentence)." 
					+ "\nThis is " + (i+1) + " paragraph of " + paragraphsNumber + " required.");
		}
		
		////PROCESS + OUTPUT
		//compute + get (generate paragraphs consonants array - Question 2)
		consonantsArray = myGenerator.computeParaArray(paragraphsArray);
		paragraphResult = "Number of consonants \nin each of " + paragraphsNumber + " paragrpahs:";
		
		for(int i=0; i<paragraphsNumber; i++) {
			paragraphResult += "\n" + paragraphsArray[i] + " = " + consonantsArray[i];
		}
		
		JOptionPane.showMessageDialog(null, paragraphResult);
		
	}
}

