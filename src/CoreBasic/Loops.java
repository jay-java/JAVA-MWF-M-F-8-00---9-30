package CoreBasic;

import java.util.Scanner;

//4 LOOPS
//1.for 2.while 3.do while 4.for each
public class Loops {
	public static void main(String[] args) {
		for(String s:args) {
			System.out.println(s);
		}
		
			
		//for(initialization;condition;incre/decre)
		//++ --
		int i=1;
//		i++;//i=i+1;
//		System.out.println("i = "+i);//2
//		i--;//i=i-1;
//		System.out.println("i = "+i);//1
//		i+=33;//i=i+33
//		System.out.println("i = "+i);//34
//		i-=2;
//		System.out.println("i = "+i);//32
//		i*=2;
//		System.out.println("i = "+i);
		
		for(int j=1;j<=10;j++) {
			System.out.println("j = "+j);
		}
		System.out.println("===========");
		for(int j=10;j>=1;j--) {
			System.out.println("j = "+j);
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("enter num = ");
		int num = sc.nextInt();
		for(int j=1;j<=10;j++) {
			System.out.println(num+" * "+j+" = "+(num*j));
		}
		
		
		System.out.println("-------Using while");
//		while(condition) {
//			statement
//		}
		
		int j=1;
		while(j<=10) {
			System.out.println("j = "+j);
			j++;
		}
		System.out.print("enter num = ");
		int a = sc.nextInt();
		int k=1;
		while(k<=10) {
			System.out.println(a+" * "+k+" = "+(a*k));
			k++;
		}
		System.out.println("-----Using do while");
//		do {
//			statement
//		}
//		while(condition);
		
		int q=1;
		do {
			System.out.println("q = "+q);
			q++;
		}
		while(q<=10);
		
	}
}
