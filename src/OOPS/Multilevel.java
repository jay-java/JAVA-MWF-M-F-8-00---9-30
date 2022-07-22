package OOPS;
class C{
	public void classC() {
		System.out.println("this is class C method inside C class");
	}
}
class D extends C{
	public void classD() {
		System.out.println("this is class D method inside D class");
	}
}
class E extends D{
	public void classE() {
		System.out.println("this is class E method inside E class");
	}
}
public class Multilevel {
	public static void main(String[] args) {
		E e =new E();
		e.classC();
		e.classD();
		e.classE();
		D d = new D();
		d.classC();
		d.classD();
	}
}
