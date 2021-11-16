/* Create an application that generates an array of 5 random numbers 1-10. 
 * The user should then guess a number and the app will tell them 
 * how many time that number exists within the array.
 */
import java.util.Random;
import java.util.Arrays;
public class OneToTen {
	////INPUT
	//declare variable
	private int[] oneToTenArray = new int[5];
	Random randGenerator = new Random();
	private int userNumber, userMatch = 0;
	//constructor
	public OneToTen() {}
	
	//setter method
	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}
			
	
	////PROCESS
	//compute
	public void computeCheckArray() {
		for(int i=0; i<5; i++) {
			oneToTenArray[i] = randGenerator.nextInt(10) + 1;
			// now is the easiest moment to check to check for number
			// but I presume we were asked to create array first
			// and then check it again - so I amend my code
			// if(oneToTenArray[i] == userNumber) userMatch++;
		}
		for(int i: oneToTenArray) {
			if(i == userNumber) userMatch++;
		}
	}
	
	////OUTPUT
	//getter method
	public  String getResult() {
		System.out.print(Arrays.toString(oneToTenArray));
		return "Number " + userNumber + " exist " + userMatch + " times in my array.";
	}
}
