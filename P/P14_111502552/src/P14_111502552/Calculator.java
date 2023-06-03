package P14_111502552;

public class Calculator {
	public static String[] ops = { "+", "-", "*", "/" };
	
	public static boolean isValidOp(String s) {
		boolean isValidOp = false;
		for (String op : ops) {
			if (op.equals(s)) {
				isValidOp = true;
				break;
			}
		}
		return isValidOp;
	}
	
	public String op;
	public void setOp(String op) throws Exception {
		if (!isValidOp(op)) throw new Exception();
		this.op = op;
	}
	
	public double calculate(double a, double b) {
		switch (op) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "*":
			return a * b;
		case "/":
			return a / b;
		}
		return 0;
	}
}
