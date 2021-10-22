import java.util.Scanner;
public class Dog {
	private String name;
	private String breed = "boxer";
	int age;
	public Dog() {  //1st empty constructor
		System.out.println("Added object for class Dog");
	}
	public Dog(String dName) {  //2nd constructor with parameter
		name = dName;
		System.out.println("Added object for class Dog and name " + name);
	}

	void setName(String dName) {
		name = dName;
	}
	
	public static void main(String[] args) {
		
		Dog yourDog = new Dog();  //use 1st constructor
		yourDog.age = 12;
		yourDog.setName("Ben");
		System.out.println(yourDog.name);
		
		Dog myDog = new Dog("Rex");  //use 2nd constructor
		System.out.println(myDog.name);
		System.out.println(myDog.breed); //this works because still inside Dog class
	}
}
