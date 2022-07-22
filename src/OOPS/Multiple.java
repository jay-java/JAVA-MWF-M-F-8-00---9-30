package OOPS;
class Parent1{
	public void run() {
		System.out.println("Parent 1");
	}
}
class Parent2{
	public void run() {
		System.out.println("Parent 2");
	}
}
class Child extends Parent1,Parent2{
	//we cannot extends more than one class into child class
}
public class Multiple {
	public static void main(String[] args) {
		Child c = new Child();
		c.run();
	}
}
