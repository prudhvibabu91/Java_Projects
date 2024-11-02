package ducking;

import java.util.Scanner;

public class duck {
	public static void main(String []args) {
		try {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 1st number");
		int a=scan.nextInt();
		System.out.println("enter 3nd number");
		int b=scan.nextInt();
		divide(a,b);
		}
		catch (Exception e) {
			System.out.println("exception is handled");
		}
	}
	static void divide(int a,int b) throws Exception {
		int div=a/b;
		System.out.println(div);
	}

}
