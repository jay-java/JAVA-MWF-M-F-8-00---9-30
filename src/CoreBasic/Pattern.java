package CoreBasic;

public class Pattern {
	public static void main(String[] args) {
		//1.
		//***
		//***
		//***
		for(int i =1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		//2.
		//*
		//**
		//***
		//****
		//*****
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//3.
//		1
//		12
//		123
//		1234
//		12345
//		1
//		22
//		333
//		4444
//		55555
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
