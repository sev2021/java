
public class Module {
	//declare variable
	String name;
	private float marks;
	
	//constructor
	public Module() {
		this.name = "";
		this.marks = 0.0f;
	}
	
	//constructor_2
	public Module(String name, float marks) {
		this.name = name;
		this.marks = marks;
	}
	
	//set methods
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	//get methods
	public String getName() {
		return this.name;
	}
	public float getMarks() {
		return this.marks;
	}
	
}
