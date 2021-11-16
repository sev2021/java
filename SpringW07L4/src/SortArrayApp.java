/* Create a preset array of numbers. 
 * Create a piece of code that chooses 
 * the largest number from that array
 */
import javax.swing.JOptionPane;
public class SortArrayApp {
	public static void main(String[] args) {
		////INPUT
		//declare variable
		int arraySize, arrayRange;
		//declare objects
		SortArray findMax = new SortArray();
		
		//set
		do arraySize = Integer.parseInt(JOptionPane.showInputDialog("Enter array size (>0):"));
		while(arraySize < 1); 
		do arrayRange = Integer.parseInt(JOptionPane.showInputDialog("Enter array range from 1 to ?:"));
		while(arrayRange < 1);
		findMax.setArraySize(arraySize);
		findMax.setArrayRange(arrayRange);
		
		
		////PROCESS
		//compute
		findMax.computeMax();
		
		
		////OUTPUT
		//get
		JOptionPane.showMessageDialog(null, findMax.getResult());
	}
}
