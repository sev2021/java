import java.util.Scanner;
public class ModuleApp {
	public static void main(String[] args) {
		
		Module[] moduleArray = new Module[5];

		for(int i=0; i<3; i++) {
			Module module = new Module();
			System.out.print("Please enter module name: ");
			module.setName(new Scanner(System.in).next());
			System.out.print("Please enter module marks: ");
			module.setMarks(new Scanner(System.in).nextFloat());	
			moduleArray[i] = module;
		}
		
		for(int i=0; i<3; i++) {
			System.out.println("For module '" + moduleArray[i].getName()
					+ "' marks = " + moduleArray[i].getMarks());
		}
		

	
	}
}
