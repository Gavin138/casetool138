package casetoolsAssignment;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d1 = new Dog("Miami","Labrador");
		Dog d2 = new Dog("Limboo", "Dalmatian");
		
		d1.setName("Mia");
		d2.setBreed("Indian breed");
		
		System.out.println("Name of Dog 1 = " + d1.getName() + " and breed = " + d1.getBreed());
		System.out.println("Name of Dog 2 = " + d2.getName() + " and breed = " + d2.getBreed());
		
	}

}
