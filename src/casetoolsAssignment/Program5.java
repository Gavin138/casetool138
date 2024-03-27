package casetoolsAssignment;

import java.util.Scanner;

public class Program5 {

	public int power(int x, int y) {
		if (y == 0) 
			return 1;
		if (y % 2 == 0) 
			return power(x, y / 2) * power(x, y / 2);
		return x * power(x, y / 2) * power(x, y / 2);
	}
	
	public int order(int x) {
		int n = 0;
		while (x != 0) {
			n++;
			x = x / 10;
		}
		return n;
	}
	
	boolean isArmstrong(int x) {
		int n = order(x);
		int temp = x, sum = 0;
		while (temp != 0) {
			int r = temp % 10;
			sum = sum + power(r, n);
			temp = temp / 10;
		}
		return (sum == x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			Program5 ob = new Program5();
			int x = sc.nextInt();
			System.out.println(x + " : " + ob.isArmstrong(x));
			x = sc.nextInt();
			System.out.println(x + " : " + ob.isArmstrong(x));
		}
		
	}

}
