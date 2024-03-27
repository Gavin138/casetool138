package casetoolsAssignment;
public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.setInfo("Atharv", 20, "Margao");
		s2.setInfo("Aaron", 20, "Nuvem");
		s3.setInfo("Axyl", 20, "Curtorim");
		
		System.out.println("Name = " + s1.getName() + ", Age = " + s1.getAge() + ", and Address = " + s1.getAddress());
		System.out.println("Name = " + s2.getName() + ", Age = " + s2.getAge() + ", and Address = " + s2.getAddress());
		System.out.println("Name = " + s3.getName() + ", Age = " + s3.getAge() + ", and Address = " + s3.getAddress());
	}

}

