import java.util.Scanner;
public class BattleshipApp{
	public static void main(String[] args) {
		//declare variable
		Battleship newBattle = new Battleship();
		int rowShoot, colShoot;
		Scanner keyb = new Scanner(System.in);
		
		//set array
		newBattle.setSeaArray();
		
		//play game
		for(int i =0; i<3; i++) {
			newBattle.printSeaArray();
			System.out.print("Enter row to shoot (1 to 3)? ");
			rowShoot = keyb.nextInt();
			System.out.print("Enter column to shoot (1 to 3)? ");
			colShoot = keyb.nextInt();
			System.out.println("Shoot on row " + rowShoot + " and column " + colShoot );
		}
	}
}
