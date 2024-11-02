package exceptionhandling;

import java.util.Scanner;

public class demo {
	public static void main(String []args) {
		try {
		Scanner scan=new Scanner(System.in);
		System.out.println("program execution started");
		System.out.println("enter 1st number");
		int a=scan.nextInt();
		System.out.println("enter 2nd number");
		int b=scan.nextInt();
		int c=a/b;
		System.out.println(c);
		
		}
		catch(Exception e) {
			System.out.println("exceptio is handled");
		}
		finally {
			System.out.println("program execution is ended");
		}
		

}
}
