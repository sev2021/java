public class Dog {
	String name;
	//WE JUST CLASS HIDE CONSTRUCTOR HERE:
	//public Dog() {
	//	name = "Fido";
	//}
	
	public void bark() {
		System.out.println(this.name);
	}
	
	//CLASS IS STILL WORKING!!
	public static void main(String args[]) {
		Dog myDog = new Dog();
		myDog.name = "FFido";
		myDog.bark();
		System.out.println(myDog.name);
		
	}
}


