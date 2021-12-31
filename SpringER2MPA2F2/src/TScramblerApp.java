//finger warm-up 
import java.util.Scanner;
public class TScramblerApp {
	private String name;
	private int size;
	
	public TScramblerApp() {
		this.name = "";
		this.size = 0;
	}
	
	public void setTScrambler(String name) { //overloaded
		this.name = name;
	}
	public void setTScrambler(int size) { //overloaded
		this.size = size;
	}

	
	public String getTScrambler() {
		return name + " : " + size;
	}
	
	
	public static void main(String[] args) {
		TScramblerApp[] TSA = new TScramblerApp[3];
		
		for(int i=0; i<3; i++) {
			TSA[i] = new TScramblerApp();
			TSA[i].setTScrambler(new Scanner(System.in).next());
			TSA[i].setTScrambler(new Scanner(System.in).nextInt());
		}
		

		
		for(int i=0; i<3; i++) {
			System.out.println(TSA[i].getTScrambler());
		}
	}
}
