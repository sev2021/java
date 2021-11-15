import java.util.Random;
import java.util.Arrays;
public class OneToTen {
	////INPUT
	//declare variable
	private int[] oneToTenArray = new int[5];
	Random randGenerator = new Random();
	private int userTry;
	//constructor
	public OneToTen() {}
	
	//setter method
	public void setUserTry(int userTry) {
		this.userTry = userTry;
	}
			
	////PROCESS
	//compute
	public void computeCheckArray() {
		for(int i=0; i<5; i++) {
			oneToTenArray[i] = randGenerator.nextInt(10) + 1;
		}
		if(userTry  == oneToTenArray[0]) System.out.println("GOOD " + Arrays.toString(oneToTenArray));
		System.out.println("BAD " + Arrays.toString(oneToTenArray));
	}

}
