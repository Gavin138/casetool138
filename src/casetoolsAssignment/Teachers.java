package casetoolsAssignment;
public class Teachers {

	String type;
	
	public Teachers(String type) {
		this.type= type;
	}
	
	public void Teaches() {
		System.out.println("The teacher is teaching ");
	}
	
}

class teacherTeaches extends Teachers {
	
	String name;
	
	teacherTeaches(String type,String name){
		super(type);
		this.name = name;
	}
	
	void Subjects() {
		System.out.println("The teacher is teaching " + type);
	}
	
}
