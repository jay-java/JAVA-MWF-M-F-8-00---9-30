package CoreBasic;

class Student{
	static {
		System.out.println("this is static block inside student class");
	}
	int rollno;
	String name;
	static String cname="TOPS";
	public void setData(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	public void getData() {
		System.out.println("roll no : "+rollno+" name = "+name+" cname = "+cname);
	}
	public static void run() {
		System.out.println("this is run methid inside student class");
	}
	public static void fun() {
		System.out.println("this is fun methid inside student class");
	}
}
public class StaticKeyword {
	static {
		System.out.println("this is static block inside statickeyword class");
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setData(1, "Pranav");
		Student s2 = new Student();
		s2.setData(2, "Ridhish");
		s1.getData();
		s2.getData();
		Student.run();
		Student.fun();
	}
}
