import javax.swing.JOptionPane;

public class Eggs {
	public static void main(String[] args) {
		//Software Development (CIC_OCTOL) Lab2:
		//how many 6-egg boxes the farmer needs to purchase to hold the eggs
		//and how many eggs will be left over
		
		int allEggs, allBoxes, leftEggs;
		
		allEggs = Integer.parseInt(JOptionPane.showInputDialog("Enter a number of eggs"));
		
		leftEggs = allEggs % 6;
		allBoxes = (allEggs - leftEggs) / 6;
		
		JOptionPane.showMessageDialog(null, "Number of boxes needed " + allBoxes);
		JOptionPane.showMessageDialog(null, "Number of eggs left over  " + leftEggs);
		
	}
}
