/* Create a 3x3 array and put set values into the array.
* 1.       Sum each row
* 2.       Sum each column
* 3.       Sum the entire array
*/
public class ThreByThree {
	public static void main(String[] args) {
		//declare variables
		int[][] intArray = new int[3][3];
		int calcSum = 0;
		
		//set array
		System.out.println("Array 3 x 3 random numbers:\n");
		for(int i=0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				intArray[i][j] = (int)(Math.random() * 10);
				System.out.print("\t" + intArray[i][j] );
			}
			System.out.print("\n\n");
		}
		
		//compute averages
		for(int i=0; i<3; i++) {
			System.out.println("Sum of row " + (i + 1) + " equals: " + (intArray[i][0] + intArray[i][1] + intArray[i][2]));
		}
		for(int i=0; i<3; i++) {
			System.out.println("Sum of column " + (i + 1) + " equals: " + (intArray[0][i] + intArray[1][i] + intArray[2][i]));
		}
		for(int[] i:intArray) {
			for(int j:i) {
				calcSum += j;
			}
		}
		System.out.println("Sum of entire array equals: " + calcSum);
	}
}
