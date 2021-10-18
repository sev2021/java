//fix the code by figuring out what should be in the **** sections
public class EggBox{
	//vars
	private int eggs;
	private int boxSize;
	private int numBoxes;
	private int leftOverEggs;
	//set
	public void setEggs(int eggs){
		this.eggs = eggs;
	}
	// public void setBoxSize(int ****){  -this coud be anything
	public void setBoxSize(int sevEggs){ 
		this.boxSize = sevEggs;
	}
	//compute
	public void computeBoxes(){
		// numBoxes=eggs/6;   -this should use boxSize instead
		numBoxes = eggs / boxSize;
	}
	public void computeLeftover(){
		leftOverEggs = eggs % boxSize;
	}
	//get
	public int getBoxes(){
		//return boxes;   -never declared
		return numBoxes;
	}
	public int getLeftover(){
		// return leftover;   -never declared
		return leftOverEggs;
	}
}