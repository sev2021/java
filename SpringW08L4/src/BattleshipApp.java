import java.util.Scanner;
public class BattleshipApp{
	public static void main(String[] args) {
		//declare variable
		Battleship newBattle = new Battleship();
		int rowShoot, colShoot;
		String message;
		Scanner keyb = new Scanner(System.in);
		
		//set array
		newBattle.setSeaArray();
		
		//play game
		do {
			newBattle.printSeaArray();  // call to print the sea before shoot
			System.out.print("Enter row to shoot (1 to 3)? ");
			rowShoot = keyb.nextInt();
			System.out.print("Enter column to shoot (1 to 3)? ");
			colShoot = keyb.nextInt();
			System.out.println(">> Shoot on row " + rowShoot + " and column " + colShoot + "! <<");
			message  = newBattle.shootSeaArray(rowShoot, colShoot); // call to shoot the sea
		} while(!message.equals("You HIT! You WIN!"));
	}
}
