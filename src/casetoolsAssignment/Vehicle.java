package casetoolsAssignment;

public class Vehicle {

	private int horsepower = 50;
	
	public Vehicle(int h) {
		setHorsepower(h);
	}
	
	public void drive() {
		
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	
}

class Car extends Vehicle {
	private static int horsepower = 80;
	private int make;
	
	public Car(int m) {
		super(horsepower);
		setMake(m);
	}
	
	public void drive() {
		super.drive();
	}

	public int getMake() {
		return make;
	}

	public void setMake(int make) {
		this.make = make;
	}
}