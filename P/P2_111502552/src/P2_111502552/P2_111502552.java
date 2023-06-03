// Practice 2
// Name: 蕭登鴻
// Student Number: 111502552
// Course 2023_CE1004_B

package P2_111502552;

import java.util.Scanner;

public class P2_111502552 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String tar_str = input.next().toLowerCase();
		input.close();

		System.out.println(isRecur(tar_str));
	}

	public static String isRecur(String s) {
		int head = 0, tail = s.length() - 1;

		while (head < tail) {
			final char h = s.charAt(head), t = s.charAt(tail);
			if (h == t) {
				head++;
				tail--;
			} else {
				break;
			}
		}

		if (s.charAt(head) == s.charAt(tail)) {
			return "Yes";
		}

		return "No";
	}
}
