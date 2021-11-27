import javax.swing.JOptionPane;
public class ReverseApp {
	public static void main(String[] args) {
		////INPUT
		//variable declaration
		String userInput;
		String reversed;
		userInput = JOptionPane.showInputDialog("Enter string to reverse:"); 
		
		//set methods
		Reverse stringReverse = new Reverse(userInput);
	
		////PROCESS
		//compute
		stringReverse.doReverse();
		
		////OUTPUT
		//get method
		JOptionPane.showMessageDialog(null, "StringBuffer and append: " + stringReverse.getReverse()
				+"\nString and concatenate: " + stringReverse.getReverseMy());
	}
}
