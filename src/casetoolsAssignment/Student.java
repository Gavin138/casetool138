package casetoolsAssignment;
public class Student {

	private String name, address;
	private int age;
	
	public Student() {
		setName("unknown");
		setAge(0);
		setAddress("not available");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setInfo(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}
	
	public void setInfo(String name, int age, String address) {
		this.setName(name);
		this.setAge(age);
		this.setAddress(address);
	}
	
}

