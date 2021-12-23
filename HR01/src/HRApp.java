import java.util.Scanner;
public class HRApp {
	
	public static void main(String[] args) {
		
		Employee staff = new Employee("General");
		Employee[] staffArray = new Employee[3];
		
		
		for(int i=0; i<3; i++) {
			staffArray[i] = new Employee("General");
			staffArray[i].setEmployee(new Scanner(System.in).next(),
					new Scanner(System.in).next(), i, 1000);
		}
		
		for(Employee e: staffArray) System.out.println(e.getEmployee());
		
		
	}
}
