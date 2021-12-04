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
		int arraySum = 0, arrayMax = 0;
		int[] intArray;
		String[] strArray;
		
		Scanner keyb = new Scanner(System.in);
		
		//set method
		strArray = keyb.next().split(",");
		intArray = new int[strArray.length];
		System.out.println(Arrays.toString(strArray) + strArray.length);
		for(int i=0; i<strArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
			arraySum += intArray[i];
			if(i>0 && arrayMax < intArray[i] || i==0) arrayMax = intArray[i];
		}
		System.out.println(Arrays.toString(intArray) + intArray.length + ".." + arraySum + ".." + arrayMax);
	}

}
