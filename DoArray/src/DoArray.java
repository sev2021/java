import java.util.*;
public class DoArray {
	
	public static void main(String[] args) {
		String userInput = "", userString = "";
		String[] userArray;
		
		do {
			userInput = new Scanner(System.in).nextLine(); // use nextLine() not just next()!!
			userString += userInput + ",";
		}
		while(!userInput.isEmpty());
			
		userArray = userString.split(",");
		
		System.out.println(Arrays.toString(userArray));
		for(int i=0; i<userArray.length; i++) {
			System.out.println(i + "." + userArray[i] + " " + userArray[i].length());
		}
	}
}
