/* superclass Employee
 * creates a blueprint for all employees
 * sets base pay and under-age rate 80%
 */
public class Employee {
	////INPUT
	//declare variables and objects
	
	private float baseSalary, computedSalary; 
	private String fName, lName;
	private int age;
	
	public Employee(float baseSalary) {
		this.baseSalary = baseSalary;
		this.computedSalary = baseSalary;
	}
	
	//set method
	public void setEmployee(String fName, String lName, int age) {
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		
	}
	
	//get method
	public String getEmployee() {
		System.out.println("Employee: " + fName + " " + lName + " earns " + computedSalary);	
		return "Employee: " + fName + " " + lName + " earns " + computedSalary;
	}
	

}