import javax.swing.JOptionPane;
public class GuessingGameApp {
	public static void main(String[] args) {
		////INPUT
		//declare variable
		int guessRange, guessTurns, guessNumber;
		//create objects
		GuessingGame myGame = new GuessingGame();
		
		//set
		guessRange = Integer.parseInt(JOptionPane.showInputDialog("What range?")) ;
		myGame.setGuessRange(guessRange);
		
		////PROCESS
		//compute
		myGame.computeNumber();
		
		////OUTPUT
		//get
	}
}
