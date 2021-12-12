public class SaleBook extends SaleItem{ //subclass
	//declare variables
	private String title;
	private String author;
	private String condition;
	
	//constructor
	public SaleBook(String title, String author){
		super ("book");
		this.title = title;
		this.author = author;
		this.condition = "new";
	}
	
	//set method
	public void setCondition(String bookCondition) {
		this.condition = bookCondition;
	}
	
	//output
	@Override
	public void getInfo() {
		System.out.println("==== BOOK INFO ====");
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Condition: " + condition);
		super.getInfo();
		
		
	}
}
