package OOPS;

class Hardware{
	public void keyboard() {
		System.out.println("this is hrdware");
	}
}
class PC extends Hardware{
	public void keyboard() {
		System.out.println("this is pc");
		super.keyboard();
	}
}
public class Overriding {
	public static void main(String[] args) {
		PC p = new PC();
		p.keyboard();
		
	}
}
