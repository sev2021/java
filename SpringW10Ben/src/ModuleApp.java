/* Get 5 subjects and grades from student
 * then display them all together
 * from array
 */
import java.util.Scanner;
public class ModuleApp {
	public static void main(String[] agrs) {
		////INPUT
		//declare variable
		Module[] moduleArray = new Module[5]; //declare array of object
		Scanner keyb = new Scanner(System.in);
		
		//set
		for(int i=0; i<moduleArray.length; i++) {
			moduleArray[i] = new Module(); //initiate each object from array
			//moduleArray[i] will not work without initiating!!
			System.out.print("Enter subjet name: ");
			moduleArray[i].setName(keyb.next());
			System.out.print("Enter subjet grade: ");
			moduleArray[i].setGrade(keyb.nextDouble());
		}

		//get
		for(int i=0; i<moduleArray.length; i++) {
			System.out.print("Subject: " + moduleArray[i].getName());
			System.out.println(" - Grade: " + moduleArray[i].getGrade());
			
		}
	}
}
