package propagation;

import java.util.Scanner;

public class demo {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("calculaton is started");
		System.out.println("enter 1st number");
		int a=scan.nextInt();
		System.out.println("enter 2nd number");
		int b=scan.nextInt();
		multiply(a,b);
		System.out.println("calculation is ended");
	}
		public static void multiply(int a,int b) 
		{
			int mulres=a*b;
			System.out.println("multiply result is  "+mulres);
			divide(a,b);
			System.out.println("multiplication is ended");
		}
		public static void divide(int a,int b) {
			int div=a/b;
			System.out.println("divide result is  "+div);
			System.out.println("division is ended");
	}

}
//we can use try and catch block in divide method to stop exception