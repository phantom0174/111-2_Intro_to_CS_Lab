// Practice 14
// Name: 蕭登鴻
// Student Number: 111502552
// Course 2023_CE1004_B


package P14_111502552;

import java.util.Scanner;

public class P14_111502552 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		double a, b;
		String op;
		
		System.out.printf("Enter the first number: ");
		while (true) {
			try {
				a = Double.valueOf(scan.nextLine());
				break;
			} catch (Exception e) {
				System.out.printf("Invalid number! Please enter again: ");
			}
		}
		
		System.out.printf("Enter the operator (+, -, *, or /): ");
		while (true) {
			try {
				op = scan.nextLine();
				calc.setOp(op);
				break;
			} catch (Exception e) {
				System.out.printf("Invalid operator! Please enter again: ");
			}
		}
		
		System.out.printf("Enter the second number: ");
		while (true) {
			try {
				b = Double.valueOf(scan.nextLine());
				if (op.equals("/") && b == 0)
					throw new ArithmeticException();
				break;
			} catch (ArithmeticException e) {
				System.out.println("Divisor cannot be zero!");
				return;
			} catch (Exception e) {
				System.out.printf("Invalid number! Please enter again: ");
			}
		}
		
		System.out.printf("Result: %.1f\n", calc.calculate(a, b));
		scan.close();
	}
}
