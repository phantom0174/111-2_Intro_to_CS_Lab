// Practice 3
// Name: 蕭登鴻
// Student Number: 111502552
// Course 2023_CE1004_B


package P3_111502552;

import java.util.Scanner;

public class P3_111502552 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please input the goods info id/name/price:");
		Goods good = new Goods(scan.next(), scan.next(), scan.nextInt());
		
		int cmd = 0;
		while (cmd != 3) {
			System.out.println("please input the action 1.show the current price 2.change the price 3.exit the system:");
			cmd = scan.nextInt();
			
			if (cmd == 1) {
				System.out.printf(
					"the current price is %d\n",
					good.getPrice()
				);
			} else if (cmd == 2) {
				System.out.println("please input the new price:");
				good.changePrice(scan.nextInt());
			}
		}
		
		scan.close();
	}
}
