
public class Subject {
	private String name;
	private float grade;
	
	public Subject() {}
	
	public Subject(String name, float grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGrade(float grade) {
		this.grade = grade;
		
	}
	
	public String getGradeInfo() {
		return "For subject " + name + " grade is " + grade;
	}
}
