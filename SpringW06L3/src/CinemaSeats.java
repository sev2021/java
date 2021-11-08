
public class CinemaSeats {
	////class to display cinema seats layou
	private int seatsNumber, seatsRow, seatsStart;
	
	////CONSTRUCTOR
	public CinemaSeats () {
		this.seatsNumber = 0; 
		this.seatsRow = 0;
		this.seatsStart = 0;
	}
	//set method
	public void setSeats(int seatsNumber, int seatsRow, int seatsStart) {
		this.seatsNumber = seatsNumber; 
		this.seatsRow = seatsRow;
		this.seatsStart = seatsStart;
	}
	
	////PROCESS
	
	////OUTPUT
	public  void printSeats() {
		//11 sets in the row check
		if(seatsStart  + seatsNumber  > 12 ) {
			seatsStart  = 12 - seatsNumber ;
		}
		System.out.print(" \nOdeon Cinema - available seats:\n\t");
		for(char i='a'; i<'l'; i++) {	////LOOP on CHARACTERS 
			System.out.print(i + " ");
		}
		System.out.print("\n");
		for(int i =6; i>0; i--) {  //printing cinema seats
			if(i != seatsRow) System.out.print("\nRow " + i + "\tO O O O O O O O O O O");
			else {
				System.out.print("\nRow " + i  + "\t");
				for(int j = 1; j<seatsStart ; j++ ) System.out.print("O ");
				for(int j = 1; j<=seatsNumber ; j++ ) System.out.print("_ ");
				for(int j = seatsStart  + seatsNumber; j<12; j++ ) System.out.print("O ");
			}
		}
		System.out.print("\n\t\tscreen");
		System.out.print("\n\t\t======");
	}
}
