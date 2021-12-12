public class SaleItem {
	//declate variable
	private String name;
	private int stock;
	private double price;
	
	//constructor
	public SaleItem(String name) {
		this.name = name;
		stock = 0;
		price = 0.0;
	}
	
	//set methods
	public void setStock(int newStock) {
		this.stock = newStock;
	}
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}
	
	//get methods
	public int getStock() {
		return stock;
	}
	public double getPrice() {
		return price;
	}
	
	//output
	public void getInfo() {
		System.out.println("We have " + stock + " " + name + "s in stock.");
		System.out.println("Price for " + name + " is " + price);
	}
}
