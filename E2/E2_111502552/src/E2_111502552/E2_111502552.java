package E2_111502552;

import java.util.Scanner;

public class E2_111502552 {
	public static String info = "1.add 2.query 3.update 4.pay 5.exit";
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Cart cart = new Cart();
		
		String mode;
		while (true) {
			System.out.println(info);
			
			mode = scan.next();
			if (mode.equals("5")) break;
			
			if (mode.equals("1")) {
				System.out.println("input goods id:");
				int id = scan.nextInt();
				
				System.out.println("input goods name:");
				String name = scan.next();
				
				System.out.println("input goods price:");
				int price = scan.nextInt();
				
				System.out.println("input goods num:");
				int num = scan.nextInt();
				
				Good good = new Good(id, name, price, num);
				cart.add(good);
			} else if (mode.equals("2")) {
				cart.query();
			} else if (mode.equals("3")) {
				System.out.println("input goods id:");
				int id = scan.nextInt();
				
				if (!cart.hasGood(id)) {
					System.out.println("not found");
					continue;
				}
				
				System.out.println("input goods new num:");
				int newNum = scan.nextInt();
				
				cart.updates(id, newNum);
			} else if (mode.equals("4")) {
				cart.query();
				cart.pay();
			} else {
				System.out.println("no such function");
			}
		}
		
		scan.close();
	}
}
