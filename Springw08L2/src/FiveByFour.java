import java.util.Scanner;
public class FiveByFour {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String nextResult = "n", userNumber = "";
		
		do {
		System.out.print("Enter string: ");
		userNumber = keyboard.next();
		System.out.print("More? (Y/N) ");
		nextResult = keyboard.next();		
		} while (nextResult.equals("Y"));
		
		for(int i =0; i < userNumber.length(); i++) System.out.println(userNumber.charAt(i) + "::" + (int)userNumber.charAt(i));
	}
}