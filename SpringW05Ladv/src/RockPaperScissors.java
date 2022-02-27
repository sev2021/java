import javax.swing.JOptionPane;
public class RPS {
	public static void main(String[] args) {
		//declare variables
		int playerMove, compMove;
		String result;
		String[] resultArray = {"Rock", "Paper", "Scissors"};
		
		//computer input
		compMove = (int) (Math.random() * 3) + 1;
		System.out.println(compMove); // debug only
		
		//user input
		playerMove = Integer.parseInt(JOptionPane.showInputDialog("Select 1.Rock, 2.Paper, 3.Scissors"));
		System.out.println(playerMove); // debug only
		
		//compute
		if(playerMove == compMove) result = "Draw!";
		else if(playerMove - compMove % 3 == 1) result = "Player win!";
		else result = "Computer win!";
		
		//output
		JOptionPane.showMessageDialog(null, "Computer choice: " + resultArray[compMove - 1]
				+ "\nPlayer choice: " + resultArray[playerMove - 1] + "\n" + result);
		
	}
}
