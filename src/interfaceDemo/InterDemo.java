package interfaceDemo;

class InterCall implements inter1,inter2{
	public void interface3() {
		System.out.println("interface 3");
	}
	public void interface2() {
		System.out.println("interface 2");
	}
	public void interface1() {
		System.out.println("interface 1");
	}
}
public class InterDemo {
	public static void main(String[] args) {
		
		InterCall i = new InterCall();
		i.interface1();
		i.interface2();
		i.interface3();
		i.in
		inter1.interface4();
		inter2.interface5();
		inter3.interface6();
	}
}
