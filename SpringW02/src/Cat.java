import javax.swing.JOptionPane;

public class Cat {
	public static void main(String args[]) {
		int x, y, ans;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Enter number:"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Enter number:"));
		
		//create object from class Cat_Instantiable
		Cat_Instantiable myAdd = new Cat_Instantiable();
		
		//send variables to main class
		myAdd.setX(x);
		myAdd.setY(y);
		
		//run calculation in main class
		myAdd.computeAns();
		
		//display results
		System.out.println("Sum of " + x + " + " + y + " = " + myAdd.getAns());
	}
}
