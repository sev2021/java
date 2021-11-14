import java.util.Random;
public class GuessingGame {
	////INPUT
	//declare variables
	private int guessRange, guessTries, guessNumber;
	private int[] triesArray;
	Random randGenerator = new Random();
	//constructor
	public GuessingGame() {}
	
	//setter methods
	public void setGuessRange(int guessRange) {
		this.guessRange = guessRange;
	}
	public void setGuessTries(int guessTries) {
		this.guessTries = guessTries;
	}
	
	////PROCESS ?
	//compute
	public void computeNumber() {
		guessNumber = randGenerator.nextInt(guessRange);
		while(guessTries>0) {
			System.out.println(guessNumber);
			guessTries --;
		}
	}
	

}
