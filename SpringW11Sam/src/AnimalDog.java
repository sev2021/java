public class AnimalDog extends Animal {
	private String dogName;
	private String[] barkSound = {"Bark!", "Woof!", "Yip!"};
	
	public AnimalDog() {
		dogName = "Stray";
	}
	
	public void setName(String name) {
		dogName = name;
	}
	
	public String getName() {
		return dogName;
	}
	
	public String getSound() {
		
		return barkSound[(int)(Math.random() * 3)];
	}
	
	@Override //this overwrites parent's original method
	public void makeSound(String animalSound) {
		for(int i=0;i<3; i++) {
			// "super." calls for paren'r original method 
			super.makeSound(getSound());
		}
	}
}


