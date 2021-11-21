public class Battleship {
	////INPUT
	//declare variable
	private int[] seaArray = new int[9];
	private String message;

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
	//get array
	public void printSeaArray() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~\n~~~~~~ Battleship ~~~~~~");
		for(int i = 0; i<seaArray.length; i++) {
			System.out.print(" " + seaArray[i]);
			if((i+1)%3 == 0) System.out.print("\n");
		}
	}
	
	public String shootSeaArray(int row, int col) {
		if(seaArray[(row - 1) * 3 + col -1] == 0) {
			seaArray[(row - 1) * 3 + col -1] = 1;
			message = "You missed!";
		}
		else if(seaArray[(row - 1) * 3 + col -1] == 1) {
			message = "You missed again!";
		}
		else message = "You HIT! You WIN!";
		return message;
	}
	
		

}
