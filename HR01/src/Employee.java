/* superclass employee
 * setting department, name, age and salary
 */
public class Employee {
	private String fName, lName, department;
	private int age;
	private float baseSalary, calcSalary;
	
	public Employee(String department) {
		this.department = department;
		this.fName = "";
		this.lName = "";
		this.age = -1;
		this.baseSalary = -1;
		this.calcSalary = -1;
	}
	
	public void setEmployee(String fName,
			String lName, int age, float salary) {
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.baseSalary = salary;
				
	}
	
	public String getEmployee() {
		calcSalary = baseSalary;
		return "Employee data"
				+ "\nName: " + fName + " " + lName
				+ "\nDepartment: " + department
				+ "\nAge: " + age
				+ "\nSalary: " + calcSalary;				
	}
	
	
}
