// Practice 13
// Name: 蕭登鴻
// Student Number: 111502552
// Course 2023_CE1004_B


package P13_111502552;

import java.util.ArrayList;
import java.util.Scanner;


public class P13_111502552 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<BaseCar> drivers = new ArrayList<>();
		ArrayList<BaseCar> winners = new ArrayList<>();
		
		int raceLength = 2000;
		
		int driverNum = scan.nextInt();
		for (int i = 0; i < driverNum; i++) {
			String driverName = scan.next();
			int carType = scan.nextInt();
			
			int dB = driverBoost[((int) driverName.charAt(0)) - 'A'];
			
			BaseCar car;
			if (carType == 1) {
				car = new Benz(driverName, dB);
			} else if (carType == 2) {
				car = new BMW(driverName, dB);
			} else {
				car = new Mazda(driverName, dB);
			}
			
			drivers.add(car);
		}
		
		int gameTick = 0;
		while(true) {
			if (gameTick != 0 && gameTick % 10 == 0) {
				System.out.printf("When %ssec starts, ", gameTick);
				for (BaseCar c: drivers) {
					System.out.printf("%s:%dm ", c.driver, c.curLength);
				}
				System.out.println();
			}
			
			boolean hasWinner = false;
			for (BaseCar c: drivers) {
				c.proceed();
				
				if (c.curLength < raceLength) continue;
				
				hasWinner = true;
				winners.add(c);
			}
			if (hasWinner) break;
			
			gameTick++;
		}
		
		if (winners.size() > 1) System.out.printf("More than 1 winner! ");
		else System.out.printf("%s wins! ", winners.get(0).driver);
		
		for (BaseCar c: drivers) {
			System.out.printf("%s:%dm ", c.driver, c.curLength);
		}
		System.out.println();
		
		scan.close();
	}
	
	public static int[] driverBoost = {
		3, 2, 1, 3, 10, 2, 1
	};
}
