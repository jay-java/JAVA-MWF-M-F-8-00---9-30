package OOPS;

import java.util.Scanner;

class Employee {// Pranav
	private int id;
	private String name;

	Employee() {
	}

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "id = "+id+" name = "+name;
	}

//	
//	Scanner sc = new Scanner(System.in);
//	public void setId() {
//		System.out.print("enter id : ");
//		id = sc.nextInt();
//		this.id = id;
//	}
//	public int getId() {
//		return id;
//	}
//	public void setName() {
//		System.out.print("enter name : ");
//		name = sc.next();
//		this.name = name;
//	}
//	public String getName() {
//		return name;
//	}
}

public class Encapsulation {// Romit
	public static void main(String[] args) {
//		Employee e1 = new Employee();
//		e1.setId();
//		//e1.id = 12;
//		System.out.println(e1.getId());
//		e1.setName();
//		//e1.name = "java";
//		System.out.println(e1.getName());
		Employee e1 = new Employee(1, "pranav");
		System.out.println(e1);
		Employee e2 = new Employee(2, "Romit");
		System.out.println(e2);
	}
}
