public class Cat {
		double weight;
		String color;
	public Cat() {
		weight = 1.5;
		color = "yello";
	}
	
	public void eat() {
		weight += 0.5;
	}
	
	public static void main(String args[]) {
		System.out.println("PPRPRPRON");
		Cat myCat = new Cat();
		myCat.eat();
		System.out.println(myCat.weight);
	}
}
