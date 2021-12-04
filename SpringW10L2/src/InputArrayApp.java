/*Create an instantiable class that returns the details of an array of numbers. 
 * The class should contain 3 methods:
 * -1 method that accepts as a parameter an array of integers. This method should also calculate 
 *  the sum of the array and the max value in the array
 * -1 method that returns the max
 * -1 method that returns the sum
*/
import java.util.Scanner;
import java.util.Arrays;
public class InputArrayApp {
	public static void main(String[] args) {
		////INPUT
		//declare variable
		int arrayInt, arraySum = 0, arrayMax = 0;
		String[] strArray;
		
		Scanner keyb = new Scanner(System.in);
		
		//set method
		strArray = keyb.next().split(",");
		arrayInt = Integer.parseInt(strArray[0]);
		// no integer array needed - use singular value "arrayInt" instead:
		for(String justString: strArray) {
			arrayInt = Integer.parseInt(justString);
			arraySum += arrayInt;
			if(arrayMax < arrayInt) arrayMax = arrayInt;
		}
		System.out.println(Arrays.toString(strArray) + ".." + arraySum + ".." + arrayMax);
	}
}
