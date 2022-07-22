package ExceptionHandleing;
import java.io.IOException;
import java.util.InputMismatchException;
//1.Try
//2.Catch
//3.Finally
//4.Throw
//5.Throws
//There are two types of exception -> 1.Check 2.Unchecked
import java.util.Scanner;
//class Divide{ //Pranav
//	public void division(int a, int b) throws ArithmeticException{
//		System.out.println("division of  a and b = "+(a/b));
//	}
//}

class Test{
	public void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("User age is less than 18");
		}
		else {
			System.out.println("User is eligible");
		}
	}
}
public class ExceptionHandling {//Ridhish
	public static void main(String[] args) {
		try {
			Test t =new Test();
			t.validate(10);
		} catch (ArithmeticException e) {
			System.out.println("error");
		}
		
		
		
		
		
		
		
		
//		try {
//			Divide d = new Divide();
//			d.division(10, 0);
//		} catch (ArithmeticException e) {
//			System.out.println("denominator cannot be zero");
//		}		
		
		
		
		
		
		
		
//		try {
//			Scanner sc  =new Scanner(System.in);
//			System.out.print("enter a = ");
//			int a= sc.nextInt();
//			System.out.print("enter b = ");
//			int b= sc.nextInt();
//			int c = a/b;
//			System.out.println("c = "+c);
//			System.out.println("output perfect");
//			System.exit(0);
//		}catch(Exception e) {
//			System.out.println("error");
////			e.printStackTrace();
//		}
//		finally {
//			System.out.println("finally will executes everytime");
//		}
//		System.out.println("hello");
//		catch (ArithmeticException e) {
//			System.out.println("number cannot divide by zero");
//		}
//		catch(InputMismatchException e) {
//			System.out.println("denominator cannot be string");
//		}
		
	}
}
