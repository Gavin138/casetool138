package casetoolsAssignment;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = add(a, b);
			System.out.println("c = " + c);
		}
	}

	public static int add(int a, int b) {
		return a + b;
	}
	
}
