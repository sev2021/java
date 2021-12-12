public class SaleApp {
	public static void main(String[] agrs) {
		SaleItem pens = new SaleItem("pen");
		
		pens.getInfo();
		pens.setStock(20);
		pens.setPrice(1.50);
		pens.getInfo();
		
	}
}
