import java.util.Scanner;
public class Battleship2App{
	public static void main(String[] args) {
		//declare variable
		Battleship2 newBattle = new Battleship2();
		int rowShoot, colShoot, rowUser, colUser;
		String message, compMessage;
		Scanner keyb = new Scanner(System.in);
		
		//set user array
		newBattle.printUserArray();
		System.out.print("Enter row to put your battleship (1 to 3)? ");
		rowUser = keyb.nextInt();
		System.out.print("Enter column to put your battleship (1 to 3)? ");
		colUser = keyb.nextInt();
		newBattle.setUserArray(rowUser, colUser);
		
		//set computer array
		newBattle.setSeaArray();
		
		//play game
		do {
			compMessage = newBattle.shootUserArray(); //computer move
			newBattle.printUserArray();
			newBattle.printSeaArray();  // call to print the sea before shoot
			System.out.print("Enter row to shoot (1 to 3)? ");
			rowShoot = keyb.nextInt();
			System.out.print("Enter column to shoot (1 to 3)? ");
			colShoot = keyb.nextInt();
			//System.out.println(">> You shoot on row " + rowShoot + " and column " + colShoot + "! <<");
			message  = newBattle.shootSeaArray(rowShoot, colShoot); // call to shoot the sea
		} while(!message.equals("YOU HIT! YOU WIN!") && !compMessage.equals("COMPUTER HIT YOU!"));
		if(message.equals("YOU HIT! YOU WIN!")) {
			System.out.println("\nCongratulations! You WIN!");
			newBattle.printSeaArray(); 
		}
		else{
			System.out.println("\nComputer win! You lost!");
			newBattle.printUserArray(); 
		}
		
	}
}
