package OOPS;
//Polymorphism
//poly->Many
//morphism->forms
class JAVA{
	public void run() {
		System.out.println("first run method");
	}
	public void run(int i) {
		System.out.println("second run method");
	}
	public void run(String name) {
		System.out.println("third run method"+name);
	}
}
public class Overloading {
	public static void main(String[] args) {
		JAVA j = new JAVA();
		j.run("pranav");
	}
}
