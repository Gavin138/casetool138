package employee;

import java.util.Scanner;


//
public class employee {
	
	String name,job_title;
	
	int DA,basicsalary,salary,HRA=5000;
	
	employee(String name,String job_title){
		this.name=name;
		this.job_title=job_title;
		
	}
	int calculate(int sal) {
		basicsalary=sal;
		DA=(basicsalary*10)/100;
		salary=basicsalary+DA+HRA;
		return DA;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float s=scan.nextFloat();
		employee emp = new employee("George","Data Analyst");
		System.out.println("Salary of the employee is:"+ emp.calculate(s));
	}
}
