public class Battleship2 {
	////INPUT
	//declare variable
	private int[] seaArray = new int[9];  // computer battleship here
	private int[] userArray = new int[9];  // user battleship here (hidden)
	private int[] userCheck = new int[9];  // cells checked by computer 
	private int computerShoot;
	private String[] spriteArray = {"~", "x", "~", "#","U", "#"}; 
	private String message = "Battleship";
	private String compMessage = "Battleship";

	//constructor
	public Battleship2() { } 
	
	//set user array
	public void setUserArray(int row, int col)  {
		userArray[(row - 1) * 3 + col -1] = 4;
	}
	
	//set computer array
	public void setSeaArray() {
		seaArray[(int)(Math.random() * 9)] = 2;
	}
		
	////PROCESS
	//
	
	////OUTPUT
	//get user array before shoot
	public void printUserArray() {
		System.out.println("\n~~~~ "
				+ compMessage + " ~~~~\n~~~ user board ~~~");

		for(int i = 0; i<userArray.length; i++) {
			System.out.print(" " + spriteArray[userArray[i]]);
			if((i+1)%3 == 0) System.out.print("\n");
		}
	}
	
	//get computer array before shoot
	public void printSeaArray() {
		System.out.println("\n~~~~ "
				+ message + " ~~~~\n~~~ computer board ~~~");

		for(int i = 0; i<seaArray.length; i++) {
			System.out.print(" " + spriteArray[seaArray[i]]);
			if((i+1)%3 == 0) System.out.print("\n");
		}
	}
	
	
	//get shoot to user array
	public String shootUserArray() {
		do computerShoot = (int)(Math.random() * 9);
		while(userCheck[computerShoot] == 1);
		userCheck[computerShoot] = 1;
		userArray[computerShoot] += 1;
		compMessage = "COMPUTER MISSED!";
		if(userArray[computerShoot] == 5) {
			compMessage = "COMPUTER HIT YOU!";
		}
		return compMessage;
	}

	
	//get shoot to computer array
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
