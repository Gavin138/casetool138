package casetoolsAssignment;

public class Program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c = new Circle(5);
		Triangle t = new Triangle(4,8,3,6,9);
		
		System.out.println("Circle: ");
		c.calculateArea();
		c.calculatePerimeter();
		
		System.out.println("Triangle: ");
		t.calculateArea();
		t.calculatePerimeter();
	}

}

