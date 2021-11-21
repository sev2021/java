public class Battleship {
	////INPUT
	//declare variable
	private int[] seaArray = new int[9];
	private String[] spriteArray = {"~", "x", "~", "#"}; 
	private String message = "Battleship";

	//constructor
	public Battleship() { } 
	
	//set array
	public int[] setSeaArray() {
		//seaArray = new int[9];
		seaArray[(int)(Math.random() * 9)] = 2;
		return seaArray;
	}
		
	////PROCESS
	//
	
	////OUTPUT
	//get array before shoot
	public void printSeaArray() {
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~\n~~~~ "
				+ message + " ~~~~");
		for(int i = 0; i<seaArray.length; i++) {
			System.out.print(" " + spriteArray[seaArray[i]]);
			if((i+1)%3 == 0) System.out.print("\n");
		}
	}
	
	//get array after shoot
	public String shootSeaArray(int row, int col) {
		if(seaArray[(row - 1) * 3 + col -1] == 0) {
			seaArray[(row - 1) * 3 + col -1] = 1;
			message = "YOU MISSED!";
		}
		else if(seaArray[(row - 1) * 3 + col -1] == 2) {
			seaArray[(row - 1) * 3 + col -1] = 3;
			message = "YOU HIT! YOU WIN!";
		}
		else message = "YOU MISSED AGAIN!";
		return message;
	}
	
		

}
