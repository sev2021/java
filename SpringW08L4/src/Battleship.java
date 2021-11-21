import java.util.Scanner;
public class Battleship {
	////INPUT
	//declare variable
	private int[] seaArray;
	Scanner keyb = new Scanner(System.in);
	//constructor
	public Battleship() { } 
	
	//set array
	public int[] setSeaArray() {
		seaArray = new int[9];
		seaArray[(int)(Math.random() * 9)] = 2;
		return seaArray;
	}
		
	////PROCESS
	//
	
	////OUTPUT
	//get array
	public void printSeaArray() {
		System.out.println("Battleship");
		for(int i = 0; i<seaArray.length; i++) {
			System.out.print(" " + seaArray[i]);
			if((i+1)%3 == 0) System.out.print("\n");
		}
	}
	
		

}
