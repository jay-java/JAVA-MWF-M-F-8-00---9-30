package CoreBasic;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		for(int i=0;i<=4;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of array : ");
		int size = sc.nextInt();
		int ar[] = new int[size];
		int sum = 0;
		for(int i=0;i<ar.length;i++) {
			System.out.print("enter element at ar["+i+"] : ");
			ar[i] =  sc.nextInt();
			sum = sum+ar[i];
		}
		System.out.println("sum of array elements : "+sum);
		System.out.print("enter number to search in array : ");
		int num = sc.nextInt();
		int counter=0;
		for(int i=0;i<ar.length;i++) {
			if(num == ar[i]) {
				counter++;
			}
		}
		if(counter == 1) {
			System.out.println("yes found");
		}
		else {
			System.out.println("not found");
		}
	}
}
