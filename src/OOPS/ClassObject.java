package OOPS;
//1.Class 2.Object 3.Inheritance 4.Polymorphism 5.Abstraction 6.Encapsulation
//3. -> to access property of one class to another class
class A{//Parent
	A(){
		System.out.println("this is default constructor inside A class");
	}
	public void classA() {
		System.out.println("this is class A method");
	}
}
class B extends A{//Child
	public void classB() {
		System.out.println("this is class B method");
	}
}
public class ClassObject {
	public static void main(String[] args) {
		B b = new B();
		b.classB();
		b.classA();
	}
}
