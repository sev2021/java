/* 99 bottles of beer on the wall, 99 bottles of beer
/* Take one down and pass it around, 98 bottles of beer on the wall
*/

public class L1Bottles {
	public static void main(String args[]) {
		for(int i = 99; i > 2; i--) {
			System.out.println("\n"  + i + " bottles of beer on the wall, " + i + " bottles of beer");
			System.out.println("Take one down and pass it around, " +  (i -1) + " bottles of beer on the wall");
		}
		String threeLastVerses = "\n2 bottles of beer on the wall, 2 bottles of beer\n"
				+ "Take one down and pass it around, 1 bottle of beer on the wall\n"
				+ "\n"
				+ "1 bottle of beer on the wall, 1 bottle of beer\n"
				+ "Take one down and pass it around, no more bottles of beer on the wall\n"
				+ "\n"
				+ "No more bottles of beer on the wall, no more bottles of beer\n"
				+ "Go to the store and buy some more, 99 bottles of beer on the wall";

		System.out.println(threeLastVerses);
		
	}
}
