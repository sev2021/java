/* Write a program that allows a user to enter 5 results for each year of a 4 year course. 
 * The app should:
 * Give an average for each year
 * Give a total average
 */
import java.util.Scanner;
public class FiveByFour {
	////INPUT
	//declare variables and objects
	private int[] averageYears; 
	private int[][] resultsArray;
	Scanner keyb = new Scanner(System.in);
	
	//constructor
	public FiveByFour() {}
	
	//set method
	public void setResultsArray() {
		resultsArray = new int[4][5];
		for(int courseYear=0; courseYear<resultsArray.length; courseYear++) {
			System.out.println("==============================");
			System.out.println("Enter five results for year " + (courseYear + 1) );
			for(int courseResult=0; courseResult<resultsArray[courseYear].length; courseResult++) {
				System.out.print("Enter result of course number " + (courseResult + 1) + ":");
				resultsArray[courseYear][courseResult] = keyb.nextInt();
			}
			System.out.println("End of results for year " + (courseYear + 1)) ;
		}
	}
	
	
	////PROCESS
	//compute method
	public void computeAverage() {
		averageYears = new int[resultsArray.length];  //array of average result for each year
		for(int courseYear=0; courseYear<resultsArray.length; courseYear++) {
			for(int courseResult=0; courseResult<resultsArray[courseYear].length; courseResult++) {
				averageYears[courseYear] += resultsArray[courseYear][courseResult];
			}
			averageYears[courseYear] /= resultsArray[courseYear].length;
		}
	}
	
	
	////OUTPUT
	//get method
	public int[] getAverageYears(){
		return averageYears;
	}
}		