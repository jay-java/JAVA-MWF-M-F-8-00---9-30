package CoreBasic;
import java.util.Scanner;
//3 stream
//1.in 2.out 3.err
public class First {
	public static void main(String[] args) {
//		System.out.print("Hello");
//		System.out.print(" hello java");
//		System.out.println("hello java again");
//		System.out.println("hello");
//		int a,b;
//		Scanner obj = new Scanner(System.in);
//		System.out.print("enter a = ");
//		a = obj.nextInt();
//		System.out.print("enter b = ");
//		b = obj.nextInt();
//		System.out.println("a = "+a);
//		System.out.println("b = "+b);
//		System.out.println("division of a and b = "+(a/b));
//		hello h = new hello();
//		h.run();
		Scanner obj = new Scanner(System.in);
		System.out.println("enter float value : ");
		float f = obj.nextFloat();
		System.out.println(f);
		System.out.println("enter percentage : ");
		double d = obj.nextDouble();
		System.out.println(d);
		System.out.print("enter name : ");
		String name = obj.next();
		System.out.println(name);
		System.out.println("enter character : ");
		char c = obj.next().charAt(03);
		System.out.println(c);
		System.out.println("enter long value = :");
		long l = obj.nextLong();
		System.out.println(l);
	}
}
class hello{
	public void run() {
		System.out.println("this is run method in hello class");
	}
}
