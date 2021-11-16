/* Create a preset array of numbers. 
 * Create a piece of code that chooses 
 * the largest number from that array
 */
import java.util.Random;
import java.util.Arrays;
public class SortArray {
	////INPUT
	//declare variable
	private int[] arrayToSort; //array declaration - remember to initiate!
	private int arraySize, arrayRange, arrayMax;
	private Random randGenerator = new Random();	
	//constructor
	public SortArray() {}

	//set methods
	public void setArraySize(int arraySize) {
		if(arraySize > 0) this.arraySize = arraySize;
		else this.arraySize = 1;
	}
	public void setArrayRange(int arrayRange) {
		if(arrayRange > 0) this.arrayRange = arrayRange;
		else this.arrayRange = 1;
	}
	
	
	////PROCESS
	//compute
	public void computeMax() {
		arrayToSort = new int[arraySize]; //array initiation
		for(int i=0; i<arraySize; i++) {
			arrayToSort[i] = randGenerator.nextInt(arrayRange) + 1;
			if(arrayToSort[i] > arrayMax) arrayMax = arrayToSort[i];
		}	
	}
	
	
	////OUTPUT
	//get method
	public String getResult() {
		return arrayMax + " is the largest number int this array:\n" + Arrays.toString(arrayToSort);
	}
}
