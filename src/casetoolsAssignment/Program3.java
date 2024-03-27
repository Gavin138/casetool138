package casetoolsAssignment;

import java.util.Scanner;

public class Program3 {

	public static void printFib(int num) {
		if (num < 1) {
			System.out.println("Invalid Number of terms");
			return;
		}
		
		int prev1 = 1;
		int prev2 = 0;
		
		for (int i = 1; i <= num; i++) {
			if (i > 2) {
				int num1 = prev1 + prev2;
				prev2 = prev1;
				prev1 = num1;
				System.out.print(num1 + " ");
			}
			
			if (i == 1)
				System.out.print(prev2 + " ");
			if (i == 2)
				System.out.println(prev1 + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			printFib(num);
		}
		
	}

}
