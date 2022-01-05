import javax.swing.JOptionPane;
public class DefPassApp {
	
	public static void main(String[] args) {
		////INPUT
		//declare vars and objects
		String userInput;
		int userNo = 0;
		DefPass myPass = new DefPass();
		
		//set
		userInput = JOptionPane.showInputDialog("Enter name:");
		do {
			userNo = Integer.parseInt(JOptionPane.showInputDialog("Select number 3, 4 or 5:"));
		}
		while(userNo < 3 || userNo > 5);
		
		myPass.setUserInput(userInput, userNo);
		
		////PROCESS
		//compute
		myPass.computeUserInput();
		
		////OUTPUT
		//get
		JOptionPane.showMessageDialog(null, "For name: " + userInput 
				+ "\ndefault password will be:\n" + myPass.getUserInput());
		
		
	}
}
