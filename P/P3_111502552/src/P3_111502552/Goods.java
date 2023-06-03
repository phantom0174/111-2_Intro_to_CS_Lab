package P3_111502552;

public class Goods {
	private String id, name;
	private int price;
	
	Goods(String id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void changePrice(int new_price) {
		this.price = new_price;
	}
}
