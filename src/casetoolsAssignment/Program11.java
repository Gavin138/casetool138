package casetoolsAssignment;
import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String type;
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the type: ");
			type = scan.next();
		}
		
		teacherTeaches t = new teacherTeaches(type,"Ram");
		
		t.Subjects();
	}

}

