package casetoolsAssignment;

public abstract class Shape {

	abstract void calculateArea();
	abstract void calculatePerimeter();
	
}

class Circle extends Shape{
	
	float r;
	double pi = 3.14,area,perimeter;
	
	Circle(float r){
		this.r = r;
	}
	
	void calculateArea() {
		area = pi * r * r;
		System.out.println("Area = " + area);
	}
	
	void calculatePerimeter() {
		perimeter = 2 * pi * r;
		System.out.println("Perimeter = " + perimeter);
	}
	
}

class Triangle extends Shape{
	
	int base,height,a,b,c,area,perimeter;
	
	Triangle(int base,int height,int a,int b,int c){
		this.base = base;
		this.height = height;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	void calculateArea() {
		area = base * height / 2;
		System.out.println("Area = " + area);
	}
	
	void calculatePerimeter() {
		perimeter = a + b + c;
		System.out.println("Perimeter = " + perimeter);
	}
	
}
