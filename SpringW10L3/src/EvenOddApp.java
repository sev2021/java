import java.util.Scanner;

public class EvenOddApp {
	public static void main(String[] args) {
		////SHORT VERSION
		//declare variable
		String userInput = "", userInputArray = "";
		Scanner keyboard = new Scanner(System.in);
		EvenOdd myEO = new EvenOdd();
		
		////INPUT
		//set array
		do {
			System.out.print("Add number to array [" + userInputArray + "], or press Enter to compute: ");
			userInput = keyboard.nextLine();
			userInputArray += userInput + ", "; 
		}while(userInput != "");
		
		//set mode
		do {
			System.out.print("Select mode: 0 - to get even numbers, 1 - to get odd numbers: ");
			userInput = keyboard.next();
		}while("01".indexOf(userInput) ==  -1);
		
		//set, compute, get
		myEO.doEvenOdd(userInputArray, userInput);
	}
}
