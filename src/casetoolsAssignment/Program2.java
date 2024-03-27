package casetoolsAssignment;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			int factorial = 1;
			for (int i = 1; i <= num; i++) {
				factorial *= i;
			}
			System.out.println("Factorial of a number = " + factorial);
		}		
	}

}
