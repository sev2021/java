/*Create an instantiable class that returns the details of an array of numbers. 
 * The class should contain 3 methods:
 * -1 method that accepts as a parameter an array of integers. This method should also calculate 
 *  the sum of the array and the max value in the array
 * -1 method that returns the max
 * -1 method that returns the sum
*/
import java.util.Scanner;
public class InputArrayApp {
	public static void main(String[] args) {
		////INPUT
		//declare variable and create objects
		InputArray myArray = new InputArray();
		
		//set and compute (method 1)
		System.out.println("Enter array data (integers) separated by coma \",\"");
		Scanner keybInput = new Scanner(System.in);
		myArray.computeMaxSum(keybInput.next());
	
		//get Max method (method 2)
		System.out.println(myArray.getMax());
		//get Max method (method 3)
		System.out.println(myArray.getSum());
	}
}
