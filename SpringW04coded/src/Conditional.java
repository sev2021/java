public class Conditional {
	//declare vars
	private int age;
	private String msg;
	//constructor
	public Conditional() {
		age = 0;
		msg = "";
	}
	//set method
	public void setAge(int age) {
		this.age = age;
	}
	//compute
	public void computeMsg() {
		if(age>=18 && age<30) {
			msg = "you are over 18";
		}
		else if(age>=30) {
			msg = "you are over 30";
		}
		else {
			msg = "you are under 18";
		}
	}
	//get method
	public String getMsg() {
		return msg;
	}
	
}
