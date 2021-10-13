public class Cat {
	
	String name = "Sam", color = "black";
	int age = 3;
	Integer date = 2021; //Integer class is wrapper for primitive
	
	
	public Cat() { //constructor, can't declare but can change
		name = "SamSam";
		age = 33;
	}

	public void chase() {  // Cat class method
		System.out.println("I am only ");
	} // Cat class end
	
	
	public static void main(String[] args) {
		Dog hotDog = new Dog(); // Dog class from file Dog.java
		hotDog.name = "Burito";
		hotDog.bark();

		Cat hotCat = new Cat(); // Local variables, weird photos
		hotCat.chase();
		System.out.println(hotCat.date.toString());
	}
}
