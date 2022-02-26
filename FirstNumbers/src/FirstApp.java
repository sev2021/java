import javax.swing.JOptionPane;
public class FirstApp {
	public static void main(String[] args) {
		//declare variable
		int numb, lastFirst = 2;
		boolean isFirst;
		//create object
		First firstNo = new First();
		
		numb = Integer.parseInt(JOptionPane.showInputDialog("Enter number: "));
		
		// System.out.println(i + "- " + firstNo.isFirst(numb));
		
		for(int i=3; i<numb; i+=2) {
			
			if(firstNo.isFirst(i)) {
				System.out.println(i + " - step - " + (i - lastFirst));
				lastFirst = i;
			}
			
		}
		
		
	}
}