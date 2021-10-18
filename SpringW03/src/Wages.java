//variables
//objects
//inputs
//set
//compute
//get
//output
public class Wages {
	//variables
	private double wageMonth, wageYear, wageHour, hoursPerWeek;
	//set
	public void setWageMonth(double wageMonth) {
		this.wageMonth = wageMonth;
	}
	public void setHoursPerWeek(double hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	//compute
	public void computeWageYear() {
		wageYear = wageMonth * 12;
	}
	public void computeWageHour() {
		computeWageYear();
		wageHour = wageYear / hoursPerWeek / 52;
	}
	//get
	public double getWageYear(){
		return wageYear;
	}
	public double getWageHour(){
		return wageHour;
	}

}
