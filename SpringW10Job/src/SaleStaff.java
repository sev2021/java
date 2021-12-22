public class SaleStaff extends Employee{
	////
	//declare variable
	
	private float commissionRate;
	
	public SaleStaff(float baseSalary) {
		super(baseSalary);
	
	}
	
	@Override
	public String getEmployee() {
		computedSalary *= 1.2;
		
		return super.getEmployee();
	}
}
