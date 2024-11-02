package exceptionhandling;

import java.util.Scanner;

public class demo2 {
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
		System.out.println("enter aray size to create");
		int size=scan.nextInt();
		int arr[]=new int[size];
		System.out.println("enter element to store in array");
		int elem=scan.nextInt();
		System.out.println("enter array index where should the element to be stored");
		int index=scan.nextInt();
		arr[index]=elem;
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("program execution is ended");
		}
		

}


}
