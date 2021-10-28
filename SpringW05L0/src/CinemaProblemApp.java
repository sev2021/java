import javax.swing.JOptionPane;

public class CinemaProblemApp {
		public static void main(String[] args) {
			//// INPUT
			//declare vars
			String username, message;
			int age;
			//declare and create objects
			CinemaProblem myCinema = new CinemaProblem();
			

			username = JOptionPane.showInputDialog("What is your name?");
			age = Integer.parseInt (JOptionPane.showInputDialog("What is yout age?"));
			
			//// PROCESS
			//set
			myCinema.setUsername(username);
			myCinema.setUserAge(age) ;
			//compute
			myCinema.computeMessage();
			//get
			message = myCinema.getMessage();
			
			//// OUTPUT
			//output
			JOptionPane.showMessageDialog(null, message);
			
			
			
			
			
			
		}
		
}
