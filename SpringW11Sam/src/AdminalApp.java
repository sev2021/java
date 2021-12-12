
public class AdminalApp {
	public static void main(String[] args) {
		Animal testAnimal = new Animal();
		AnimalDog testDog = new AnimalDog();
		
		testAnimal.makeSound("iiiii");
		testAnimal.checkHunger();
		testAnimal.feedAnimal();
		testAnimal.checkHunger();
		testDog.makeSound(testDog.getSound());
	}
}
