import javax.swing.JOptionPane;
public class GuessingGameApp {
	public static void main(String[] args) {
		////INPUT
		//declare variable
		int guessRange, guessTries, guessNumber;
		//create objects
		GuessingGame myGame = new GuessingGame();
		
		//set
		guessRange = Integer.parseInt(JOptionPane.showInputDialog("What range from zero to..?")) ;
		guessTries = Integer.parseInt(JOptionPane.showInputDialog("How many tries?")) ;
		myGame.setGuessRange(guessRange);
		myGame.setGuessTries(guessTries);
		
		////PROCESS
		//compute
		myGame.computeNumber();
		
		////OUTPUT
		//get
	}
}
