/* Sales subclass for class Employee */
public class Sales extends Employee{

	public Sales(String department, String objectText) {
		super(department);
		System.out.println(objectText);
	}
	
	@Override
	public String getEmployee() {
		return "We love to sale!\n" + super.getEmployee();
	}

}
