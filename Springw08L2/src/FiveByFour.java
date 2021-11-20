import java.util.Scanner;
public class FiveByFour {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String userNumber = keyboard.next();
		
		//System.out.print(Integer.parseInt(userNumber));GIT
		for(int i =0; i < userNumber.length(); i++) System.out.println(userNumber.charAt(i) + "::" + (int)userNumber.charAt(i));
	}
}