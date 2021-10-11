import java.util.Scanner;

public class Convert {
	static public void main(String args[]) {
		
		
		int choice;
		double input, converted;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("1-Celcius to Fahrenheit\n2-Ounces to Grams\n3-Kilos to Lbs");
		choice = keyboard.nextInt();
		System.out.println("Enter amount to be converted:");
		input = keyboard.nextInt();
		
		if(choice == 1) {
			converted = (input * 9/5) + 32;
			System.out.println(input + " degrees Celcious is " + converted + " degrees Fahrenheit");
		}
		else if(choice == 2) {
			converted = input * 28.35;
			System.out.println(input + " ounces is " + converted + " grams");
		}		
		else if(choice == 3) {
			converted = input * 2.205;
			System.out.println(input + " kilos is " + converted + " lbs2");
		}			
		
	}
}
