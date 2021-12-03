/* Create an instantiable class that generates 
 * and returns an array of random numbers based on 3 parameters:
 * -How large the array should be
 * -Where the random number range should start
 * -Where the random number range should end
 */
public class RandomArray {
	////INPUT
	//variable declaration
	private int arraySize, arrayStart, arrayEnd;
	private int[] sizeArray;
	//constructor
	public RandomArray() {}
	
	//set
	public void setArraySize(int arraySize) {
		this.arraySize = arraySize;
	}
	public void setArrayStart(int arrayStart) {
		this.arrayStart = arrayStart;

	}
	public void setArrayEnd(int arrayEnd) {
		this.arrayEnd = arrayEnd;
	}
	
	////PROCESS
	//compute array
	public void computeArray() {
		sizeArray = new int[arraySize];
		for(int i=0; i<sizeArray.length; i++) {
			sizeArray[i] = (int)(Math.random() * (arrayEnd - arrayStart + 1)) + arrayStart;
		}
	}
	
	
	////OUTPUT
	//get
	public int[] getSizeArray() {
		return sizeArray;
	}

}

