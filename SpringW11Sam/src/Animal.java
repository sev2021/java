public class Animal {
	private boolean animalHungry;
	private String animalSound;
	
	public Animal() {
		animalHungry = true;
	}
	
	public void checkHunger() {
		if(animalHungry) System.out.println("This animal looks hungry.");
		else System.out.println("This animal looks satisfied.");
	}
	
	public void feedAnimal() {
		animalHungry = false;
		System.out.println("You fed the animal.");
	}
	
	public void makeSound(String animalSound) {
		System.out.println(animalSound);
	}
}
