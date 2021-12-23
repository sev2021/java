import java.util.Scanner;  //use: new Scanner(System.in).nextLine();
public class HRApp {
	
	public static void main(String[] args) {
		
		Employee[] staffArray = new Employee[3];
		Sales[] salesArray = new Sales[3];
		
//	
//		for(int i=0; i<3; i++) {  // use superclass
//			staffArray[i] = new Employee("General");
//			staffArray[i].setEmployee(new Scanner(System.in).nextLine(),
//					new Scanner(System.in).nextLine(), i, 1000);
//		}
//		
//		for(Employee e: staffArray) System.out.println(e.getEmployee());
	
		for(int i=0; i<3; i++) { //use subclass
			salesArray[i] = new Sales("General", "Add to sales:");
			salesArray[i].setEmployee(new Scanner(System.in).nextLine(),
					new Scanner(System.in).nextLine(), i, 1000);
		}
		
		for(Sales s: salesArray) System.out.println(s.getEmployee());
		
	}
}
