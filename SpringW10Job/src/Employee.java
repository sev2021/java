/* superclass Employee
 * creates a blueprint for all employees
 * sets base pay and under-age rate 80%
 */
public class Employee {
	////INPUT
	//declare variables and objects
	
	public float baseSalary, computedSalary; 
	private String fName, lName;
	private int age;
	
	public Employee(float baseSalary) {
		this.baseSalary = baseSalary;
		this.computedSalary = baseSalary;
		this.fName = "";
		this.lName = "";
		this.age = 0;
	}
	
	//set method
	public void setEmployee(String fName, String lName, int age) {
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		
	}
	
	//get method
	public String getEmployee() {
		if(age < 18) computedSalary *= 0.8;	
		return fName + " " + lName + ", age " + age + " earns " + computedSalary;
	}
	

}