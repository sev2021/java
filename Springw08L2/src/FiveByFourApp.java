/* Write a program that allows a user to enter 5 results for each year of a 4 year course. 
 * The app should:
 * Give an average for each year
 * Give a total average
 */
public class FiveByFourApp {
	public static void main(String[] args) {
		////INPUT
		//declare variable
		int averageTotal = 0;
		int[] resultsArray;
		//create objects
		FiveByFour myResults = new FiveByFour();
		
		//set
		myResults.setResultsArray();
		
		////PROCESS
		//compute
		myResults.computeAverage();
		
		////OUTPUT
		//get
		System.out.println("======================================" );
		System.out.println("======== All Average Calculated ========");
		resultsArray = myResults.getAverageYears();
		for(int i=0; i<resultsArray.length; i++) { //iterate over array of each year average
			System.out.println("Average for year " + (i+1) + " equals: " +  resultsArray[i]) ;
			averageTotal += resultsArray[i];
		}
		System.out.println("========================================\n" 
								+ "> All years have the same number of course results,\n" 
								+ "> so all years have the same mean (average) weight,\n" 
								+ "> and Total Average for all years equals sum of all years\n" 
								+ "> results devided by number of all years."); 
		System.out.println("Total average for all years equals: " +  (averageTotal / resultsArray.length));
	}
}
