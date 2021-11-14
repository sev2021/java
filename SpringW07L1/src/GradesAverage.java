public class GradesAverage {
	////INPUT
	//declare variables
	private int subjectsNumber, subjectGrade, finalGradesAverage = 0;
	private String finalGradesList = "";
	private int[] subjectsArray;
	//constructor
	public GradesAverage() {}
	//setter class
	public void  setSubjectsNumber(int subjectsNumber) {
		this.subjectsNumber = subjectsNumber;
		this.subjectsArray = new int[subjectsNumber];
	}

	////PROCESS ?
	//compute
	public void setSubjectsArray(int subjectGrade, int key) {
		subjectsArray[key] = subjectGrade;
	}
	
	////OUTPUT
	//getters classes
	public int getFinalGradesAverage() {
		for(int i: subjectsArray) {
			finalGradesAverage += i;
		}
		finalGradesAverage /= subjectsArray.length;
		return finalGradesAverage;
	}
	
	public String getFinalGradesList() {
		for(int i=0; i<subjectsArray.length; i++) {
			finalGradesList += "\nSubject " + (i+1) + " : " + subjectsArray[i];
		}
		return finalGradesList;
	}
}
