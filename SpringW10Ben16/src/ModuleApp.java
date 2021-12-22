import java.util.Scanner;
public class ModuleApp {
	public static void main(String[] args) {
		
		Module[] moduleArray = new Module[3];

		
//		for(int i=0; i<3; i++) {  // ORIGINAL SOLUTION
//			//Module module = new Module();
//			
//			System.out.print("Please enter module name: ");
//			moduleArray[i].setName(new Scanner(System.in).next());
//			System.out.print("Please enter module marks: ");
//			moduleArray[i].setMarks(new Scanner(System.in).nextFloat());	
//		
//			moduleArray[i] = new Module();
//		}
		
//		for(int i=0; i<3; i++) {  // SHORT SOLUTION WITHOUT EXTRA VARIABLE
//			moduleArray[i] = new Module();
//			moduleArray[i].setName(new Scanner(System.in).next());
//			moduleArray[i].setMarks(new Scanner(System.in).nextFloat());	
//		}
		
		for(int i=0; i<3; i++) {  // SHORTER USING CONSTRUCTOR_2
			moduleArray[i] = new Module(
					new Scanner(System.in).next(),
					new Scanner(System.in).nextFloat()
					);	
		}
		
		for(int i=0; i<3; i++) {
			System.out.println("For module '" + moduleArray[i].getName()
					+ "' marks = " + moduleArray[i].getMarks());
		}
		

	
	}
}
