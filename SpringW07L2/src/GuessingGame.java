import java.util.Random;
public class GuessingGame {
	////INPUT
	//declare variables
	private int guessRange, guessTurns, guessNumber;
	Random randGenerator = new Random();
	//constructor
	public GuessingGame() {}
	
	//setter method
	public void setGuessRange(int guessRange) {
		this.guessRange = guessRange;
	}
	
	////PROCESS ?
	//compute
	public void computeNumber() {
		guessNumber = randGenerator.nextInt(guessRange);
		System.out.print(guessNumber);
	}
	

}
