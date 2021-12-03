/* Create an instantiable class that generates 
 * and returns an array of random numbers based on 3 parameters:
 * -How large the array should be
 * -Where the random number range should start
 * -Where the random number range should end
 */
import javax.swing.JOptionPane;
import java.util.Arrays;
public class RandomArrayApp {
	public static void main(String[] args) {
		////IMPORT
		//variable declaration
		int arraySize, arrayStart, arrayEnd;
		//class object initiation
		RandomArray myArray = new RandomArray();
		
		//set methods
		arraySize = Integer.parseInt(JOptionPane.showInputDialog("Enter size: "));
		myArray.setArraySize(arraySize);
		arrayStart = Integer.parseInt(JOptionPane.showInputDialog("Enter start: "));
		myArray.setArrayStart(arrayStart);
		arrayEnd = Integer.parseInt(JOptionPane.showInputDialog("Enter end: "));
		myArray.setArrayEnd(arrayEnd);
		
		////PROCESS
		//compute array
		myArray.computeArray();
		
		////OUTPUT
		JOptionPane.showMessageDialog(null, "This is array: "
				+ "\n" + Arrays.toString(myArray.getSizeArray()));
	}
}
