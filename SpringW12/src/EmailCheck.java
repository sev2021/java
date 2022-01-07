/*Create an application that takes in 2 pieces of information from a user; 
 * a single email address 
 * and an array of 3 character domain extensions (eg com, edu, org). 
 * These should be taken in as parameters into a single method. 
 * This application only needs 2 methods; 1 that sets and computes and 1 that returns information.
 * The method should then do the following to validate the email address:
 * -Check that there is an @ symbol in the email address
 * -Check that there is a . before the 3 character extension
 * -Ensure that the domain extension is one of the 3 character Strings from the array
 * The method should return a String that states whether or not the email address is valid, and why.
*/
public class EmailCheck {
	////INPUT
	//declare variables
	private String userEmail, userOutput;
	private boolean emailValid;
	private String[] userInputArray;
	
	//constructor
	public EmailCheck() {}
	
	//setter and computer method
	public void computeUserEmail(String userEmail, String[] userInputArray) {
		this.userEmail = userEmail;
		this.userInputArray = userInputArray;
		
		//validate userEmail
		emailValid = true;
		userOutput = "";
		
		
		if(userEmail.indexOf("@") == -1) {
			emailValid = false;
			userOutput += "\n- missing @ symbol in the email address";
		}
		
		if(userEmail.charAt(userEmail.length() - 4) != '.') {
			emailValid = false;
			userOutput += "\n- missing . before the 3 character extension";
		}
		
		int emailExtenNo = 0;
		for(String s: userInputArray) {
			if(s.contains(userEmail.substring(userEmail.length() - 3, userEmail.length()))) {
				emailExtenNo ++;
			}
		}
		if(emailExtenNo == 0) {
			emailValid = false;
			userOutput += "\n- domain extension is not one of \nthe 3 character Strings from the array";			
		}

		//compute final output
		if(emailValid) {
			userOutput = "Email " + userEmail + " is valid."
				+ "\n- there is an @ symbol in the email address"
				+ "\n- there is a . before the 3 character extension"
				+ "\n- domain extension is one of \nthe 3 character Strings from the array";
		}
		else {
			userOutput = "Email " + userEmail + " is not valid." + userOutput;
		}
	}
	
	////OUTPUT
	//getter method
	public String getUserEmail() {
		return userOutput;
	}
		
}
