//instantiable
public class Cat_Instantiable {
	//declare variables
	private int x, y, ans;
	
	//constructor
	public Cat_Instantiable() {
		x = 0;
		y = 0;
		ans = 0;
	}
	
	//setter
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// compute
	
	public void computeAns() {
		ans = x + y;
	}
	
	// getter
	public int getAns() {
		return ans;
	}
}

