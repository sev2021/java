import java.util.Arrays;
public class EvenOdd {
	private String[] stringArray;
	private int[] intArray;
	private int[] resultArray;
	private int evenSize;

	public int[] doEvenOdd(String userInputArray, String userInput) {
		stringArray = userInputArray.split(",");
		intArray = new int[stringArray.length - 2];
		System.out.println(userInputArray);
		System.out.println(Arrays.toString(stringArray));
		for(int i=0; i<stringArray.length - 2; i++) {
			intArray[i] = Integer.parseInt(stringArray[i].strip()); 
			if(intArray[i] % 2 == 0) evenSize ++;
		}
		if(userInput.equalsIgnoreCase("0")) { //even Resut
			resultArray = new int[evenSize];
			int j = 0;
			for(int i:intArray) {
				if(i%2 == 0) {
					resultArray[j] = i;
					j++;
				}
			}
		}
		
		if(userInput.equalsIgnoreCase("1")) { //odd Resut
			resultArray = new int[intArray.length - evenSize];
			int j = 0;
			for(int i:intArray) {
				if(i%2 == 1) {
					resultArray[j] = i;
					j++;
				}
			}
		}
		
		System.out.println(Arrays.toString(resultArray));
		return resultArray;
	}
}
