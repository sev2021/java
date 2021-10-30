import javax.swing.JOptionPane;
public class BloodApp {
		public static void main(String[] args) {
				////INPUT
				//declare vars
				int userAge;
				String bloodType, message;
				
				//declare and create object
				Blood bloodCheck = new Blood();
				userAge = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
				bloodType = JOptionPane.showInputDialog("What is your blood type?");
				
				
				////PROCESS
				//set
				bloodCheck.setUserAge(userAge);
				bloodCheck.setBloodType(bloodType);
				
				//compute
				bloodCheck.computeMessage();
				
				//get
				message = bloodCheck.getMessage();
				
				
				////OUTPUT
				JOptionPane.showMessageDialog(null, message);
				
		}
}
