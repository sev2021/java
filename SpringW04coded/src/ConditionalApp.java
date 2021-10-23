import java.util.Scanner;
public class ConditionalApp {
	public static void main(String[] args) {
		//declare vars
		int age;
		String msg;
		Scanner keyboard = new Scanner(System.in);
		//declare and create objects
		Conditional c = new Conditional();
		//set
		age = keyboard.nextInt();
		c.setAge(age);
		//compute
		c.computeMsg();
		//get
		msg = c.getMsg();
		//output
		System.out.println(msg);
		
	}	
}