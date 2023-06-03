// Practice 4
// Name: 蕭登鴻
// Student Number: 111502552
// Course 2023_CE1004_B


package P4_111502552;

import java.util.Scanner;

public class P4_111502552 {
	private static Department csie = new Department("CSIE"),
			ee = new Department("EE"),
			math = new Department("MATH");
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cmd = 0;
		while (true) {
			System.out.println("1.add student 2.show the number of students in a department 3.show all the students in a department 4.exit:");
			cmd = scan.nextInt();
			
			if (cmd == 1) {
				System.out.println("Please input the student info name/id/department:");
				
				Student s = new Student(scan.next(), scan.nextInt(), scan.next());
				Department dept_obj = getDept(s.getDept());
				
				dept_obj.addStudent(s);
			} else if (cmd == 2) {
				System.out.println("Please input the department:");
				
				String dept = scan.next();
				System.out.println(getDept(dept).getTotalStudentsInDep());
			} else if (cmd == 3) {
				System.out.println("Please input the department:");
				
				String dept = scan.next();
				getDept(dept).showDepStudents();
			} else break;
		}
		scan.close();
	}
	
	public static Department getDept(String dept) {
		if (dept.equals("CSIE")) {
			return csie;
		} else if (dept.equals("EE")) {
			return ee;
		} else if (dept.equals("MATH")) {
			return math;
		}
		return null;
	}
}
