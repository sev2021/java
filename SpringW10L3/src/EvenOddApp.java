import java.util.Arrays;
import java.util.Scanner;

public class EvenOddApp {
	public static void main(String[] args) {
		////SHORT VERSION BASED on LATEST SAM'S VIDEO
		//declare variable, create object
		String userInput = "", userInputArray = "";
		Scanner keyboard = new Scanner(System.in);
		EvenOdd myEO = new EvenOdd();
		int[] resultArray;
		
		////INPUT
		//set user's input array as string of integers
		do {
			System.out.print("Add number to array [" + userInputArray + "], or press Enter to compute: ");
			userInput = keyboard.nextLine();
			userInputArray += userInput + ", "; 
		}while(userInput != "");
		
		//set user's even/odd mode as string "0" or "1"
		do {
			System.out.print("Select mode: 0 - to get even numbers, 1 - to get odd numbers: ");
			userInput = keyboard.next();
		}while("01".indexOf(userInput) ==  -1);
		
		
		//set, compute, get
		resultArray = myEO.doEvenOdd(userInputArray, userInput);
		System.out.println(Arrays.toString(resultArray));
	}
}
