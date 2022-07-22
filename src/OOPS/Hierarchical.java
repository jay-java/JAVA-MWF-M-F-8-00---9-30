package OOPS;
class Parent{
	public void parentMethod() {
		System.out.println("Parent method");
	}
}
class Child1 extends Parent{
	public void child1Method() {
		System.out.println("Child 1");
	}
}
class Child2 extends Parent{
	public void child2Method() {
		System.out.println("Child 2");
	}
}
class Child3 extends Parent{
	public void child3Method() {
		System.out.println("Child 3");
	}
}
public class Hierarchical {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.parentMethod();
		c1.child1Method();
		Child2 c2 = new Child2();
		c2.parentMethod();
		c2.child2Method();
		Child3 c3 = new Child3();
		c3.parentMethod();
		c3.child3Method();
	}
}
