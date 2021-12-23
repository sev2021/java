
public class Sales extends Employee{

	public Sales(String department) {
		super(department);
	}
	
	@Override
	public String getEmployee() {
		return "We love to sale!\n" + super.getEmployee();
	}

}
