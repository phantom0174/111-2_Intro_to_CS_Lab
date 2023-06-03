package E2_111502552;

import java.util.ArrayList;

public class Cart {
	public ArrayList<Good> goods = new ArrayList<>();
	
	public String whites(int num) {
		String base = "";
		for (int i = 0; i < num; i++) base += " ";
		return base;
	}
	
	public void add(Good g) {
		this.goods.add(g);
		System.out.printf(
			"your goods:%s is added to the shopping cart\n",
			g.name
		);
	}
	
	public void query() {
		System.out.println("==========shopping cart==========");
		System.out.println("id     name        price      num");
		for (int i = 1; i <= 9; i++) {
			for (Good g: this.goods) {
				if (g.id != i) continue;
				
				int w = 0;
				if (g.price >= 1000) {
					w = 4;
				} else if (g.price >= 100) {
					w = 3;
				} else if (g.price >= 10) {
					w = 2;
				} else {
					w = 1;
				}
				
				System.out.printf(
					"%d      %s" + whites(12 - g.name.length()) + "%d" + whites(11 - w) + "%d\n",
					g.id, g.name, g.price, g.num
				);
				break;
			}
		}
	}
	
	public boolean hasGood(int id) {
		boolean found = false;
		for (Good g: this.goods) {
			if (g.id != id) continue;
			
			found = true;
			break;
		}
		return found;
	}
	
	public void updates(int id, int new_num) {
		for (Good g: this.goods) {
			if (g.id != id) continue;
			
			g.num = new_num;
			break;
		}
		
		System.out.println("finish");
	}
	
	public void pay() {
		int sum = 0;
		for (Good g: this.goods) {
			sum += g.price * g.num;
		}
		System.out.println("total price:" + sum);
	}
}
