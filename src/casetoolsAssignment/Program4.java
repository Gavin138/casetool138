package casetoolsAssignment;

import java.util.Scanner;

public class Program4 {

	public static int countDigit(int n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			System.out.print("Number of digits : " + countDigit(n));
		}
		
	}

}
