
public class EvenOdd {
	private String[] stringArray;
	private int[] intArray;
	private int[] resultArray;
	private int evenSize, arrayMode;
	private String userInput;

	////set, compute, get
	public int[] doEvenOdd(String userInputArray, String userInput) {
		//set strings array split from user's input (string of integers)
		stringArray = userInputArray.split(",");
		
		//compute integers array size based on strings array size
		intArray = new int[stringArray.length - 2];
		
		//compute integers array parsed from strings array
		for(int i=0; i<stringArray.length - 2; i++) {
			intArray[i] = Integer.parseInt(stringArray[i].strip()); 
			if(intArray[i] % 2 == 0) evenSize ++;
		}
		
		//set array mode parsed from user's input ("0" or "1")
		this.userInput = userInput;
		arrayMode = Integer.parseInt(userInput);
		
		//compute result array based on integers array and array mode
		resultArray = new int[Math.abs(intArray.length * arrayMode - evenSize)];
		int j = 0;
		for(int i:intArray) {
			if(i%2 == arrayMode) {
				resultArray[j] = i;
				j++;
			}
		}

		//get(return) result array 
		return resultArray;
	}
}
