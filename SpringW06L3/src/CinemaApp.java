/* system for selecting seats in cinema
 * input: number of seats, row and starting letter
 * process: check availability and add seats according to user input
 * output: display seats layout and overall price
 */

import java.util.Scanner;
public class CinemaApp {
	public static void main(String args[]) {
		////INPUT
		//declare vars
		int inputNumber, inputRow, numberStart; 
		char inputStart;
		
		//declare and create objects
		Scanner keyInput = new Scanner(System.in);
		CinemaSeats  mySeats = new CinemaSeats();
		CharToInt myStart = new CharToInt();
		mySeats.printSeats();
				
		//input from user
		System.out.print("\n\nEnter number of tickets: ");
		inputNumber = keyInput.nextInt();
		System.out.print("Enter row number: ");
		inputRow = keyInput.nextInt();		
		System.out.print("Enter first seat letter: ");
		inputStart = keyInput.next().charAt(0);
		
		////BELOW call for class to translate char input into number
		////it can be done simpler but we try to use "for" loop instead
		numberStart = myStart.getCharToInt(inputStart );
				
		//compute
		mySeats.setSeats(inputNumber, inputRow, numberStart);
		
		////OUTPUT
		mySeats.printSeats();
	}
}
