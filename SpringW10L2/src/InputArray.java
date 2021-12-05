/*Create an instantiable class that returns the details of an array of numbers. 
 * The class should contain 3 methods:
 * -1 method that accepts as a parameter an array of integers. This method should also calculate 
 *  the sum of the array and the max value in the array
 * -1 method that returns the max
 * -1 method that returns the sum
*/
import java.util.Arrays;
public class InputArray {
	////INPUT
	//declare variable
	private int arrayInt, arraySum = 0, arrayMax = 0;
	private String[] strArray;
	//constructor
	public InputArray() {}
	
	///PROCESS
	//compute Sum and Max
	public void computeMaxSum(String keybInput) { 
		strArray = keybInput.split(",");
		// no integer array needed - use singular value "arrayInt" instead:
		for(String justString: strArray) {
			arrayInt = Integer.parseInt(justString);
			arraySum += arrayInt;
			if(arrayMax < arrayInt) arrayMax = arrayInt;
		}
	}

	////OUTPUT
	//get
	public String getMax() {
		return "Array max is: " + arrayMax;
	}
	public String getSum() {
		return "Array sum is: " + arraySum;
	}
}
