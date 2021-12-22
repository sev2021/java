import java.util.Scanner;
public class SubjectApp {
	public static void main(String[] args) {
		
		Subject[] subsArray = new Subject[3];
		
//		for(int i=0; i<3; i++) {
//			subsArray[i] = new Subject();
//			subsArray[i].setName(new Scanner(System.in).next());
//			subsArray[i].setGrade(new Scanner(System.in).nextFloat());
//		}
		
		for(int i=0; i<3; i++) {
			subsArray[i] = new Subject(
					new Scanner(System.in).next(),
					new Scanner(System.in).nextFloat()
					);
		}
		
		for(int i=0; i<3; i++) {
			System.out.println(subsArray[i].getGradeInfo());
		}
		
	}
}
