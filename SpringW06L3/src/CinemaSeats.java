
public class CinemaSeats {
	public static void main(String args[]) {
		int rowTaken = 2;
		int seatTaken = 5;
		int allTaken = 2;
		System.out.print("\tOdeon Cinema:\n\t");
		for(char i='a'; i<'l'; i++) {	////LOOP on CHRACTERS 
			System.out.print(i + " ");
		}
		System.out.print("\n");
		for(int i =1; i<7; i++) {  //printing cinema seats
			if(i != rowTaken) System.out.print("\nRow " + i + "\tO O O O O O O O O O O");
			else {
				System.out.print("\nRow " + i  + "\t");
				for(int j = 1; j<seatTaken; j++ ) System.out.print("O ");
				for(int j = 1; j<=allTaken; j++ ) System.out.print("_ ");
				for(int j = seatTaken + allTaken; j<12; j++ ) System.out.print("O ");
			}
		}
		System.out.print("\n\t\tscreen");
		System.out.print("\n\t\t______");
	}
}
