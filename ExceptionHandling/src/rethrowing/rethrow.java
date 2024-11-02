package rethrowing;

import java.util.Scanner;

public class rethrow {
	public static void main(String []args) {
	shop();
	
	}
static void shop() {
	System.out.println("shoping is startted");
	try {
	pay();
	}
	catch (Exception e){
		System.out.println("exception is handled in shop");
	}
	System.out.println("shoping is ended");
	
	
}
static void pay() throws Exception {
	try {
	System.out.println("payment is started");
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the amount to be paid");
	int amount=scan.nextInt();
	}
	catch(Exception e){
		System.out.println("exception handled in pay method");
		throw e;
		
	}
	System.out.println("payment is completed");
	
}
}
