import java.util.Random;
import javax.swing.JOptionPane;
public class GuessingGame {
	////INPUT
	//declare variables
	private int guessRange, guessTries, computerNumber, userNumber;
	private String stringResult = "You loose!";
	private int[] triesArray;
	private Random randGenerator = new Random();
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
	public void computeGuess() {
		computerNumber = randGenerator.nextInt(guessRange) + 1;
		System.out.println(computerNumber); //temporary check
		triesArray = new int[guessTries];
		
		for(int i=0; i<guessTries; i++) {
			userNumber = Integer.parseInt(JOptionPane.showInputDialog(
				 "Guess a number from 1 to " + guessRange));
			triesArray[i] = userNumber; 
			if(userNumber == computerNumber) {
				stringResult = "You win!";
				i = guessTries;
			}
		}
		stringResult += "\nWinning number: " + computerNumber + ".";
	}
	
	////OUTPUT
	//getter method
	public String getResult() {
		return stringResult;
	}
	
	public int[] getTriesArray() {
		return triesArray;
	}

}
