public class SaleApp { //class app
	public static void main(String[] agrs) {
		SaleItem pen1 = new SaleItem("pen");
		SaleBook book1 = new SaleBook("Java for Dumies", "Bary Burd");
		SaleBook book2 = new SaleBook("C++ for Dumies", "Stephen Davis");
		
		pen1.getInfo();
		pen1.setStock(20);
		pen1.setPrice(1.50);
		pen1.getInfo();
		
		book1.setStock(12);
		book1.setPrice(19.50);
		book1.getInfo();
		
		book2.setStock(3);
		book2.setPrice(9.99);
		book2.getInfo();
		book2.setCondition("used");
		book2.setStock(2);
		book2.getInfo();
		
	}
}
