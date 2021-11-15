import javax.swing.JOptionPane;
import java.util.Arrays;
public class GuessingGameApp {
	public static void main(String[] args) {
		////INPUT
		//declare variable
		int guessRange, guessTries;
		//create objects
		GuessingGame myGame = new GuessingGame();
		
		//set
		guessRange = Integer.parseInt(JOptionPane.showInputDialog("What range from 1 to?")) ;
		guessTries = Integer.parseInt(JOptionPane.showInputDialog("How many tries?")) ;
		myGame.setGuessRange(guessRange);
		myGame.setGuessTries(guessTries);
		
		////PROCESS
		//compute
		myGame.computeGuess();
				
		////OUTPUT
		//get
		JOptionPane.showMessageDialog(null, myGame.getResult());
		JOptionPane.showMessageDialog(null, "Tried numbers: " + Arrays.toString(myGame.getTriesArray()));		
	}
}
