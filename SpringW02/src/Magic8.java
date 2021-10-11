import java.util.Scanner;

public class Magic8 {
	public static void main(String[] args ) {
		String magic[] = {"Yes", "No", "Not Today", "Try Again"};
		int uInput = 1, randomSelection;
		
		Scanner keyboard = new Scanner(System.in);
		
		while(uInput == 1) {
			System.out.println(magic[(int)(Math.random() * 4)]);
			System.out.println("Play agains? 1-Yes, 2-No");
			uInput = keyboard.nextInt();
	
		}
	}
}
