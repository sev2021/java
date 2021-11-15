import javax.swing.JOptionPane;
public class OneToTenApp {
	public static void main(String[] args) {
		////INPUT
		//declare variable
		int userTry;
		//create object
		OneToTen myOneToTen = new OneToTen();
		
		//set
		userTry = Integer.parseInt(JOptionPane.showInputDialog("Enter number: "));
		myOneToTen.setUserTry(userTry);
		
		////PROCESS
		//compute
		myOneToTen.computeCheckArray();
	}
}
