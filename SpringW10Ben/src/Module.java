/* Get 5 subjects and grades from student
 * then display them all together
 * from array
 */

public class Module {
	////INPUT
	//declare variables
	private String name;
	private double grade;
	
	//constructor
	public Module() {
		this.name = "NN";
		this.grade = 99.0;
	}
	
	//setters
	public void setName (String name) {
		this.name = name;
	}
	public void setGrade (double grade) {
		this.grade = grade;
	}
	
	////OUTPUT
	//getters
	public String getName() {
		return name;
	}
	public double getGrade() {
		return grade;
	}
	
	
}
