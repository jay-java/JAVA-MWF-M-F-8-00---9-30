package CoreBasic;

import java.util.Scanner;

//there are 5 conditional statements in java
//1.simple if
//2.if else
//3.nested id
//4.else if ladder
//5.switch
public class ConditionalStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a = ");
		int a = sc.nextInt();
		System.out.print("enter b = ");
		int b = sc.nextInt();
		//1.simple if
		if(a>b) {
			System.out.println("yes a is greater than b");
		}
		
		//2.if else
		if(a>b) {
			System.out.println("yes a is greater than b");
		}
		else {
			System.out.println("No a is not greater than b");
		}
		
		//3.nested if
		System.out.print("enter age : ");
		int age = sc.nextInt();
		if(age > 18) {
			if(age<60) {
				System.out.println("Eligible for blood donate");
			}
			else {
				System.out.println("age is greater than 18 but not less than 60");
			}
		}
		else {
			System.out.println("age is less than 18 so not eligible");
		}
		
		//4.else if ladder
		System.out.println("enter marks : ");
		int marks = sc.nextInt();
		if(marks<35) {
			System.out.println("fail");
		}
		else if(marks>=35 && marks<=50) {
			System.out.println("Pass Class");
		}
		else if(marks>=51 && marks <=70) {
			System.out.println("C grede");
		}
		else if(marks>=71 && marks<=80) {
			System.out.println("B grade");
		}
		else if(marks>=81 && marks<=90) {
			System.out.println("A grade");
		}
		else if(marks>=91 && marks<=100) {
			System.out.println("A+ grade");
		}
		else {
			System.out.println("invalid input");
		}
		
		//5.Switch case
		System.out.println("Press 1 For English\nPress 2 for Hindi\nPress 3 For Gujarati");
		System.out.println("enter your choice : ");
		int lang = sc.nextInt();
		switch(lang) {
			case 1:
				System.out.println("You selected English");
				break;
			case 2:
				System.out.println("You selected Hindi");
				break;
			case 3:
				System.out.println("You selected Gujarati");
				break;
			default:
				System.out.println("Invalid input");
		}
	}
}
