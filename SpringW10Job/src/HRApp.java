import java.util.Scanner;
public class HRApp {
		public static void main(String[] args) {
		////INPUT
		//variable declaration
		String fName, lName;
		int age;
		float baseSalary = 25_000;
		
//		Employee[] empArray = new Employee[3];
//		
//		for(int i=0; i<3; i++ ) {
//			empArray[i] = new Employee(baseSalary);
//			empArray[i].setEmployee(
//					new Scanner(System.in).next(),
//					new Scanner(System.in).next(),
//					new Scanner(System.in).nextInt()					
//					);
//		}
//		
//		for(int i=0; i<3; i++) {
//			//System.out.println(empArray[i].getClass());
//			System.out.println(empArray[i].getEmployee());
//		}
		
		Employee John = new Employee(20_000);
		John.setEmployee("John", "Bravo", 14);
		System.out.println(John.getEmployee());
		
		Employee Jane = new SaleStaff(20_000);
		Jane.setEmployee("Jane", "Beep", 24);
		System.out.println(Jane.getEmployee());
		
		
	}
}
